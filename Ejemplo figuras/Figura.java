import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Figura
{
    private int posx;
    private int posy;
    
    public Figura(int x, int y)
    {
        posx  = x;
        posy  = y;
    }
    
    public int decirCoordenadaX()
    {
        return posx;
    }
    
    public int decirCoordenadaY()
    {
        return posy;
    }
    
    public abstract void dibujar(Graphics g);
    
    /*protected float area;
    
    public Figura()
    {
        area = 0;
    }
    
    public void calcularArea(){}
    
    @Override
    public String toString()
    {
        return "" + area;
    }
    
    public float accederArea()
    {
        return area;
    }*/
}
