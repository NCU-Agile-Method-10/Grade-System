package org.agilemethod.pair10.grade_system;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Helper {
    private static InputStream stdin;
    private static PrintStream stdout;

    public static String getOutputOf(Runnable runnable) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        runnable.run();
        return outputStream.toString();
    }

    public static void backupInOut() {
        stdin = System.in;
        stdout = System.out;
    }

    public static void resetInOut() {
        System.setIn(stdin);
        System.setOut(stdout);
    }
}
