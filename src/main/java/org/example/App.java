package org.example;

public class App {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("Logging another message");

        // Outputs the same instance
        System.out.println(logger1 == logger2); // true
    }
}
