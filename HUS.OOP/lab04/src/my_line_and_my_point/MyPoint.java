package my_line_and_my_point;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }


    public double distance() {
        return Math.sqrt(x*x + y*y);
    }


    public double distance(MyPoint another) {
        int dx = another.getX() - this.x;
        int dy = another.getY() - this.y;

        return Math.sqrt(dx*dx + dy*dy);
    }


    public double distance(int x, int y) {
        int dx = x - this.x;
        int dy = y - this.y;

        return Math.sqrt(dx*dx + dy*dy);
    }
}
