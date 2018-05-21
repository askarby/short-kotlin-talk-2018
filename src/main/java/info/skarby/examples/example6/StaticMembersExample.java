package info.skarby.examples.example6;

public class StaticMembersExample {
    public static void main(String[] args) {
        Person john = Person.fromFullName("John P. Doe");
        System.out.println("First name(s): " + john.getFirstName() + ", last name: " + john.getLastName());
    }
}

class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static Person fromFullName(String fullName) {
        String firstName = fullName.substring(0, fullName.lastIndexOf(' '));
        String lastName = fullName.substring(fullName.lastIndexOf(' ') + 1);
        return new Person(firstName, lastName);
    }
}
