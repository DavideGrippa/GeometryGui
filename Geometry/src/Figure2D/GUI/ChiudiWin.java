/**
 * @author Grippasbratta, Joltea, Perrisbratta
 * @version 1.0.0
 */

package Figure2D.GUI;

import java.awt.event.*;

class ChiudiWin implements WindowListener 
{
/**
 * Metodo di chiusura della finestra 
 */
    @Override
    public void windowClosing(WindowEvent e) {System.exit(0);}
    
/**
 * Metodi non utilizzati
 */
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowOpened(WindowEvent e) { }
}
