
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
        t1.calcularArea();
        System.out.println("El area del triangulo es: " + t1.accederArea());
        
        Rectangle r1 = new Rectangle(2,7);
        r1.calcularArea();
        System.out.println("El area del rectangulo es: " + r1.accederArea());
        
        Circle c1 = new Circle(5);
        c1.calcularArea();
        System.out.println("El area del circulo es: " + c1.accederArea());
    }
}
