package info.skarby.examples.example2;

import java.util.Scanner;

public class ExpressionExample {

    public static void main(String[] args) {
        System.out.println("What's your age? > ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int age;
        try {
            age = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            age = 0;
        }
        System.out.println("Your age is " + age + "! (0 if invalid input)");
    }
}
