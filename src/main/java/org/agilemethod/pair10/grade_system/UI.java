package org.agilemethod.pair10.grade_system;

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
    /**
     * Constructs a UI
     */
    public UI() {

    }

    /**
     * Run the main program
     *
     * @throws NoSuchIDException if there is no such id
     * @throws NoSuchCommandException if there is no such command
     */
    public void run() throws NoSuchIDException, NoSuchCommandException {

    }

    /**
     * Asks user to enter the id.
     *
     * @return string id
     */
    public String promptID() {
        return "";
    }

    /**
     * Checks whether the input id exists.
     * @param id user id
     * @return true if the id exists
     * @throws NoSuchIDException if id have not found
     */
    public boolean checkID(String id) throws NoSuchIDException {
        return true;
    }

    /**
     * Prints welcome message for the user
     * @param id user input id
     */
    public void showWelcomeMsg(String id) {

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
    public String promptCommand() throws NoSuchCommandException {
        return "";
    }

    /**
     * Prints the finish message
     */
    public void showFinishMsg() {

    }
}
