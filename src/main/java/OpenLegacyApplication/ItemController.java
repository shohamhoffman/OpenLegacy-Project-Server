// Shoham Hoffman Haik
// 206990269

package OpenLegacyApplication;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


// This is the class that maps the url to functions.


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	// Call the "getAllItems" function that in the ItemService class which returns all of the items
	// that in the DB.
	// Then, return the items.
	// This function will be triggered when reaching- "url/items" with a GET request.
	@GetMapping("/items")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}
	
	// Call the "getItem" function that in the ItemService class which returns the item with
	// the id of "itemNo" from the DB.
	// Then, return the item.
	// This function will be triggered when reaching- "url/items/x" with a GET request.
	// x represent the id of the item.
	// Not in use in that project.
	@GetMapping("/items/{itemNo}")
	public Optional<Item> getItem(@PathVariable int itemNo) {
		return itemService.getItem(itemNo);
	}
	
	// Call the "addItem" function that in the ItemService class which adds an item to the DB.
	// Then, call the "getItem" function and return the item that just have been added.
	// This function will be triggered when reaching- "url/items" with a POST request.
	@PostMapping("/items")
	public Optional<Item> addItem(@RequestBody Item item) {
		itemService.addItem(item);
		return itemService.getItem(item.getItemNo());
	}
	
	// Call the "updateItemAmount" function that in the ItemService class which updates the amount of
	// an item in the DB.
	// This function will be triggered when reaching- "url/items/x" with a PUT request.
	@PutMapping("/items/{itemNo}")
	public void updateItemAmount(@RequestBody int newAmount, @PathVariable int itemNo) {
		itemService.updateItemAmount(itemNo, newAmount);
	}
	
	// Call the "deleteItem" function that in the ItemService class which deletes an item from the DB.
	// This function will be triggered when reaching- "url/items/x" with a DELETE request.
	@DeleteMapping("/items/{itemNo}")
	public void deleteItem(@PathVariable int itemNo) {
		itemService.deleteItem(itemNo);
	}
	
}
