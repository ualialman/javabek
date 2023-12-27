import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter coordinates for 10 points
        Point[] points = new Point[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter coordinates for Point " + (i + 1) + " (x y): ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points[i] = new Point(x, y);
        }

        scanner.close(); // Close the scanner to avoid resource leaks

        Shape myShape = new Shape(points);

        System.out.println("Perimeter: " + myShape.perimeter());
        System.out.println("Longest Side: " + myShape.longestSide());
        System.out.println("Average Side: " + myShape.averageSide());
    }
}
