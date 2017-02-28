
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle extends Figura
{
    private float base;
    private float altura;
    
    public Triangle(int x, int y, float a, float b)
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
        area = base * altura / 2;
    }
    
    @Override
    public String toString()
    {
        return "El area del triangulo, con base " + base + " y altura " + altura + ", es: " + super.toString();
    }
    */
}
