package vacuum;

public class Obstacle {
    private final int x;
    private final int y;
    
    public Obstacle(int newX, int newY) {
        x = newX;
        y = newY;
    }
    
    public int getX () {
        return x;
    }
    
    public int getY () {
        return y;
    }
}
