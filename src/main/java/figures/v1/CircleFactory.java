package figures.v1;

public class CircleFactory {
    private static int count = 0;
    public static Circle createCircle(Point2D center, int radius) {
        count++;
        return new Circle(center, radius);
    }
    public static int getCircleCount() {
        return count;
    }
    public void reset() {
        count = 0;
    }

}
