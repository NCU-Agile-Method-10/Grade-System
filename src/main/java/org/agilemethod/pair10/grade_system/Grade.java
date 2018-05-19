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
        /*
        none
         */
    }

    public Grade(String[] line) {
        id = line[0];
        name = line[1];
        lab1 = Integer.valueOf(line[2]);
        lab2 = Integer.valueOf(line[3]);
        lab3 = Integer.valueOf(line[4]);
        midterm = Integer.valueOf(line[5]);
        finalExam = Integer.valueOf(line[6]);
    }

    /**
     * Calculates the total grade.
     * @param weights the weights that user want to apply
     * @return total grade
     */
    public int calculateTotalGrade(float[] weights) {
        /*
        totalGrade = calculate total grade by weights
        return totalGrade
         */
        return totalGrade = Math.round(
                lab1 * weights[0] +
                lab2 * weights[1] +
                lab3 * weights[2] +
                midterm * weights[3] +
                finalExam * weights[4]
        );
    }
}
