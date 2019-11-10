package junit_testing;
import java.util.ArrayList;
import java.util.List;

public class inventory {
	List<InventoryItem> items;
	int weight;
	
	public inventory() {
		weight = 0;
		items = new ArrayList<InventoryItem>();
	}
	
	public boolean addItemToInventory(InventoryItem i) {
		if (weight + i.getWeight() > 250) {
			return false;
		}
		
		weight += i.getWeight();
		
		items.add(i);
		return true;
	}
	
	public boolean dropInventoryItem(InventoryItem i) {
		if (items.contains(i)) {
			items.remove(i);
			return true;
		}
		return false;
	}
	
	public int getWeight() {return weight; }
	public int getCount() {return items.size(); }
	
	public String toString() {
		String ret = "Your inventory has:\n";
		for (InventoryItem i : items) {
			ret = i.toString();
		}
		return ret;
	}
}
