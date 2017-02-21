
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String [] args)
    {
        Triangle t1 = new Triangle(4,3);
        Rectangle r1 = new Rectangle(2,7);
        Circle c1 = new Circle(5);
       
        Figura [] figuras = new Figura[3];
        
        figuras[0] = t1;
        figuras[1] = r1;
        figuras[2] = c1;
        
        for(Figura figTemp : figuras)
        {
            figTemp.calcularArea();
        }
        
        for(Figura figTemp : figuras)
        {
            System.out.println("El area del " + figTemp.decirCualFigura() + " es: " + figTemp.accederArea());
        }
    }
}
