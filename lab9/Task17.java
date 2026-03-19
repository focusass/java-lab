public class Task17 {

    static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        void sound() {
            System.out.println("This animal makes a sound.");
        }
    }

    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        @Override
        void sound() {
            System.out.println(name + " says: Woof Woof!");
        }
    }

    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }

        @Override
        void sound() {
            System.out.println(name + " says: Meow!");
        }
    }

    static class Bird extends Animal {
        Bird(String name) {
            super(name);
        }

        @Override
        void sound() {
            System.out.println(name + " says: Tweet Tweet!");
        }
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Bird bird = new Bird("Rio");

        dog.sound();
        cat.sound();
        bird.sound();
    }
}