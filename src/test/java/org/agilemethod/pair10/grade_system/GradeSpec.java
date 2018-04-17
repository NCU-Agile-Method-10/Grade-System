package org.agilemethod.pair10.grade_system;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.agilemethod.pair10.grade_system.steps.GivenGrade;
import org.agilemethod.pair10.grade_system.steps.ThenGrade;
import org.agilemethod.pair10.grade_system.steps.WhenGrade;
import org.junit.Test;

public class GradeSpec extends ScenarioTest<GivenGrade, WhenGrade, ThenGrade> {

    @Test
    public void it_can_construct_a_grade() {
        given().a_grade();

        then().the_grade_should_not_be_null();
    }

    @Test
    public void it_can_calculate_total_grade() {
        given().a_grade();

        when().scores_are(81, 98, 84, 90, 93)
                .and().weights_are(new float[] {0.1f, 0.1f, 0.1f, 0.3f, 0.4f});

        then().the_calculated_total_grade_should_be(91);
    }
}
