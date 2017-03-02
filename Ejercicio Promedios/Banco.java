import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    private ArrayList<CuentaBancaria> cuentas;
    
    public Banco()
    {
        cuentas = new ArrayList<CuentaBancaria>();
    }
    
    public void añadirCuenta(CuentaBancaria nuevaC)
    {
        cuentas.add(nuevaC);
    }
    
    public float calcularPromedio()
    {
        Iterator<CuentaBancaria> it;
        float promedio = 0;
        
        it = cuentas.iterator();
        while(it.hasNext())
        {
            CuentaBancaria cuentaAux = it.next();
            promedio += cuentaAux.decirSaldo();
        }
        
        promedio /= cuentas.size();
        return promedio;
    }
}
