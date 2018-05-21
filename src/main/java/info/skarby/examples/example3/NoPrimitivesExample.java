package info.skarby.examples.example3;

public class NoPrimitivesExample {

    public static void main(String[] args) {
        char[] characters = new char[] { 'a', 'b', 'c', '1' };
        for (char character : characters)  {
            System.out.println("Character '" + character + "' is " + (Character.isDigit(character) ? "" : "not ") + "a digit!");
        }
    }
}
