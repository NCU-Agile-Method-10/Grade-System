package org.agilemethod.pair10.grade_system;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.agilemethod.pair10.grade_system.steps.GivenGrade;
import org.agilemethod.pair10.grade_system.steps.ThenGrade;
import org.agilemethod.pair10.grade_system.steps.WhenGrade;
import org.junit.Test;

public class GradeSpec extends ScenarioTest<GivenGrade, WhenGrade, ThenGrade> {

    @Test
    public void it_can_constructs_a_grade() {
        given().a_grade();

        then().the_grade_should_not_be_null();
    }

    @Test
    public void it_can_caculate_total_grade() {
        given().a_grade();

        when().scores_are(81, 98, 84, 90, 93)
                .and().weights_are(new int[] {10, 10, 10, 30, 40});

        then().the_caculated_total_grade_should_be(91);
    }
}
