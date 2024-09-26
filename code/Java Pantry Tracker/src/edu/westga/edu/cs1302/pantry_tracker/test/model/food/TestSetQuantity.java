package edu.westga.edu.cs1302.pantry_tracker.test.model.food;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import edu.westga.edu.cs1302.pantry_tracker.model.Food;

	public class TestSetQuantity {
	

	    
	    @Test
	   public void testSetValidQuantity() {
	        Food food = new Food("Apple", "Fruit");
	        food.setQuantity(5);
	        assertEquals(5, food.getQuantity(), "The quantity should be 5.");
	    }

	    
	    @Test
	    public void testSetZeroQuantity() {
	        Food food = new Food("Banana", "Fruit");
	        food.setQuantity(0);
	        assertEquals(0, food.getQuantity(), "The quantity should be 0.");
	    }

	  
	    @Test
	    public void testSetNegativeQuantity() {
	        Food food = new Food("Bread", "Bread");
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            food.setQuantity(-1);
	        });
	        assertEquals("Quantity must not be negative", exception.getMessage(), "Setting a negative quantity should throw an IllegalArgumentException.");
	    }
	}


