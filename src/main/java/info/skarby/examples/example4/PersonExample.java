package info.skarby.examples.example4;

public class PersonExample {
    public static void main(String[] args) {
        JavaPerson[] persons = new JavaPerson[] {
                new JavaPerson("John", 40),
                new JavaPerson("Jane", 34),
        };
        persons[1].setJobTitle("Banker");
        for (JavaPerson person : persons) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old and  "
                    + (person.getJobTitle() == null ? "is unemployed" : "works as " + person.getJobTitle()));
        }
    }
}
