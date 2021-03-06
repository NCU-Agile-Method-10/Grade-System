package org.agilemethod.pair10.grade_system.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.agilemethod.pair10.grade_system.NoSuchCommandException;
import org.agilemethod.pair10.grade_system.NoSuchIDException;
import org.agilemethod.pair10.grade_system.UI;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.agilemethod.pair10.grade_system.Helper.getOutputOf;

public class ThenUI extends Stage<ThenUI> {
    @ExpectedScenarioState
    private UI ui;

    @ExpectedScenarioState
    private String id;

    @ExpectedScenarioState
    private String command;

    @ExpectedScenarioState
    private String output;

    public ThenUI the_ui_should_not_be_null() {
        assertThat(ui).isNotNull();
        return self();
    }

    public ThenUI prompt_id_should_be(String id) {
        output = getOutputOf(() -> assertThat(ui.promptID()).isEqualTo(id));
        return self();
    }

    public ThenUI the_output_should_be(String output) {
        assertThat(this.output).isEqualTo(output);
        return self();
    }

    public ThenUI should_pass_check_id() {
        assertThatCode(() -> assertThat(ui.checkID(id)).isTrue()).doesNotThrowAnyException();
        return self();
    }

    public ThenUI should_not_pass_check_id() {
        assertThatThrownBy(() -> ui.checkID(id)).isInstanceOf(NoSuchIDException.class);
        return self();
    }

    public ThenUI prompt_command_should_be(String command) {
        output = getOutputOf(() -> assertThat(ui.promptCommand()).isEqualTo(command));
        return self();
    }

    public ThenUI should_do_command_successfully() {
        output = getOutputOf(() -> assertThatCode(() -> ui.doCommand(id, command)).doesNotThrowAnyException());
        return self();
    }

    public ThenUI should_not_do_command() {
        assertThatThrownBy(() -> ui.doCommand(id, command)).isInstanceOf(NoSuchCommandException.class);
        return self();
    }
}
