package impactradius.example.gob;

import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
    }

    private String sayHello() {

        String theGreetingText = "Hello World";
        LOGGER.info(theGreetingText);

        return theGreetingText;
    }
}