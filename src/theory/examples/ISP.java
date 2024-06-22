package theory.examples;

public class ISP {
    interface Printer {
        void printDocument();
    }

    interface Scanner {
        void scanDocument();
    }

    class MultiFunctionPrinter implements Printer, Scanner {
        @Override
        public void printDocument() {
            System.out.println("Printing document...");
        }

        @Override
        public void scanDocument() {
            System.out.println("Scanning document...");
        }
    }

    class SimplePrinter implements Printer {
        @Override
        public void printDocument() {
            System.out.println("Printing document...");
        }
    }

}
