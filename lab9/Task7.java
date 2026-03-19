public class Task7 {

    static class Animal {
        void makeSound(){ System.out.println("sound"); }
    }

    static class Lion extends Animal {
        void makeSound(){ System.out.println("Roar"); }
    }

    static class Elephant extends Animal {
        void makeSound(){ System.out.println("Trumpet"); }
    }

    static class Monkey extends Animal {
        void makeSound(){ System.out.println("Oo aa"); }
    }

    public static void main(String[] args) {
        new Lion().makeSound();
        new Elephant().makeSound();
        new Monkey().makeSound();
    }
}