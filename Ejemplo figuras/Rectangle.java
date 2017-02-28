
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Figura
{
    private float base;
    private float altura;
    
    public Rectangle(int x, int y, float a, float b)
    {
        super(x, y);
        base = a;
        altura = b;
    }
    
    @Override
    public void dibujar()
    {
        
    }
    
    /*
    public void calcularArea()
    {
        area = base * altura;
    }
    
    @Override
    public String toString()
    {
        return "El area del rectangulo, con base " + base + " y altura " + altura + ", es: " + super.toString();
    }*/
}
