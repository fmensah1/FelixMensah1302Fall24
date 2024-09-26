package edu.westga.edu.cs1302.pantry_tracker.test.model.food;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import edu.westga.edu.cs1302.pantry_tracker.model.Food;

public class TestDecrementQuantity {
	@Test
    public void testDecrementQuantityAtZero() {
        Food food = new Food("Rice", "Ingredient");
        food.setQuantity(0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            food.decrementQuantity();
        });
        assertEquals("Quantity cannot be less than 0.", exception.getMessage(), "Decrementing when quantity is 0 should throw an exception.");
    }

    @Test
    public void testIncrementThenDecrement() {
        Food food = new Food("Tomato", "Vegetable");
        food.incrementQuantity();
        food.decrementQuantity();
        assertEquals(0, food.getQuantity(), "The quantity should be back to 0 after incrementing and then decrementing.");
    }
}

