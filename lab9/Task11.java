public class Task11 {

    static class TeamMember {}

    static class Player extends TeamMember {
        void play(){ System.out.println("play"); }
    }

    static class Coach extends TeamMember {
        void train(){ System.out.println("train"); }
    }

    static class Doctor extends TeamMember {
        void heal(){ System.out.println("heal"); }
    }

    public static void main(String[] args) {
        new Player().play();
        new Coach().train();
        new Doctor().heal();
    }
}