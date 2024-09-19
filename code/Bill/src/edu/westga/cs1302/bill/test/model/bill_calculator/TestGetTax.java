package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

class TestGetTax {
	 @Test
	    public void testGetTax_WithValidItems() {
	        BillItem[] items = {
	            new BillItem("Burger", 10.99),
	            new BillItem("Fries", 3.49),
	            new BillItem("Soda", 1.99)
	        };
	        
	        double expectedTax = (10.99 + 3.49 + 1.99) * 0.1;
	        double actualTax = BillCalculator.getTax(items);
	        
	        assertEquals(expectedTax, actualTax, 0.001);
	    }

	    @Test
	    public void testGetTax_WithNullItems() {
	        BillItem[] items = {
	            new BillItem("Burger", 10.99),
	            null,
	            new BillItem("Fries", 3.49)
	        };
	        
	        double expectedTax = (10.99 + 3.49) * 0.1;
	        double actualTax = BillCalculator.getTax(items);
	        
	        assertEquals(expectedTax, actualTax, 0.001);
	    }

	    @Test
	    public void testGetTax_WithEmptyArray() {
	        BillItem[] items = new BillItem[0];
	        
	        double expectedTax = 0.0 * 0.1; // Tax on $0 is $0
	        double actualTax = BillCalculator.getTax(items);
	        
	        assertEquals(expectedTax, actualTax, 0.001);
	    }

	    @Test
	    public void testGetTax_WithAllNullItems() {
	        BillItem[] items = {
	            null,
	            null,
	            null
	        };
	        
	        double expectedTax = 0.0 * 0.1; 
	        double actualTax = BillCalculator.getTax(items);
	        
	        assertEquals(expectedTax, actualTax, 0.001);
	    }

	 }

