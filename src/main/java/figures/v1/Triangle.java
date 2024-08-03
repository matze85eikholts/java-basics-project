package figures.v1;

public class Triangle {
    private Point2D point1, point2, point3;
    public Triangle(Point2D point1, Point2D point2, Point2D point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    public Point2D getPoint1() {
        return point1;
    }
    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }
    public Point2D getPoint2() {
        return point2;
    }
    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }
    public Point2D getPoint3() {
        return point3;
    }
    public void setPoint3(Point2D point3) {
        this.point3 = point3;
    }
    public double getSide12() {
        return Math.sqrt(Math.pow(point2.getX() - getPoint1().getX(), 2) +
                Math.pow(point2.getY() - getPoint1().getY(), 2));
    }

    public double getSide13() {
        return Math.sqrt(Math.pow(point3.getX() - getPoint1().getX(), 2) +
                Math.pow(point3.getY() - getPoint1().getY(), 2));
    }

    public double getSide23() {
        return Math.sqrt(Math.pow(point3.getX() - point2.getX(), 2) +
                Math.pow(point3.getY() - point2.getY(), 2));
    }
    public void moveRel(int dx, int dy) {
        point1.moveRel(dx, dy);
        point2.moveRel(dx, dy);
        point3.moveRel(dx, dy);
    }

    public double getArea() {
        double p = (getSide12() + getSide13() + getSide23()) / 2;
        return Math.sqrt(p * (p - getSide12()) * (p - getSide23()) * (p - getSide13()));
    }

    public double getPerimeter() {
        return getSide12() + getSide13() + getSide23();
    }

    public boolean isInside(int x, int y) {
        int a = (getPoint1().getX() - x) * (point2.getY() - getPoint1().getY()) -
                (point2.getX() - getPoint1().getX()) * (getPoint1().getY() - y);
        int b = (point2.getX() - x) * (point3.getY() - point2.getY()) -
                (point3.getX() - point2.getX()) * (point2.getY() - y);
        int c = (point3.getX() - x) * (getPoint1().getY() - point3.getY()) -
                (getPoint1().getX() - point3.getX()) * (point3.getY() - y);
        return (a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0);
    }
    public boolean isInside(Point2D point) {
        return isInside(point.getX(), point.getY());
    }
}
