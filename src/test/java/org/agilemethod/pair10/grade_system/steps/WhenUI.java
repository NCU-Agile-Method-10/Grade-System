package org.agilemethod.pair10.grade_system.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.agilemethod.pair10.grade_system.UI;

import static org.agilemethod.pair10.grade_system.Helper.getOutputOf;

import java.io.ByteArrayInputStream;

public class WhenUI extends Stage<WhenUI> {

    @ExpectedScenarioState
    private UI ui;

    @ProvidedScenarioState
    private String id;

    @ProvidedScenarioState
    private String output;

    @ProvidedScenarioState
    private String command;

    public WhenUI input_is(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        return self();
    }

    public WhenUI id_is(String id) {
        this.id = id;
        return self();
    }

    public WhenUI show_welcome_message() {
        output = getOutputOf(() -> ui.showWelcomeMsg(id));
        return self();
    }

    public WhenUI show_finish_message() {
        output = getOutputOf(() -> ui.showFinishMsg());
        return self();
    }
}
