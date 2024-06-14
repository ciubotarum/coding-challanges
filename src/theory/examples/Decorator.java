package theory.examples;

public class Decorator {
    // Component interface
    public static interface Coffee {
        double cost();
        String description();
    }

    // Concrete Component
    public static class SimpleCoffee implements Coffee {
        @Override
        public double cost() {
            return 2.0;
        }

        @Override
        public String description() {
            return "Simple coffee";
        }
    }

    // Decorator
    public static abstract class CoffeeDecorator implements Coffee {
        protected Coffee decoratedCoffee;

        public CoffeeDecorator(Coffee coffee) {
            this.decoratedCoffee = coffee;
        }

        @Override
        public double cost() {
            return decoratedCoffee.cost();
        }

        @Override
        public String description() {
            return decoratedCoffee.description();
        }
    }

    // Concrete Decorator 1
    public static class MilkDecorator extends CoffeeDecorator {
        public MilkDecorator(Coffee coffee) {
            super(coffee);
        }

        @Override
        public double cost() {
            return decoratedCoffee.cost() + 0.5;
        }

        @Override
        public String description() {
            return decoratedCoffee.description() + ", with milk";
        }
    }

    // Concrete Decorator 2
    public static class SugarDecorator extends CoffeeDecorator {
        public SugarDecorator(Coffee coffee) {
            super(coffee);
        }

        @Override
        public double cost() {
            return decoratedCoffee.cost() + 0.2;
        }

        @Override
        public String description() {
            return decoratedCoffee.description() + ", with sugar";
        }
    }

    // Concrete Decorator 3
    public static class WhipDecorator extends CoffeeDecorator {
        public WhipDecorator(Coffee coffee) {
            super(coffee);
        }

        @Override
        public double cost() {
            return decoratedCoffee.cost() + 0.7;
        }

        @Override
        public String description() {
            return decoratedCoffee.description() + ", with whip";
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Coffee simpleCoffee = new SimpleCoffee();
            System.out.println(simpleCoffee.description() + " $" + simpleCoffee.cost());

            Coffee milkCoffee = new MilkDecorator(simpleCoffee);
            System.out.println(milkCoffee.description() + " $" + milkCoffee.cost());

            Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
            System.out.println(sugarMilkCoffee.description() + " $" + sugarMilkCoffee.cost());

            Coffee whippedSugarMilkCoffee = new WhipDecorator(sugarMilkCoffee);
            System.out.println(whippedSugarMilkCoffee.description() + " $" + whippedSugarMilkCoffee.cost());
        }
    }

}
