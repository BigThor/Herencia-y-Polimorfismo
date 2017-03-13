import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.LinkedList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.Rectangle;

/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
    private LinkedList <Pelota> pelotas;
    
    public Lienzo()
    {
        pelotas = new LinkedList<Pelota>();
        
        EscuchadorRaton escuchaRaton = new EscuchadorRaton();
        this.addMouseListener(escuchaRaton);
    }
    
    public void actuar()
    {
        for(Pelota aux : pelotas)
        {
            Rectangle rect = this.getBounds();
            aux.mover(rect);
        }
        this.repaint();
    }
    
    public class EscuchadorRaton extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent me)
        {
            pelotas.add( new Pelota(me.getX(), me.getY(), ( (int)( Math.random() * 40 + 20) ) ) );
        }
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Pelota aux : pelotas)
        {
            aux.dibujar(g);
        }
    }
}
