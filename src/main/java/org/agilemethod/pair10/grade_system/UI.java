package org.agilemethod.pair10.grade_system;

import java.util.Scanner;

public class UI {
    private GradeSystem gradeSystem;
    private Scanner scanner;

    public UI() {
        /*
        construct gradeSystem
        construct scanner
         */
    }

    public void run() throws NoSuchIDException, NoSuchCommandException {
        /*
        loop
            id = call #promptID
            break if id equals "Q"
            call #checkID with id
            call #showWelcomeMsg with id
            loop
                command = call #promptCommand
                break unless call #doCommand with id and command
         call #showFinishMsg
         */
    }

    public String promptID() {
        /*
        print message for promptID
        return id by scanner
         */
        return "";
    }

    public boolean checkID(String id) throws NoSuchIDException {
        /*
        throw NoSuchIDException unless call gradeSystem.containsID with id
        return true
         */
        return true;
    }

    public void showWelcomeMsg(String id) {
        /*
        name = call gradeSystem.getName with id
        print welcome message with name
         */
    }

    public String promptCommand() {
        /*
        print message for promptCommand
        return command by scanner
         */
        return "";
    }

    public boolean doCommand(String id, String command) throws NoSuchCommandException {
        /*
        switch command
            case "G"
                call gradeSystem.showGrade with id
            case "R"
                call gradeSystem.showRank with id
            case "W"
                call gradeSystem.updateWeights
            case "E"
                return false
            default
                throw NoSuchCommandException
        return true
         */
        return true;
    }

    public void showFinishMsg() {
        /*
        print finish message
         */
    }
}
