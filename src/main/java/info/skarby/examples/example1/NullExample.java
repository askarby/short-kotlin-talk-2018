package info.skarby.examples.example1;

import java.util.Scanner;

public class NullExample {

    public static void main(String[] args) {
        System.out.println("What's your age? > ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Integer age = null;

        try {
            age = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // Ignore this
        }

        System.out.println("You age is " + (age == null ? "unknown" : age));
    }
}
