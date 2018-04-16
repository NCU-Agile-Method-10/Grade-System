package org.agilemethod.pair10.grade_system.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.agilemethod.pair10.grade_system.Grade;

public class WhenGrade extends Stage<WhenGrade> {
    @ExpectedScenarioState
    private Grade grade;

    @ProvidedScenarioState
    private float[] weights;

    public WhenGrade scores_are(int lab1, int lab2, int lab3, int midterm, int finalExam) {
        grade.lab1 = lab1;
        grade.lab2 = lab2;
        grade.lab3 = lab3;
        grade.midterm = midterm;
        grade.finalExam = finalExam;
        return self();
    }

    public WhenGrade weights_are(float[] weights) {
        this.weights = weights;
        return self();
    }
}
