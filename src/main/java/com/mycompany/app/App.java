package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    int a = 100;

    int b = 200;

    public int display a(){
        return a + b ;
    }
    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());

        
    }

    private final String getMessage() {
        return message;
    }

}
