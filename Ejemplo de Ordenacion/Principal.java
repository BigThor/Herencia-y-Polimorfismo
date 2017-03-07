import java.util.ArrayList;
import java.util.Arrays;
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
        ArrayList<Alumno> alumnos;
        alumnos = new ArrayList<Alumno>();
        
        alumnos.add( new Alumno(150) );
        alumnos.add( new Alumno(100) );
        alumnos.add( new Alumno(120) );
        alumnos.add( new Alumno(40) );
        alumnos.add( new Alumno(350) );
        
        //Transformar el arraylist en arreglo
        Alumno [] arrAlum = new Alumno[alumnos.size()];
        arrAlum = alumnos.toArray(arrAlum);
        
        Arrays.sort(arrAlum);
        
        //Contenido del ArrayList (desordenado)
        for(Alumno alu : alumnos)
            System.out.println(alu);
            
        //Contenido del arreglo (ordenado)
        for(Alumno alu : arrAlum)
            System.out.println(alu);
    }
}
