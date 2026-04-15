package game;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Entity {
    private double xPosition;
    private Color color;
    private double yPosition;
    private double size;

    public Entity(double x, double y, double size, Color color) {
        this.xPosition = x;
        this.yPosition = y;
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public double getXPosition() {
        return xPosition;
    }

    public double getYPosition() {
        return yPosition;
    }

    public void setXPosition(double x) {
        this.xPosition = x;
    }

    public void setYPosition(double y) {
        this.yPosition = y;
    }

    public void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(xPosition, yPosition, size);
    }

    public boolean collidesWith(Entity e) {
        double dX = xPosition - e.getXPosition();
        double dY = yPosition - e.getYPosition();
        double distance = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
        if(distance > this.getSize() + e.getSize()) {
            return false;
        } else {
            return true;
        }
    }

}
