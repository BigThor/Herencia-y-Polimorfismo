import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Figura
{
    private float radio;
    
    public Circle(int x, int y, float r)
    {
        super(x, y);
        radio = r;
    }
    
    @Override
    public void dibujar(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawOval(super.decirCoordenadaX(), super.decirCoordenadaY(), (int)radio, (int)radio);
    }
    
    /*
    public void calcularArea()
    {
        area = radio * radio * (float)3.1416;
    }
    
    @Override
    public String toString()
    {
        return "El area del circulo, con radio " + radio + ", es: " + super.toString();
    }*/
}
