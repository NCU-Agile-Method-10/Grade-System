package org.agilemethod.pair10.grade_system;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * This class stores the students list
 *
 * @version 1.0
 * @since 2018-05-07
 */
public class GradeSystem {
    private final String INPUT_FILE_NAME = "gradeInput.txt";
    private Map<String, Grade> grades = new HashMap<>();
    private float[] weights = {0.1f, 0.1f, 0.1f, 0.3f, 0.4f};
    private Scanner scanner;

    /**
     * Constructs a grade system
     */
    public GradeSystem() {
        /*
        for each line of input file
            grade = construct Grade with line
            grades << { grade.id, grade }
         */
        try {
            Files.lines(Paths.get(INPUT_FILE_NAME)).forEach(line -> {
                Grade grade = new Grade(line.split(" "));
                grades.put(grade.id, grade);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Checks whether the grade system contains the input id
     * @param id user input id
     * @return true/false
     */
    public boolean containsID(String id) {
        /*
        return call grades.containsKey with id
         */
        return grades.containsKey(id);
    }

    /**
     * Prints the grade
     * @param id user id
     */
    public void showGrade(String id) {
        /*
        grade = call grades.get with id
        print grade
         */
        Grade grade = grades.get(id);
        System.out.println(
                grade.name + "成績：\n" +
                "  lab1: " + grade.lab1 + "\n" +
                "  lab2: " + grade.lab2 + "\n" +
                "  lab3: " + grade.lab3 + "\n" +
                "  midterm: " + grade.midterm + "\n" +
                "  final exam: " + grade.finalExam + "\n" +
                "  total grade: " + grade.calculateTotalGrade(weights)
        );
    }
  
    public String getName(String id) {
        /*
        grade = call grades.get with id
        return grade.name
         */
        return grades.get(id).name;
    }

    /**
     * Prints the rank
     * @param id user id
     */
    public void showRank(String id) {
        /*
        for each grade in grades
            call grade#calculateTotalGrade
        this_grade = call grades.get with id
        rank = 1
        for each grade in grades
            rank += 1 if this_grade.totalGrade < grade.totalGrade
        print rank
         */
        grades.values().forEach(grade -> grade.calculateTotalGrade(weights));
        Grade this_grade = grades.get(id);
        int rank = (int) grades.values().stream().filter(grade -> this_grade.totalGrade < grade.totalGrade).count() + 1;
        System.out.println(this_grade.name + "排名第" + rank);
    }

    /**
     * Updates the grade system's weights
     */
    public void updateWeights() {
        /*
        print weights
        new_weights = get new weights by scanner
        print new weights
        if get confirm by scanner
            weights = new_weights
            print message for update weights
        else
            print message for not update weights
         */
        showOldWeights();
        int[] weights = getNewWeights();
        setWeights(weights);
    }

    private void showOldWeights() {
        System.out.println(
                "舊配分：\n" +
                "  lab1: " + (int)(weights[0] * 100) + "%\n" +
                "  lab2: " + (int)(weights[1] * 100) + "%\n" +
                "  lab3: " + (int)(weights[2] * 100) + "%\n" +
                "  midterm: " + (int)(weights[3] * 100) + "%\n" +
                "  final exam: " + (int)(weights[4] * 100) + "%\n"
        );
    }

    private int[] getNewWeights() {
        scanner = new Scanner(System.in);
        int[] weights = new int[5];
        System.out.print(
                "輸入新配分：\n" +
                "  lab1: "
        );
        weights[0] = scanner.nextInt();
        System.out.print("  lab2: ");
        weights[1] = scanner.nextInt();
        System.out.print("  lab3: ");
        weights[2] = scanner.nextInt();
        System.out.print("  midterm: ");
        weights[3] = scanner.nextInt();
        System.out.print("  final exam: ");
        weights[4] = scanner.nextInt();
        System.out.println();
        return weights;
    }

    private void setWeights(int[] weights) {
        System.out.print(
                "請確認新配分：\n" +
                "  lab1: " + weights[0] + "%\n" +
                "  lab2: " + weights[1] + "%\n" +
                "  lab3: " + weights[2] + "%\n" +
                "  midterm: " + weights[3] + "%\n" +
                "  final exam: " + weights[4] + "%\n" +
                "\n" +
                "以上正確嗎？ Y (Yes) 或 N (No) "
        );
        if (scanner.next().startsWith("Y")) {
            IntStream.range(0, 5).forEach(i -> this.weights[i] = weights[i] / 100f);
            System.out.println("配分已更新");
        } else {
            System.out.println("配分未更新");
        }
    }
}
