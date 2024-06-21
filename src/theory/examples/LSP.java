package theory.examples;

public class LSP {
    // Here, Ostrich violates LSP because it can't fly, yet it is a type of Bird. Instead, we should refactor
    // to avoid such inheritance if possible.
    class Bird {
        void fly() {
            System.out.println("Flying");
        }
    }

    class Sparrow extends Bird {
    }

    class Ostrich extends Bird {
        @Override
        void fly() {
            throw new UnsupportedOperationException("Ostriches can't fly");
        }
    }

}
