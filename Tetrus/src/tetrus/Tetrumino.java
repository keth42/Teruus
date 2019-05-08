package tetrus;

import DLibX.DConsole;

public class Tetrumino {

    private DConsole dc;
    private int x;
    private int y;
    private int type;
    private int fallSpeed;    
    
    
    public Tetrumino(int type) {
        
        this.type = type;
        this.x = 0;
        this.y = 0;
        
    }
    
    public void draw() {
        
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    
    
}
