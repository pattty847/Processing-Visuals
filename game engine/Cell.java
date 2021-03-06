import java.awt.Graphics;
import java.awt.Color;

public class Cell{

    private int x, y;
    private Cell parent;
    private int cols, rows;
    private int scl = 40;


    public Cell(int x, int y){
        this.x = x; 
        this.y = y;
        cols = 800/scl;
        rows = 800/scl;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void tick(){
    }

    public void render(Graphics g){
        drawBox(g);
    }

    public void createCell(Graphics g){
        for (int y = 0; y < rows; y++) 
        {
            for (int x = 0; x < cols; x++) 
            {
                g.setColor(Color.white);
                g.drawRect(x*scl, y*scl, scl, scl);
            }
        }
    }
    
    public void setParent(Cell parent) {
		this.parent = parent;
	}

	public static boolean isEqual(Cell c, Cell c2) {
		if (c.getX() == c2.getX() && c.getY() == c2.getY()) {
			return true;
		}
		return false;
	}
}