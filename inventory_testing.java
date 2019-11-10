package junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class inventory_testing {
	
	inventory instance;

	@BeforeEach
	void setUp() throws Exception {
		instance = new inventory();
	}


	@AfterEach
	void tearDown() throws Exception {
		instance = null;
	}

//	Add item to inventory and check to make sure the weight is correct
	@Test
	void pass1() {
		InventoryItem i = new InventoryItem("Electronic", 10, "TV", 1);
		instance.addItemToInventory(i);
		assertEquals(10,instance.getWeight());		
	}
	
//	Add item to inventory then remove it and check to make sure the weight is correct
	@Test
	void fail() {
		InventoryItem i = new InventoryItem("Electronic", 10, "TV", 1);		
		instance.addItemToInventory(i);
		instance.dropInventoryItem(i);
		assertEquals(0,instance.getWeight());			
	}
	


}
