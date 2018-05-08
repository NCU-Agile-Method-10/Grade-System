package org.agilemethod.pair10.grade_system;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.agilemethod.pair10.grade_system.steps.GivenGradeSystem;
import org.agilemethod.pair10.grade_system.steps.ThenGradeSystem;
import org.agilemethod.pair10.grade_system.steps.WhenGradeSystem;
import org.junit.Test;

public class GradeSystemSpec extends ScenarioTest<GivenGradeSystem, WhenGradeSystem, ThenGradeSystem> {

    @Test
    public void it_can_construct_a_grade_system() {
        given().a_grade_system();

        then().the_grade_system_should_not_be_null();
    }

    @Test
    public void it_can_check_if_it_contains_id() {
        given().a_grade_system();

        when().id_is("962001044");

        then().should_pass();
    }

    @Test
    public void it_can_check_if_it_not_contains_id() {
        given().a_grade_system();

        when().id_is("Nas_beru_uhn'adarr");

        then().should_not_pass();
    }

    @Test
    public void it_can_get_name() {
        given().a_grade_system();

        when().id_is("962001044");

        then().the_name_should_be("李威廷");
    }

    @Test
    public void it_can_show_grade() {
        given().a_grade_system();

        when().id_is("962001044")
                .and().show_grade();

        then().the_output_should_be("李威廷成績：\n" +
                "  lab1: 81\n" +
                "  lab2: 98\n" +
                "  lab3: 84\n" +
                "  midterm: 90\n" +
                "  final exam: 93\n" +
                "  total grade: 91\n");
    }

    @Test
    public void it_can_show_rank() {
        given().a_grade_system();

        when().id_is("962001044")
                .and().show_rank();

        then().the_output_should_be("李威廷排名第22\n");
    }

    @Test
    public void it_can_update_weights() {
        given().a_grade_system();

        when().input_is("20\n20\n20\n20\n20\nY\n")
                .and().update_weights();

        then().the_output_should_be("舊配分：\n" +
                "  lab1: 10%\n" +
                "  lab2: 10%\n" +
                "  lab3: 10%\n" +
                "  midterm: 30%\n" +
                "  final exam: 40%\n" +
                "\n" +
                "輸入新配分：\n" +
                "  lab1: " +
                "  lab2: " +
                "  lab3: " +
                "  midterm: " +
                "  final exam: " +
                "\n" +
                "請確認新配分：\n" +
                "  lab1: 20%\n" +
                "  lab2: 20%\n" +
                "  lab3: 20%\n" +
                "  midterm: 20%\n" +
                "  final exam: 20%\n" +
                "\n" +
                "以上正確嗎？ Y (Yes) 或 N (No)配分已更新\n");
    }
}
