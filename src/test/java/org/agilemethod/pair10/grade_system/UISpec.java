package org.agilemethod.pair10.grade_system;

import com.tngtech.jgiven.annotation.AfterScenario;
import com.tngtech.jgiven.annotation.BeforeScenario;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.agilemethod.pair10.grade_system.steps.GivenUI;
import org.agilemethod.pair10.grade_system.steps.ThenUI;
import org.agilemethod.pair10.grade_system.steps.WhenUI;
import org.junit.Test;

import static org.agilemethod.pair10.grade_system.Helper.backupInOut;
import static org.agilemethod.pair10.grade_system.Helper.resetInOut;

public class UISpec extends ScenarioTest<GivenUI, WhenUI, ThenUI> {

    @Test
    public void it_can_construct_a_ui() {
        given().a_ui();

        then().the_ui_should_not_be_null();
    }

    @Test
    public void it_can_prompt_id() {
        given().a_ui();

        when().input_is("el_psy_congroo");

        then().prompt_id_should_be("el_psy_congroo")
            .and().the_output_should_be("輸入 ID 或 Q (結束使用)？");
    }

    @Test
    public void it_can_check_correct_id() {
        given().a_ui();

        when().id_is("962001051");

        then().should_pass_check_id();
    }

    @Test
    public void it_can_check_incorrect_id() {
        given().a_ui();

        when().id_is("En_taro_adun");

        then().should_not_pass_check_id();
    }

    @Test
    public void it_can_show_welcome_message() {
        given().a_ui();

        when().id_is("962001051")
            .and().show_welcome_message();

        then().the_output_should_be("Welcome 李威廷\n\n");
    }

    @Test
    public void it_can_prompt_command() {
        given().a_ui();

        when().input_is("Khassar_de_templari");

        then().prompt_command_should_be("Khassar_de_templari")
            .and().the_output_should_be("輸入指令\n" +
                "1) G 顯示成績 (Grade)\n" +
                "2) R 顯示排名 (Rank)\n" +
                "3) W 更新配分 (Weight)\n" +
                "4) E 離開選單 (Exit)\n");
    }

    @Test
    public void it_can_do_command() {
        given().a_ui();

        when().id_is("962001051")
            .and().command_is("E");

        then().should_do_command_successfully();
    }

    @Test
    public void it_can_check_invalid_command() {
        given().a_ui();

        when().id_is("962001051")
            .and().command_is("Zerashk_gulida");

        then().should_not_do_command();
    }

    @Test
    public void it_can_show_finish_message() {
        given().a_ui();

        when().show_finish_message();

        then().the_output_should_be("結束了");
    }

    @BeforeScenario
    public void before() {
        backupInOut();
    }

    @AfterScenario
    public void after() {
        resetInOut();
    }
}
