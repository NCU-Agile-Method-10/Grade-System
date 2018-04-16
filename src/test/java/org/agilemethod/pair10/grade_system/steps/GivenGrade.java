package org.agilemethod.pair10.grade_system.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.agilemethod.pair10.grade_system.Grade;

public class GivenGrade extends Stage<GivenGrade> {
    @ProvidedScenarioState
    private Grade grade;

    public GivenGrade a_grade() {
        grade = new Grade();
        return self();
    }
}
