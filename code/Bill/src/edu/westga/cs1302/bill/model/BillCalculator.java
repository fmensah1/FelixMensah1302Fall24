package edu.westga.cs1302.bill.model;

/**
 * Calculate the bill of a list of items
 * 
 * @author felix
 * @version Fall 2024
 */

public class BillCalculator {

	/**
	 * Return the subtotal for the bill
	 * 
	 * @param items the list of items
	 * @return the subtotal for the bill
	 */
	public static double getSubTotal(BillItem[] items) {
		double subTotal = 0.0;
		for (BillItem item : items) {
			if (item != null) {
				subTotal += item.getAmount();
			}
		}
		return subTotal;
	}

	/**
	 * Return the tax for the bill
	 * 
	 * @param items the list of items
	 * 
	 * @return the tax for the bill
	 */
	public static double getTax(BillItem[] items) {
		return getSubTotal(items) * 0.1;
	}

	/**
	 * Return the tip for the bill
	 * 
	 * @param items the list of items
	 * @return the tip for the bill
	 */
	public static double getTip(BillItem[] items) {
		return getSubTotal(items) * 0.2;
	}

	/**
	 * Return the total for the bill
	 * 
	 * @param items the list of items
	 * @return the total for the bill
	 */
	public static double getTotal(BillItem[] items) {
		return getSubTotal(items) + getTax(items) + getTip(items);
	}

}
