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
        /*Banco elBanco = new Banco();
        CuentaBancaria aux;
        
        aux = new CuentaBancaria(100);
        elBanco.añadirCuenta(aux);
        aux = new CuentaBancaria(200);
        elBanco.añadirCuenta(aux);
        aux = new CuentaBancaria(300);
        elBanco.añadirCuenta(aux);*/
        
        Medible [] medidas = new Medible[3];
        medidas[0] = new Pais(25000000);
        medidas[1] = new Pais(32000000);
        medidas[2] = new Pais(94000000);
        
        System.out.println("El promedio de las cuentas bancarias es: " + calcularPromedio(medidas));
        /*
        Planeta tierra = new Planeta();
        Pais aux2;
        
        System.out.println("El promedio de habitantes del planeta es: " + tierra.calcularPromedio());*/
    }
}
