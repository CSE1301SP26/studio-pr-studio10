package game;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Player extends Entity {

    private long lastFired;

    public Player() {
        super(0.5, 0.05, 0.03, Color.BLACK);
        lastFired = System.currentTimeMillis();
    }

    public void move() {
        double size = 0.01;
        if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
            setXPosition(this.getXPosition() - size);
        }
        if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
            setXPosition(this.getXPosition() + size);
        }
    }

    public boolean isFiring() {
        long now = System.currentTimeMillis();
        int timeGap = 500;
        if (now - lastFired > timeGap && StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
            lastFired = now;
            return true;
        } else {
            return false;
        }
    }
}
