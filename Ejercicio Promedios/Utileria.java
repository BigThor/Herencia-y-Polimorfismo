/**
 * Write a description of class Utileria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Utileria
{
    public float calcularPromedio(Medible [] medidas)
    {
        float promedio = 0;
        
        for(Medible medidaAux: medidas)
        {
            promedio += medidaAux.obtenerMedida();
        }
        
        if (medidas.length != 0)
        {
            return promedio / medidas.length;
        }
        else
        {
            return 0;
        }
    }
}
