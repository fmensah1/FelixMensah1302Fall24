package edu.westga.edu.cs1302.pantry_tracker.test.model.ItemsCount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import edu.westga.edu.cs1302.pantry_tracker.model.Food;
import edu.westga.edu.cs1302.pantry_tracker.model.ItemsCount;

public class TestItemsCount {
	@Test
    public void testGetTotalQuantity() {
        Food food1 = new Food("Apple", "Fruit");
        food1.setQuantity(5);
        Food food2 = new Food("Bread", "Grain");
        food2.setQuantity(3);
        Food food3 = new Food("Chicken", "Meat");
        food3.setQuantity(2);
        Food[] pantry = { food1, food2, food3 };
        int totalQuantity = ItemsCount.getTotalQuantity(pantry);
        assertEquals(10, totalQuantity, "The total quantity should be 10.");
    }

    @Test
    public void testGetTotalQuantityEmptyPantry() {
        Food[] emptyPantry = {};
        assertThrows(IllegalArgumentException.class, () -> {
        	ItemsCount.getTotalQuantity(emptyPantry);
        }); 
    }
}