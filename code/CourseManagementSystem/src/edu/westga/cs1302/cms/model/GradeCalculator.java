package edu.westga.cs1302.cms.model;

import java.util.List;

/**
 * This class is responsible for calculating the average grade for a list of students.
 * 
 * @author Felix
 * @version Fall 2024
 */
public class GradeCalculator {
	
   /**
     * Computes the average grade of a list of students.
     * 
     * @param students the list of students
     * @return the average grade, or 0 if the list is empty
     * @throws IllegalArgumentException if the list is null
     */
   public static double computeAverage(List<Student> students) {
        if (students == null) {
            throw new IllegalArgumentException("The list of students cannot be null");
        }

        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }

        return sum / students.size();
    }
}
