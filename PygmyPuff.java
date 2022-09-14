import ecs100.*;
import java.awt.Color;
/**
 * Write a description of class PygmyPuff here.
 *
 * @author Olivier
 * @version 25/07/22
 */
public class PygmyPuff
{
    private double puffX = -100;
    private double puffY = -100;
    
    private int puffSize;
    private int puffHeight;
    
    private double left;
    private double top;
    private double bottom;
    
    private Color color;
    
    /**
     * Constructor of objects of class PygmyPuff
     */
    public PygmyPuff(double x, double y, int size, int height, Color col)
    {
        this.puffX = x;
        this.puffY = y;
        this.puffSize = size;
        this.puffHeight = height;
        this.color = col;
        
        this.setTop();
        this.setLeft();
        this.setBottom();
    }
    
    /**
     * Set left
     */
    public void setLeft() {
        this.left = this.puffX - this.puffSize/2.0;
    }
    
    /**
     * Get left
     */
    public double getLeft() {
        return this.left;
    }
    
    /**
     * Set top
     */
    public void setTop() {
        this.top = this.puffY - this.puffSize/2.0;
    }
    
    /**
     * Get top
     */
    public double getTop() {
        return this.top;
    }
    
    /**
     * Set bottom
     */
    public void setBottom() {
        this.bottom = this.puffY + this.puffSize/2.0;
    }
    
    /**
     * Get bottom
     */
    public double getBottom() {
        return this.bottom;
    }
    
    /**
     * Get Right
     */
    public double getRight() {
        return this.left + this.puffSize;
    }
    
    /**
     * Draw the puff on screen
     */
    public void draw() {
        UI.setColor(this.color);
        UI.fillOval(left, top, puffSize, puffSize);
        UI.sleep(500);
    }
    
    /**
     * Erase a rectafle around the current onj
     */
    public void erase() {
        final int BUFFER = 1;
        UI.eraseRect(left, top, puffSize+BUFFER, bottom+BUFFER);
    }
    
    /**
     * Make the puff grow
     */
    public void grow() {
        this.erase();
        
        this.puffY -= 0;
        this.puffSize += 5;
        this.setTop();
        this.setLeft();
        
        this.draw();
    }
}
