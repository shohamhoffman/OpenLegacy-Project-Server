package OpenLegacyApplication;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Item {
	
	@Id
	@NotNull
	@Min(1)
	private int itemNo;
	
	@NotBlank
	private String name;
	
	@NotNull
	@Min(0)
	private int amount;
	
	@NotNull
	@Min(0)
	private int inventoryCode;
	
	
	public Item() {
		
	}
	
	public Item(int itemNo, String name, int amount, int inventoryCode) {
		super();
		this.itemNo = itemNo;
		this.name = name;
		this.amount = amount;
		this.inventoryCode = inventoryCode;
	}
	

	public int getItemNo() {
		return itemNo;
	}
	
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getInventoryCode() {
		return inventoryCode;
	}
	
	public void setInventoryCode(int inventoryCode) {
		this.inventoryCode = inventoryCode;
	}

}
