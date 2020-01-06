package OpenLegacyApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	
	public List<Item> getAllItems() {
		List<Item> items = new ArrayList<>();
		itemRepository.findAll().forEach(items::add);
		return items;
	}
	
	public Optional<Item> getItem(int itemNo) {
		Optional<Item> item = itemRepository.findById(itemNo);
		return item;
	}
	
	public void addItem(Item item) {
		List<Item> items = this.getAllItems();
		for (int i = 0; i < items.size(); i++) {
			if (item.getItemNo() == items.get(i).getItemNo()) {
				return;
			}
		}
		itemRepository.save(item);
	}
	
	public void updateItemAmount(int itemNo, int newAmount) {
		Item item = itemRepository.getOne(itemNo);
		item.setAmount(newAmount);
		itemRepository.save(item);
	}
	
	public void deleteItem(int itemNo) {
		itemRepository.deleteById(itemNo);
	}

}
