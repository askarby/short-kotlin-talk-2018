package info.skarby.examples.example5;

public class InheritanceExample {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
          new Dog(),
          new Cat()
        };

        for (Animal animal : animals) {
            System.out.println("I'm a " + animal.getClass().getSimpleName());
            animal.breathe();
            animal.makeSound();
            if (animal instanceof Cat) {
                ((Cat) animal).ignore();
            } else if (animal instanceof Dog) {
                ((Dog) animal).drool();
            }
            System.out.println();
        }
    }
}

abstract class Animal {
    public void breathe() {
        System.out.println("[Takes a breath]");
    }

    abstract void makeSound();
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("[Makes the sound] Wooof!");
    }
    public void drool() {
        System.out.println("[Drools]");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("[Makes the sound] miiiaaaaauuwww!");
    }

    public void ignore() {
        System.out.println("[Ignores you]");
    }
}
