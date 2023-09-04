import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        if (length <= 0 || width <= 0) {
            System.out.println("Length and width must be positive values.");
        } else {
            Rectangle rectangle = new Rectangle(length, width);

            double area = rectangle.calculateArea();
            System.out.println("Area of the rectangle: " + area);

            double perimeter = rectangle.calculatePerimeter();
            System.out.println("Perimeter of the rectangle: " + perimeter);
        }

        scanner.close();
    }
}
