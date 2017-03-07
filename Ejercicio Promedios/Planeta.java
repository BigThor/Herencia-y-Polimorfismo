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
    private ArrayList<Pais> paises;
    
    public Planeta()
    {
        paises = new ArrayList<Pais>();
    }
    
    public void añadirPais(Pais nuevo)
    {
        paises.add(nuevo);
    }
    
    public float calcularPromedio()
    {
        Pais [] arrPaises = new Pais[paises.size()];
        arrPaises = paises.toArray(arrPaises);
        return Utileria.calcularPromedio(arrPaises);
    }
}
