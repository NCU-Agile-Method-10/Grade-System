package org.agilemethod.pair10.grade_system.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.agilemethod.pair10.grade_system.UI;

public class GivenUI extends Stage<GivenUI> {
    @ProvidedScenarioState
    private UI ui;

    public GivenUI a_ui() {
        ui = new UI();
        return self();
    }
}
