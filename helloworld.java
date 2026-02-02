import java.util.Scanner;
class Helloworld{
    public static void main(String args[]){
        System.out.print("System:\t");
        System.out.println("Hello World");
        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String user = obj.nextLine();
        System.out.print("System:\t");
        System.out.println("Hello"+ " "+user);
    }
}