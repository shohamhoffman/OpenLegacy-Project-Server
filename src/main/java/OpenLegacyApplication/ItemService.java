package OpenLegacyApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// This is the class that interacts with the DB.


@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	
	// Returns a list of all of the items that in the DB to "ItemController" class.
	public List<Item> getAllItems() {
		List<Item> items = new ArrayList<>();
		itemRepository.findAll().forEach(items::add);
		return items;
	}
	
	// Returns an item from the DB to "ItemController" class.
	public Optional<Item> getItem(int itemNo) {
		Optional<Item> item = itemRepository.findById(itemNo);
		return item;
	}
	
	// Checks if the item is already exist in the DB. If not, add that item to the DB.
	public void addItem(Item item) {
		List<Item> items = this.getAllItems();
		for (int i = 0; i < items.size(); i++) {
			if (item.getItemNo() == items.get(i).getItemNo()) {
				return;
			}
		}
		itemRepository.save(item);
	}
	
	// Updates the amount of an item in the DB.
	public void updateItemAmount(int itemNo, int newAmount) {
		Item item = itemRepository.getOne(itemNo);
		item.setAmount(newAmount);
		itemRepository.save(item);
	}
	
	// Deletes an item from the DB.
	public void deleteItem(int itemNo) {
		itemRepository.deleteById(itemNo);
	}

}
