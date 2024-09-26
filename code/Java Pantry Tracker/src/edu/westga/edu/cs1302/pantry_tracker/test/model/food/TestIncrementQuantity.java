package edu.westga.edu.cs1302.pantry_tracker.test.model.food;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import edu.westga.edu.cs1302.pantry_tracker.model.Food;

public class TestIncrementQuantity {
	
	@Test
    public void testIncrementQuantity() {
        Food food = new Food("Apple", "Fruit");
        food.incrementQuantity();
        assertEquals(1, food.getQuantity(), "The quantity should be 1 after incrementing.");
    }

   
    @Test
    public void testMultipleIncrements() {
        Food food = new Food("Banana", "Fruit");
        food.incrementQuantity();
        food.incrementQuantity();
        assertEquals(2, food.getQuantity(), "The quantity should be 2 after two increments.");
    }
}
