package info.skarby.examples.example4;

import java.util.Objects;

public class JavaPerson {
    private final String name;
    private final int age;
    private String jobTitle;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaPerson person = (JavaPerson) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(jobTitle, person.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, jobTitle);
    }

    @Override
    public String toString() {
        return "KotlinPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
