public class Task12 {

    static class Instrument {
        void playSound(){ System.out.println("sound"); }
    }

    static class Guitar extends Instrument {
        void playSound(){ System.out.println("guitar"); }
    }

    static class Piano extends Instrument {
        void playSound(){ System.out.println("piano"); }
    }

    static class Drums extends Instrument {
        void playSound(){ System.out.println("drums"); }
    }

    public static void main(String[] args) {
        new Guitar().playSound();
        new Piano().playSound();
        new Drums().playSound();
    }
}