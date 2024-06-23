package theory.examples;

public class DIP {
    interface Keyboard {
        void type();
    }

    static class MechanicalKeyboard implements Keyboard {
        @Override
        public void type() {
            System.out.println("Typing on a mechanical keyboard...");
        }
    }

    static class Computer {
        private final Keyboard keyboard;

        Computer(Keyboard keyboard) {
            this.keyboard = keyboard;
        }

        void type() {
            keyboard.type();
        }
    }

    static class Main {
        public static void main(String[] args) {
            Keyboard keyboard = new MechanicalKeyboard();
            Computer computer = new Computer(keyboard);
            computer.type();
        }
    }

}
