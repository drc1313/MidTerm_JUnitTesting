package junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class inventoryItem_testing {
	
	InventoryItem instance;

	@BeforeEach
	void setUp() throws Exception {
		instance = new InventoryItem("Electronic", 10, "TV", 1);
	}


	@AfterEach
	void tearDown() throws Exception {
		instance = null;
	}

//	Make item and check details to ensure proper attributes
	@Test
	void pass1() {		
		assertEquals("TV type (Electronic), wt: 10", instance.toString());		
	}
	
//	Make item and check amount to ensure the correct number	
	@Test
	void pass2() {
		assertEquals(1, instance.getCount());		
		
	}
	


}
