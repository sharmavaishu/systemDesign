package org.example;

public class Logger {

    private static Logger loggerInstance;

    public Logger(){
       // prevents external instantiate
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            synchronized (Logger.class) { // thread safety
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }

}

