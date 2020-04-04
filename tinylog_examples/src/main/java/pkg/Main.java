package pkg;

import org.tinylog.Logger;

public class Main {
    public static void main(String[] args) {
        Logger.error("This is an error message");
        Logger.warn("This is a warn message");
        Logger.info("This is an info message");
        Logger.debug("This is a debug message");
        Logger.trace("This is a trace message");
        Logger.info("User's name is {}", System.getProperty("user.mane"));
        //Logger.info("User's name is {}" + System.getProperty("user.mane"));
        Logger.error(new RuntimeException("ops"), "Something is wrong");
    }
}
