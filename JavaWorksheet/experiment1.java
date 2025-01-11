class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.makeSound();

        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

