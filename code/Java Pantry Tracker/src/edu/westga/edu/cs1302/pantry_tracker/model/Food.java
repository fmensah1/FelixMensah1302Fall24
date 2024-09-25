package edu.westga.edu.cs1302.pantry_tracker.model;

/** Stores and manages information for a single food.
 * 
 * @author felix
 * @version Fall 2024
 */
public class Food {
    
   private final String name;
    private final String type;
    private int quantity;
    
    /**
     *  Create a food student with the specified name.
     *
     * @param name the name of the new food
     * @param type the type of the new food
     * @throws IllegalArgumentException when precondition is violated
     * @precondition name != null && name.length() >= 2
     * @postcondition getName() == name
     */
    public Food(String name, String type) throws IllegalArgumentException {
    	if (name == null) {
			throw new IllegalArgumentException("Name must be provided.");
		}
		if (name.length() < 3) {
			throw new IllegalArgumentException("Name must have at least 2 characters.");
		}
        this.name = name;
        this.type = type;
        this.quantity = 0;  
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gets the quantity.
     *
     * @return the quantity
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Sets the quantity.
     *
     * @param quantity the new quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return this.name + " - " + this.quantity;
    }
}
