package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

public class TestGetTotal {


	    @Test
	    public void testGetTotal_WithValidItems() {
	        BillItem[] items = {
	            new BillItem("Burger", 10.99),
	            new BillItem("Fries", 3.49),
	            new BillItem("Soda", 1.99)
	        };
	        
	        double expectedSubTotal = 10.99 + 3.49 + 1.99;
	        double expectedTax = expectedSubTotal * 0.1;  // Assuming tax is 10%
	        double expectedTip = expectedSubTotal * 0.2;  // Assuming tip is 20%
	        double expectedTotal = expectedSubTotal + expectedTax + expectedTip;
	        
	        double actualTotal = BillCalculator.getTotal(items);
	        
	        assertEquals(expectedTotal, actualTotal, 0.001);
	    }

	    @Test
	    public void testGetTotal_WithNullItems() {
	        BillItem[] items = {
	            new BillItem("Burger", 10.99),
	            null,
	            new BillItem("Fries", 3.49)
	        };
	        
	        double expectedSubTotal = 10.99 + 3.49;
	        double expectedTax = expectedSubTotal * 0.1;  // Tax is 10%
	        double expectedTip = expectedSubTotal * 0.2;  // Tip is 20%
	        double expectedTotal = expectedSubTotal + expectedTax + expectedTip;
	        
	        double actualTotal = BillCalculator.getTotal(items);
	        
	        assertEquals(expectedTotal, actualTotal, 0.001);
	    }

	    @Test
	    public void testGetTotal_WithEmptyArray() {
	        BillItem[] items = new BillItem[0];
	        
	        double expectedTotal = 0.0;  // No items, so total should be 0
	        double actualTotal = BillCalculator.getTotal(items);
	        
	        assertEquals(expectedTotal, actualTotal, 0.001);
	    }

	    @Test
	    public void testGetTotal_WithAllNullItems() {
	        BillItem[] items = {
	            null,
	            null,
	            null
	        };
	        
	        double expectedTotal = 0.0;  // All null items, so total should be 0
	        double actualTotal = BillCalculator.getTotal(items);
	        
	        assertEquals(expectedTotal, actualTotal, 0.001);
	    }

	    
	}



