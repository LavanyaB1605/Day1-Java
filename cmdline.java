import java.util.Scanner;

public class cmdline {
    public static void main(String args[]) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
    }
}
