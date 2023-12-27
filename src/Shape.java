public class Shape {
    private Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public double perimeter() {
        double perimeter = 0;
        int numPoints = points.length;

        for (int i = 0; i < numPoints; i++) {
            perimeter += points[i].distanceTo(points[(i + 1) % numPoints]);
        }

        return perimeter;
    }

    public double longestSide() {
        double maxLength = 0;

        for (int i = 0; i < points.length; i++) {
            double sideLength = points[i].distanceTo(points[(i + 1) % points.length]);
            maxLength = Math.max(maxLength, sideLength);
        }

        return maxLength;
    }

    public double averageSide() {
        double totalLength = 0;
        int numSides = points.length;

        for (int i = 0; i < numSides; i++) {
            totalLength += points[i].distanceTo(points[(i + 1) % numSides]);
        }

        return totalLength / numSides;
    }
}
