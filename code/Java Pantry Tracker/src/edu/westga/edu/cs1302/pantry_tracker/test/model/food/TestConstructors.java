package edu.westga.edu.cs1302.pantry_tracker.test.model.food;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.edu.cs1302.pantry_tracker.model.Food;

public class TestConstructors {

   
    @Test
    public void testValidFoodCreation() {
        Food food = new Food("Tomato", "Vegetable");
        assertEquals("Tomato", food.getName(), "The name should be 'Tomato'.");
        assertEquals("Vegetable", food.getType(), "The type should be 'Vegetable'.");
        assertEquals(0, food.getQuantity(), "The default quantity should be 0.");
    }

 
    @Test
    public void testFoodCreationWithNullName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Food(null, "Meat");
        });
        assertEquals("Name must be provided.", exception.getMessage(), "A null name should throw an IllegalArgumentException.");
    }

   
    @Test
    public void testFoodCreationWithShortName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Food("A", "Fruit");
        });
        assertEquals("Name must have at least 2 characters.", exception.getMessage(), "A name with less than 2 characters should throw an IllegalArgumentException.");
    }

    
    @Test
   public void testFoodCreationWithTwoCharacterName() {
        Food food = new Food("AB", "Ingredient");
        assertEquals("AB", food.getName(), "The name should be 'AB'.");
        assertEquals("Ingredient", food.getType(), "The type should be 'Ingredient'.");
        assertEquals(0, food.getQuantity(), "The default quantity should be 0.");
    }
}
