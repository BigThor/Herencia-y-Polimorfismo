import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Planeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planeta
{
    private ArrayList<Pais> planet;
    
    public Planeta()
    {
        planet = new ArrayList<Pais>();
    }
    
    public void añadirPais(Pais nuevo)
    {
        planet.add(nuevo);
    }
    
    public float calcularPromedio()
    {
        Iterator<Pais> it;
        float promedio = 0;
        
        it = planet.iterator();
        while(it.hasNext())
        {
            Pais paisAux = it.next();
            promedio += paisAux.decirHabitantes();
        }
        
        promedio /= planet.size();
        return promedio;
    }
}
