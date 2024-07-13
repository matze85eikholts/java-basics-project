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
}
