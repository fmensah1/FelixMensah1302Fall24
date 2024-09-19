package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;


	public class TestGetSubtotal{

	    @Test
	    public void testGetSubTotal_WithValidItems() {
	        BillItem[] items = {
	            new BillItem("Burger", 10.99),
	            new BillItem("Fries", 3.49),
	            new BillItem("Soda", 1.99)
	        };
	        
	        double expectedSubtotal = 10.99 + 3.49 + 1.99;
	        double actualSubtotal = BillCalculator.getSubTotal(items);
	        
	        assertEquals(expectedSubtotal, actualSubtotal, 0.001);
	    }

	    @Test
	    public void testGetSubTotal_WithNullItems() {
	        BillItem[] items = {
	            new BillItem("Burger", 10.99),
	            null,
	            new BillItem("Fries", 3.49)
	        };
	        
	        double expectedSubtotal = 10.99 + 3.49;
	        double actualSubtotal = BillCalculator.getSubTotal(items);
	        
	        assertEquals(expectedSubtotal, actualSubtotal, 0.001);
	    }

	    @Test
	    public void testGetSubTotal_WithEmptyArray() {
	        BillItem[] items = new BillItem[0];
	        
	        double expectedSubtotal = 0.0;
	        double actualSubtotal = BillCalculator.getSubTotal(items);
	        
	        assertEquals(expectedSubtotal, actualSubtotal, 0.001);
	    }

	    @Test
	    public void testGetSubTotal_WithAllNullItems() {
	        BillItem[] items = {
	            null,
	            null,
	            null
	        };
	        
	        double expectedSubtotal = 0.0;
	        double actualSubtotal = BillCalculator.getSubTotal(items);
	        
	        assertEquals(expectedSubtotal, actualSubtotal, 0.001);
	    }

	    
	}



