package ball_and_container;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * (float)Math.cos(Math.toRadians(direction));
        this.yDelta = -speed * (float)Math.sin(Math.toRadians(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Phương thức di chuyển
    // Tiến bóng một bước
    // Phản chiếu lại nếu đụng vào tường
    // Cập nhật vị trí của bóng bằng cách cộng delta vào tọa độ
    // Đảo ngược delta nếu đụng vào tường
    public void move(float rightWall, float leftWall, float topWall, float bottomWall){
        if(x + xDelta > rightWall || x + xDelta < leftWall){
            xDelta = -xDelta;
        } else {
            x += xDelta;
        }

        if(y + yDelta > topWall || y + yDelta < bottomWall){
            yDelta = -yDelta;
        } else {
            y += yDelta;
        }
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString(){
        return "Ball[(" + x + "," + y + "), speed=(" + xDelta + "," + yDelta + ")]";
    }
}
