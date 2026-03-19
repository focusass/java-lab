public class Task14 {

    static class Character {
        void attack(){ System.out.println("attack"); }
    }

    static class Warrior extends Character {
        void attack(){ System.out.println("sword"); }
    }

    static class Mage extends Character {
        void attack(){ System.out.println("magic"); }
    }

    static class Archer extends Character {
        void attack(){ System.out.println("arrow"); }
    }

    public static void main(String[] args) {
        new Warrior().attack();
        new Mage().attack();
        new Archer().attack();
    }
}