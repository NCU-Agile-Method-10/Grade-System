package org.agilemethod.pair10.grade_system;

/**
 *
 * Data structure for grade
 *
 *
 * @version 1.0
 * @since 2018-05-07
 */
public class Grade {
    public String name, id;
    public int lab1, lab2, lab3, midterm, finalExam, totalGrade;

    /**
     * Constructs a grade.
     */
    public Grade() {

    }

    /**
     * Calculates the total grade.
     * @param weights the weights that user want to apply
     * @return total grade
     */
    public int calculateTotalGrade(float[] weights) {
        return 0;
    }
}
