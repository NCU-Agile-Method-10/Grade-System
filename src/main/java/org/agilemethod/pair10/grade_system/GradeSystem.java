package org.agilemethod.pair10.grade_system;

import java.util.Map;

/**
 * This class stores the students list
 *
 * @version 1.0
 * @since 2018-05-07
 */
public class GradeSystem {
    private Map<String, Grade> grades;
    private float weights[];

    /**
     * Constructs a grade system
     */
    public GradeSystem() {
        /*
        construct grades
        for each line of input file
            grade = construct Grade with line
            grades << { grade.id, grade }
         */
    }

    /**
     * Checks whether the grade system contains the input id
     * @param id user input id
     * @return true/false
     */
    public boolean containsID(String id) {
        /*
        return call grades.containsKey with id
         */
        return true;
    }

    /**
     * Prints the grade
     * @param id user id
     */
    public void showGrade(String id) {
        /*
        grade = call grades.get with id
        print grade
         */
    }
  
    public String getName(String id) {
        /*
        grade = call grades.get with id
        return grade.name
         */
        return "";
    }

    /**
     * Prints the rank
     * @param id user id
     */
    public void showRank(String id) {
        /*
        for each grade in grades
            call grade#calculateTotalGrade
        this_grade = call grades.get with id
        rank = 1
        for each grade in grades
            rank += 1 if this_grade.totalGrade < grade.totalGrade
        return rank
         */
    }

    /**
     * Updates the grade system's weights
     */
    public void updateWeights() {
        /*
        print weights
        new_weights = get new weights by scanner
        print new weights
        if get confirm by scanner
            weights = new_weights
            print message for update weights
        else
            print message for not update weights
         */
    }
}
