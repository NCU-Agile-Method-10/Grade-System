package org.agilemethod.pair10.grade_system.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.agilemethod.pair10.grade_system.Grade;

import static org.assertj.core.api.Assertions.assertThat;

public class ThenGrade extends Stage<ThenGrade> {
    @ExpectedScenarioState
    private Grade grade;

    @ExpectedScenarioState
    private float[] weights;

    public ThenGrade the_grade_should_not_be_null() {
        assertThat(grade).isNotNull();
        return self();
    }

    public ThenGrade the_calculated_total_grade_should_be(int totalGrade) {
        assertThat(grade.calculateTotalGrade(weights)).isEqualTo(totalGrade);
        return self();
    }
}
