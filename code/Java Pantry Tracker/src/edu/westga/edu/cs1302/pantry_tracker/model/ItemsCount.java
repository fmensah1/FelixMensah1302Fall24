package edu.westga.edu.cs1302.pantry_tracker.model;

	/** Provides utility functions for grade calculations.
	 * 
	 * @author CS 1302
	 * @version Fall 2024
	 */
	public class ItemsCount {
		
		/** Calculates the total quantity of an array of foods.
		 * 
		 * @precondition pantry != null
		 * @postcondition none
		 * 
		 * @param pantry the array of food items to calculate total for
		 * @return total quantity	
		 * 
		 */
		public static int getTotalQuantity(Food[] pantry) {
    	if (pantry == null) {
			throw new IllegalArgumentException("no items provided.");
		}
		if (pantry.length == 0) {
			throw new IllegalArgumentException("no items provided.");
		}
        int totalQuantity = 0;

        for (Food food : pantry) {
            totalQuantity += food.getQuantity();
        }

        return totalQuantity;
    }
}
