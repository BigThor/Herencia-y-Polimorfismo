import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota
{
    private int posx;
    private int posy;
    private int radio;
    private int incX;
    private int incY;
    
    public Pelota(int x, int y, int r)
    {
        posx = x;
        posy = y;
        radio = r;
        float signox = (float)( ( Math.random() ) - 0.5);
        float signoy = (float)( ( Math.random() ) - 0.5);
        
        incY = (int)(30 * signox);
        incX = (int)(30 * signoy);
        
    }
    
    public void mover(Rectangle rect)
    {
        posx += incX;
        posy += incY;
        
        if(posx > rect.getWidth() - radio*2 || posx < radio*2)
        {
            incX = -incX;
        }
        if(posy > rect.getHeight() - radio*2 || posy < radio*2)
        {
            incY = -incY;
        }
    }
    
    public void dibujar(Graphics g)
    {
        g.drawOval(posx, posy, radio, radio);
    }
}
