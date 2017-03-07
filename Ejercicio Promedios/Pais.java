
/**
 * Write a description of class Pais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pais implements Medible
{
    private int habitantes;
    
    public Pais(int num)
    {
        habitantes = num;
    }
    
    public int obtenerMedida()
    {
        return habitantes;
    }
}
