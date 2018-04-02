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
    private Label label1 = new Label("Scegli la figura da disegnare:");
    private Label label2 = new Label("Inserisci l'altezza:");
    private Label label3 = new Label("Inserisci la base:");
    private Label label4 = new Label("Inserisci il raggio (solo cerchio):");
    private TextField txt1 = new TextField();
    private TextField txt2 = new TextField();
    private TextField txt3 = new TextField();
    
    public GUI()
    {
/**
 * creazione layout e dimensionamento finestra
 */
        this.setLayout(null);
        
        this.setTitle("Figure Geometriche");
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
        label1.setBounds(75,70,200,25);
        label2.setBounds(275,70,250,25);
        label3.setBounds(550,70,250,25);
        label4.setBounds(825,70,250,25);
    // scroll list
        figure.setBounds(100,100,150,150);  
        figure.add("");  
        figure.add("Quadrilateral");  
        figure.add("Circle");  
        figure.add("Triangle");
    // text fied
        txt1.setBounds(300,100,200,25);
        txt2.setBounds(575,100,200,25);
        txt3.setBounds(850,100,200,25);
    // button
        pulsante1.setBounds(1100,90,90,45);
        pulsante1.addActionListener(s1);
    //canvas
        //canvas.setBounds(50, 200, 1175, 500);
    // frame
        this.add(figure);
        this.add(pulsante1,"DRAW");
        this.add(txt1);
        this.add(txt2);
        this.add(txt3);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        //this.add(canvas);
    }
    
    class GestBottone implements ActionListener
    {                  
        public void actionPerformed(ActionEvent evt)
        {   
            //disegno della figura
        }
    }
}
