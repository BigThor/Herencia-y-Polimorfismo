
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
    
    public Triangle(float a, float b)
    {
        base = a;
        altura = b;
    }
    
    public void calcularArea()
    {
        area = base * altura / 2;
    }
    
    public String decirInfo()
    {
        return "El area del triangulo, con base " + base + " y altura " + altura + ", es: " + super.decirInfo();
    }
}
