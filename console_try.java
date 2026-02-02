import java.io.*;
class console_try{
    public  static void main(String args[]){
        Console console = System.console();
        String name = console.readLine("Enter your name : ");
        System.out.println("Hello"+name);
        console.printf("Hello %s!", name);


    }
}