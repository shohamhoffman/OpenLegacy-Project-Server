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

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@GetMapping("/items")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}
	
	// Not in use in that project.
	@GetMapping("/items/{itemNo}")
	public Optional<Item> getItem(@PathVariable int itemNo) {
		return itemService.getItem(itemNo);
	}
	
	@PostMapping("/items")
	public Optional<Item> addItem(@RequestBody Item item) {
		itemService.addItem(item);
		return itemService.getItem(item.getItemNo());
	}
	
	@PutMapping("/items/{itemNo}")
	public void updateItemAmount(@RequestBody int newAmount, @PathVariable int itemNo) {
		itemService.updateItemAmount(itemNo, newAmount);
	}
	
	@DeleteMapping("/items/{itemNo}")
	public void deleteItem(@PathVariable int itemNo) {
		itemService.deleteItem(itemNo);
	}
	
}
