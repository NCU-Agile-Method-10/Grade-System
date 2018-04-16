package org.agilemethod.pair10.grade_system.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.agilemethod.pair10.grade_system.GradeSystem;

import static org.agilemethod.pair10.grade_system.Helper.getOutputOf;

public class WhenGradeSystem extends Stage<WhenGradeSystem> {
    @ExpectedScenarioState
    private GradeSystem gradeSystem;

    @ProvidedScenarioState
    private String id;

    @ProvidedScenarioState
    private String output;

    private int[] weights;

    public WhenGradeSystem id_is(String id) {
        this.id = id;
        return self();
    }

    public WhenGradeSystem show_grade() {
        output = getOutputOf(() -> gradeSystem.showGrade(id));
        return self();
    }

    public WhenGradeSystem show_rank() {
        output = getOutputOf(() -> gradeSystem.showRank(id));
        return self();
    }

    public WhenGradeSystem weights_are(int[] weights) {
        this.weights = weights;
        return self();
    }
}
