package helloWorldApp;

public class HelloWorld {
    public static void main(String[] args) {
        String resultString = LibClass.acrosticBack(args);
        System.out.println("Result: " + resultString);
    }
}
