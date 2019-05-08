package tetrus;

import DLibX.DConsole;
import java.awt.Color;

public class Cell {

    private int x;
    private int y;
    private int width;
    private int height;
    private DConsole dc;
    private Color col;
    
    public Cell(int x, int y, DConsole dc) {
        
        this.dc = dc;
        this.x = x;
        this.y = y;
        this.width = 15;
        this.height = 15;
        this.col = new Color(255, 255, 255);
        
    }
    
    public void draw() {
        
        dc.setPaint(this.col);
        dc.fillRect(this.x, this.y, this.width, this.height);
        
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
}
