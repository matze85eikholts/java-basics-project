package figures.v1;

public class Rectangle {
    private int leftTopX, leftTopY;
    private int rightBottomX, rightBottomY;
    private int length, width;
    private Point2D leftTop = new Point2D();
    private Point2D rightBottom = new Point2D();
    public Rectangle(Point2D leftTop, Point2D rightBottom) {
        this.leftTopX = leftTop.getX();
        this.leftTopY = leftTop.getY();
        this.rightBottomX = rightBottom.getX();
        this.rightBottomY = rightBottom.getY();
    }
    public Rectangle(int xLeft, int yTop, int xRight, int yBottom){
        this.leftTopX = xLeft;
        this.leftTopY = yTop;
        this.rightBottomX = xRight;
        this.rightBottomY = yBottom;
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle() {
        this.length = 1;
        this.width = 1;
        this.leftTop = new Point2D(0,0);
    }
    public Point2D getTopLeft () {
        return leftTop;
    }
    public Point2D getBottomRight() {
        return rightBottom;
    }
    public int getLength() {
        return rightBottom.getX() - leftTop.getX();
    }

    public int getWidth() {
        return rightBottom.getY() - leftTop.getY();
    }

    public void moveRel(int dx, int dy) {
        leftTop.moveRel(dx, dy);
        rightBottom.moveRel(dx, dy);
    }

    public void enlarge(int nx, int ny) {
        rightBottom.setX(leftTop.getX() + getLength() * nx);
        rightBottom.setY(leftTop.getY() + getWidth() * ny);
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return getLength() * 2 + getWidth() * 2;
    }
    public boolean isInside(int x, int y) {
        return x >= leftTop.getX() && x <= rightBottom.getX() &&
                y >= leftTop.getY() && y <= rightBottom.getY();
    }

    public boolean isInside(Point2D point) {
        return isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Rectangle rectangle) {
        return !(this.getTopLeft().getX() > rectangle.getBottomRight().getX() ||
                this.getBottomRight().getX() < rectangle.getTopLeft().getX() ||
                this.getTopLeft().getY() > rectangle.getBottomRight().getY() ||
                this.getBottomRight().getY() < rectangle.getTopLeft().getY());
    }

    public boolean isInside(Rectangle rectangle) {
        return isInside(rectangle.getTopLeft()) && isInside(rectangle.getBottomRight()) &&
                isInside(rectangle.getTopLeft().getX(), rectangle.getBottomRight().getY()) &&
                isInside(rectangle.getBottomRight().getX(), rectangle.getTopLeft().getY());
    }


}
