/**
 * @author Grippasbratta, Jolteasbratta, Perrisbratta
 * @version 1.0.0
 */

package Figure2D.GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.JOptionPane;

public class GUI extends Frame
{   
/**
 * oggetti grafici
 */
    private Frame f = new Frame("Geometry 2D");
    private Color black = new Color(0,0,0);
    //private Draww canvas;
    private Choice figure = new Choice();
    private Button pulsante1 = new Button("DRAW");
    private GestBottone s1 = new GestBottone();
    private Label label1 = new Label("Scegli la figura da disegnare:");
    private Label label2 = new Label("Inserisci l'altezza:");
    private Label label3 = new Label("Inserisci la base:");
    private Label label4 = new Label("Inserisci il raggio (solo cerchio):");
    private TextField txt1 = new TextField("0");
    private TextField txt2 = new TextField("0");
    private TextField txt3 = new TextField("0");
    
    public GUI()
    {
/**
 * creazione layout e dimensionamento finestra
 */
        f.setLayout(null);
        
        f.setTitle("Figure Geometriche");
        f.setSize(1280,720);
        f.setVisible(true);
        
        
/**
 * Registriamo gli osservatori sulla finestra
 */
        f.addWindowListener(new ChiudiWin());
       
        
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
        figure.add("Rectangular");  
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

    // frame
        f.add(figure);
        f.add(pulsante1,"DRAW");
        f.add(txt1);
        f.add(txt2);
        f.add(txt3);
        f.add(label1);
        f.add(label2);
        f.add(label3);
        f.add(label4);
    }
    
    
//azione sul bottone   
    class GestBottone implements ActionListener
    {                  
        public void actionPerformed(ActionEvent evt)
        {   
            //disegno della figura
            String type;
            int h=0, b=0, i=0;
            
            type=figure.getSelectedItem();
            switch(type)
            {
                case "Rectangular":
                {   
                    h=Integer.parseInt(txt1.getText());
                    b=Integer.parseInt(txt2.getText());
                    
                    if (h==0 || b==0)
                    {
                        JOptionPane.showMessageDialog(null,"Campo altezza o campo base non inseriti");
                    }
                    else
                    {
                    }
                }break;
                
                case "Circle":
                {
                    h=Integer.parseInt(txt3.getText());
                    b=Integer.parseInt(txt3.getText());
                    
                    if (h==0 || b==0)
                    {
                        JOptionPane.showMessageDialog(null,"Campo raggio non inserito");
                    }
                    else
                    {
                    }
                }break;
                
                case "Triangle":
                {
                    h=Integer.parseInt(txt1.getText());
                    b=Integer.parseInt(txt2.getText());
                    
                    if (h==0 || b==0)
                    {
                        JOptionPane.showMessageDialog(null,"Campo altezza o campo base non inseriti");
                    }
                    else
                    {
                    }
                }break;
            }
        }
    }

 /*   
//canvas
    class Draww extends Canvas
    {
        
    }*/
}
