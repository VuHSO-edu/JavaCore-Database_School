package ball_and_player;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y, float z) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow(ball.getX() - this.x, 2) + Math.pow(ball.getY() - this.y, 2) + Math.pow(ball.getZ() - this.z, 2));
        return distance < 8;
    }

    public void kick(Ball ball) {
        float force = 10.0f;


        float directionX = ball.getX() - this.x;
        float directionY = ball.getY() - this.y;
        float directionZ = ball.getZ() - this.z;


        float magnitude = (float) Math.sqrt(directionX * directionX + directionY * directionY + directionZ * directionZ);
        directionX /= magnitude;
        directionY /= magnitude;
        directionZ /= magnitude;

    }
}
