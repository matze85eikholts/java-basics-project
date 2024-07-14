package figures.v1;

import java.util.Objects;

public class Circle {
    private Point2D center;
    private int radius;
    public Circle(Point2D center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public Circle(int xCenter, int yCenter, int radius) {
        this.center = new Point2D(xCenter, yCenter);
        this.radius = radius;
    }
    public Circle(int radius) {
        this.center = new Point2D(0,0);
        this.radius = radius;
    }
    public Circle() {
        this(1);
    }
    public Point2D getCenter() {
        return center;
    }
    public int getRadius() {
        return radius;
    }
    public void setCenter(Point2D center) {
        this.center = center;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void moveRel(int dx, int dy) {
        this.center = new Point2D(this.center.getX()+dx, this.center.getY()+dy);
    }
    public void enlarge(int n) {
        this.radius *= n;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public boolean isInside(int x, int y) {
        return (x <= center.getX()+radius) && (y <= center.getY()+radius);
    }
    public boolean isInside(Point2D point) {
        return isInside(point.getX(), point.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
