
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura
{
    protected float area;
    
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
    }
}
