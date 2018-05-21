package info.skarby.examples.example8;

public class InteropWithKotlinExampleResult {

    public static void main(String[] args) {
        Name homer = new Name("Homer", "James", "Simpson");
        Name marge = new Name("Marge", "Louise", "Simpson");
        Name bart = new Name("Bart", "James", "Simpson");
        System.out.println(homer.getFirstName());
        System.out.println(marge.getMiddleName());
        System.out.println(bart.getLastName());
    }
}
