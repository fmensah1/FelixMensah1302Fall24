package edu.westga.cs1302.cms.test.model.gradeCalculator;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.westga.cs1302.cms.model.GradeCalculator;
import edu.westga.cs1302.cms.model.Student;

/**
	 * Test class for GradeCalculator
	 */
	public class TestGradeCalculator {

	    @Test
	    public void testAverageWithEmptyList() {
	        List<Student> students = new ArrayList<>();
	        assertEquals(0, GradeCalculator.computeAverage(students), "The average for an empty list should be 0");
	    }

	    @Test
	    public void testAverageWithOneStudent() {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("John", 80));
	        assertEquals(80, GradeCalculator.computeAverage(students), "The average should be the single student's grade");
	    }

	    @Test
	    public void testAverageWithMultipleStudents() {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("John", 80));
	        students.add(new Student("Jane", 90));
	        students.add(new Student("Alice", 70));
	        assertEquals(80, GradeCalculator.computeAverage(students), "The average should be 80");
	    }

	    @Test
	    public void testNullStudentList() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            GradeCalculator.computeAverage(null);
	        });
	    }
	
}
