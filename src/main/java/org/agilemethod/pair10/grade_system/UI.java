package org.agilemethod.pair10.grade_system;

import java.util.Scanner;

/**
 *
 * <h1>Main program</h1>
 * The UI program implements an application
 * that takes the user requests
 * and prints out to the screen
 *
 *
 *
 * @version 1.0
 * @since 2018-05-07
 */

public class UI {
    private GradeSystem gradeSystem;
    private Scanner scanner;
  
    /**
     * Constructs a UI
     */
    public UI() {
        /*
        construct gradeSystem
        construct scanner
         */
    }

    /**
     * Run the main program
     *
     * @throws NoSuchIDException if there is no such id
     * @throws NoSuchCommandException if there is no such command
     */
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

    /**
     * Asks user to enter the id.
     *
     * @return string id
     */
    public String promptID() {
        /*
        print message for promptID
        return id by scanner
         */
        return "";
    }

    /**
     * Checks whether the input id exists.
     * @param id user id
     * @return true if the id exists
     * @throws NoSuchIDException if id have not found
     */
    public boolean checkID(String id) throws NoSuchIDException {
        /*
        throw NoSuchIDException unless call gradeSystem.containsID with id
        return true
         */
        return true;
    }

    /**
     * Prints welcome message for the user
     * @param id user input id
     */
    public void showWelcomeMsg(String id) {
        /*
        name = call gradeSystem.getName with id
        print welcome message with name
         */
    }

    /**
     * Prints the four commands
     * to prompt the user how to control the system
     * and returns the user input
     *
     *
     * @return command
     * @throws NoSuchCommandException if there is no such command
     */
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

    /**
     * Prints the finish message
     */
    public void showFinishMsg() {
        /*
        print finish message
         */
    }
}
