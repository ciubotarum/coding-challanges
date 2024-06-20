package theory.examples;

public class OCP {
    abstract class Shape {
        abstract double area();
    }

    class Circle extends Shape {
        private double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        private double width;
        private double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double area() {
            return width * height;
        }
    }

}
