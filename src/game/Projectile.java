package game;

import java.awt.Color;

public class Projectile extends Entity {

    public Projectile(double x, double y, Color color) {
        super(x, y, 0.01, color);
    }

    public void moveUp() {
        double size = 0.01;
        setYPosition(this.getYPosition() + size);
    }

    public void moveDown() {
        double size = 0.01;
        setYPosition(this.getYPosition() - size);
    }

    public boolean isOutOfBounds() {
        if(this.getYPosition() > 1 || this.getYPosition() < 0) {
            return true;
        } else {
            return false;
        }
    }

}
