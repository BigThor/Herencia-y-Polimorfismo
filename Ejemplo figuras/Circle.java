
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Figura
{
    private float radio;
    
    public Circle(float r)
    {
        radio = r;
    }
    
    public void calcularArea()
    {
        area = radio * radio * (float)3.1416;
    }
    
    @Override
    public String toString()
    {
        return "El area del circulo, con radio " + radio + ", es: " + super.toString();
    }
}
