import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        System.out.println("Enter first number:");
        Scanner obj1 = new Scanner(System.in);
        int number1 = obj1.nextInt();
        System.out.println("Enter second number:");
        Scanner obj2 = new Scanner(System.in);
        int number2 = obj2.nextInt();
        int sum = number1+number2;
        System.out.println("Your Sum is: " +sum);
    }
}
