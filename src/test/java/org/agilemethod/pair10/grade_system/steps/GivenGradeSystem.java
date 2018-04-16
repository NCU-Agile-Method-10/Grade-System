package org.agilemethod.pair10.grade_system.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.agilemethod.pair10.grade_system.GradeSystem;

public class GivenGradeSystem extends Stage<GivenGradeSystem> {
    @ProvidedScenarioState
    private GradeSystem gradeSystem;

    public GivenGradeSystem a_grade_system() {
        gradeSystem = new GradeSystem();
        return self();
    }
}
