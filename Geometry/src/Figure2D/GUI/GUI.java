/**
 * @author Grippasbratta, Jolteasbratta, Perrisbratta
 * @version 1.0.0
 */

package Figure2D.GUI;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class GUI extends Frame
{   
/**
 * oggetti grafici
 */
    private Color black = new Color(0,0,0);
    private Panel canvas;
    private Choice figure = new Choice();
    private Button pulsante1 = new Button("DRAW");
    private GestBottone s1 = new GestBottone();
    private TextField label1 = new TextField("Scegli la figura da disegnare:");
    private TextField label2 = new TextField("Scegli l'altezza della figura da disegnare:");
    private TextField label3 = new TextField("Scegli la base della figura da disegnare:");
    
    public GUI()
    {
/**
 * creazione layout e dimensionamento finestra
 */
        this.setLayout(null);
        
        this.setTitle("Figure Geometriche");
        this.setLocation(50,0);
        this.setSize(1280,720);
        this.setVisible(true);
        
        
/**
 * Registriamo gli osservatori sulla finestra
 */
        this.addWindowListener(new ChiudiWin());
       
        
/**
 * interno alla finestra
 */  
    // label 
        
    // scroll list
        figure.setBounds(100,100,150,150);  
        figure.add("");  
        figure.add("Square");  
        figure.add("Circle");  
        figure.add("Triangle");
    // button
        pulsante1.setBounds(350,90,90,45);
        pulsante1.addActionListener(s1); 
    // frame
        this.add(figure);
        this.add(pulsante1,"DRAW");
    }
    
    class GestBottone implements ActionListener
    {                  
        public void actionPerformed(ActionEvent evt)
        {   
            //disegno della figura
        }
    }
}
