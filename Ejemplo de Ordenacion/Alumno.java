
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno implements Comparable
{
    private int creditos;
    
    public Alumno(int creds)
    {
        creditos = creds;
    }
    
    
    @Override
    public int compareTo(Object other)
    {
        Alumno tmp = (Alumno)other;
        if(this.creditos == tmp.creditos)
            return 0;
        else if(this.creditos > tmp.creditos)
            return 1;
        else
            return -1;
            
        //Version economica
        //return creditos - ((Alumno)other).creditos);
    }
    
    @Override
    public String toString()
    {
        return "El alumno tiene " + creditos + " creditos.";
    }
}
