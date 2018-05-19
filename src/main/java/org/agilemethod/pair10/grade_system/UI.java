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
         */
        gradeSystem = new GradeSystem();
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
        while (true) {
            String id = promptID();
            if (id.equals("Q"))
                break;
            checkID(id);
            showWelcomeMsg(id);
            while (true) {
                String command = promptCommand();
                if (!doCommand(id, command))
                    break;
            }
        }
        showFinishMsg();
    }

    /**
     * Asks user to enter the id.
     *
     * @return string id
     */
    public String promptID() {
        /*
        construct scanner
        print message for promptID
        return id by scanner
         */
        scanner = new Scanner(System.in);
        System.out.print("輸入 ID 或 Q (結束使用)？");
        return scanner.next();
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
        if (!gradeSystem.containsID(id))
            throw new NoSuchIDException();
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
        String name = gradeSystem.getName(id);
        System.out.print("Welcome " + name + "\n\n");
    }

    /**
     * Prints the four commands
     * to prompt the user how to control the system
     * and returns the user input
     *
     *
     * @return command
     */
    public String promptCommand() {
        /*
        construct scanner
        print message for promptCommand
        return command by scanner
         */
        scanner = new Scanner(System.in);
        System.out.print(
                "輸入指令\n" +
                "1) G 顯示成績 (Grade)\n" +
                "2) R 顯示排名 (Rank)\n" +
                "3) W 更新配分 (Weight)\n" +
                "4) E 離開選單 (Exit)\n"
        );
        return scanner.next();
    }

    /**
     * Does the command
     * @param id user id
     * @param command command to do
     * @return true if success
     * @throws NoSuchCommandException if no such command
     */
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
        switch (command) {
            case "G":
                gradeSystem.showGrade(id);
                break;
            case "R":
                gradeSystem.showRank(id);
                break;
            case "W":
                gradeSystem.updateWeights();
                break;
            case "E":
                return false;
            default:
                throw new NoSuchCommandException();
        }
        return true;
    }

    /**
     * Prints the finish message
     */
    public void showFinishMsg() {
        /*
        print finish message
         */
        System.out.print("結束了");
    }
}
