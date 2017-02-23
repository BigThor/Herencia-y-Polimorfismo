import java.util.ArrayList;
import java.util.Iterator;
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
            System.out.println(figTemp);
        }
        
        ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
        Iterator<Figura> itFig;
        
        t1 = new Triangle(5,2);
        r1 = new Rectangle(4,6);
        c1 = new Circle(3);
        
        listaFiguras.add(t1);
        listaFiguras.add(r1);
        listaFiguras.add(c1);
        

        itFig = listaFiguras.iterator();
        while(itFig.hasNext())
        {
            Figura figTemp = itFig.next();
            figTemp.calcularArea();
        }
        
        itFig = listaFiguras.iterator();
        while(itFig.hasNext())
        {
            Figura figTemp = itFig.next();
            System.out.println(figTemp);
        }
    }
}
