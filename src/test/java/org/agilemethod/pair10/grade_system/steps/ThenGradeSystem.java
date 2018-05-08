package org.agilemethod.pair10.grade_system.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.agilemethod.pair10.grade_system.GradeSystem;

import static org.assertj.core.api.Assertions.assertThat;

public class ThenGradeSystem extends Stage<ThenGradeSystem> {
    @ExpectedScenarioState
    private GradeSystem gradeSystem;

    @ExpectedScenarioState
    private String id;

    @ExpectedScenarioState
    private String output;

    public ThenGradeSystem the_grade_system_should_not_be_null() {
        assertThat(gradeSystem).isNotNull();
        return self();
    }

    public ThenGradeSystem should_pass() {
        assertThat(gradeSystem.containsID(id)).isTrue();
        return self();
    }

    public ThenGradeSystem should_not_pass() {
        assertThat(gradeSystem.containsID(id)).isFalse();
        return self();
    }

    public ThenGradeSystem the_name_should_be(String name) {
        assertThat(gradeSystem.getName(id)).isEqualTo(name);
        return self();
    }

    public ThenGradeSystem the_output_should_be(String output) {
        assertThat(this.output).isEqualTo(output);
        return self();
    }
}
