package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

class TestGetTip {

	public class BillCalculatorTest {

	    @Test
	    public void testGetTip_WithValidItems() {
	        BillItem[] items = {
	            new BillItem("Burger", 10.99),
	            new BillItem("Fries", 3.49),
	            new BillItem("Soda", 1.99)
	        };
	        
	        double expectedTip = (10.99 + 3.49 + 1.99) * 0.2;
	        double actualTip = BillCalculator.getTip(items);
	        
	        assertEquals(expectedTip, actualTip, 0.001);
	    }

	    @Test
	    public void testGetTip_WithNullItems() {
	        BillItem[] items = {
	            new BillItem("Burger", 10.99),
	            null,
	            new BillItem("Fries", 3.49)
	        };
	        
	        double expectedTip = (10.99 + 3.49) * 0.2;
	        double actualTip = BillCalculator.getTip(items);
	        
	        assertEquals(expectedTip, actualTip, 0.001);
	    }

	    @Test
	    public void testGetTip_WithEmptyArray() {
	        BillItem[] items = new BillItem[0];
	        
	        double expectedTip = 0.0 * 0.2; 
	        double actualTip = BillCalculator.getTip(items);
	        
	        assertEquals(expectedTip, actualTip, 0.001);
	    }

	    @Test
	    public void testGetTip_WithAllNullItems() {
	        BillItem[] items = {
	            null,
	            null,
	            null
	        };
	        
	        double expectedTip = 0.0 * 0.2; 
	        double actualTip = BillCalculator.getTip(items);
	        
	        assertEquals(expectedTip, actualTip, 0.001);
	    }
	}
}
