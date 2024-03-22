package point_and_line;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin);
        this.end = new Point(end);
    }

    @Override
    public String toString() {
        return "LineSub[begin=" + super.toString() + ",end=" + end + "]";
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public Point getEnd() {
        return this.end;
    }

    public void setBegin(Point begin) {
        super.setXY((int) begin.getX(), (int) begin.getY());
    }

    public void setEnd(Point end) {
        this.end = new Point(end);
    }

    public int getBeginX() {
        return (int) super.getX();
    }
    public int getBeginY() {
        return (int) super.getY();
    }

    public int getEndX() {
        return (int) end.getX();
    }

    public int getEndY() {
        return (int) end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }
    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }


}
