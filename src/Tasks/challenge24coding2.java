package Tasks;

public class challenge24coding2 {
    class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class
    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // Main class to test
    public class Main {
        public void main(String[] args) {
            Animal a = new Animal();  // Parent reference
            a.makeSound();            // Output: Animal makes a sound

            Dog d = new Dog();        // Child reference
            d.makeSound();            // Output: Dog barks

            Animal a2 = new Dog();    // Parent reference to child object
            a2.makeSound();           // Output: Dog barks (runtime polymorphism)
        }
    }
}
