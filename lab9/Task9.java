public class Task9 {

    static class Component {
        void showInfo(){ System.out.println("info"); }
    }

    static class CPU extends Component {
        void showInfo(){ System.out.println("CPU"); }
    }

    static class RAM extends Component {
        void showInfo(){ System.out.println("RAM"); }
    }

    static class GPU extends Component {
        void showInfo(){ System.out.println("GPU"); }
    }

    public static void main(String[] args) {
        new CPU().showInfo();
        new RAM().showInfo();
        new GPU().showInfo();
    }
}