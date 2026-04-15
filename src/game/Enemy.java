package game;

import java.awt.Color;

public class Enemy extends Entity {

    private double xSpeed;
    private double ySpeed;
    private long lastFired;

    public Enemy() {
        double positionX = Math.random() * 0.9;
        double positionY = Math.random() * 0.8 + 0.15;
        super(positionX, positionY, 0.03, Color.RED);
        xSpeed = Math.random() * 0.05;
        ySpeed = Math.random() * 0.05;
        lastFired = System.currentTimeMillis();
    }

    public void move() {
        bounceOffWall();
        setXPosition(this.getXPosition() + xSpeed);
        setYPosition(this.getYPosition() + ySpeed);
    }

    private void bounceOffWall() {
        if(this.getXPosition() < 0 || this.getXPosition() > 1) {
            xSpeed = -xSpeed;
        }
        if(this.getYPosition() > 1 || this.getYPosition() < 0.15) {
            ySpeed = -ySpeed;
        }
    }

    public boolean isFiring() {
        long now = System.currentTimeMillis();
        int timeGap = 1000;
        if(now - lastFired > timeGap) {
            lastFired = now;
            return true;
        } else {
            return false;
        }
    }
    
}
