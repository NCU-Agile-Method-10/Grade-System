package org.agilemethod.pair10.grade_system;

import java.util.Map;

public class GradeSystem {
    private Map<String, Grade> grades;
    private float weights[];

    public GradeSystem() {
        /*
        construct grades
        for each line of input file
            grade = construct Grade with line
            grades << { grade.id, grade }
         */
    }

    public boolean containsID(String id) {
        /*
        return call grades.containsKey with id
         */
        return true;
    }

    public String getName(String id) {
        /*
        grade = call grades.get with id
        return grade.name
         */
        return "";
    }

    public void showGrade(String id) {
        /*
        grade = call grades.get with id
        print grade
         */
    }

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
