
/**
 *
 *  @version 1.0.0 05/11/2017
 *  @author Grippa Davide 
 *                                                                     
 */

package Figure3D;

public class Cube extends Geometry3D
{
/**
 * Costruttore della sottoclasse Cube
 * @param x (base)
 * @param y (altezza)
 * @param z (profondità)
 */
    public void Cubo(float x,
                     float y,
                     float z)
    {
        super.setBase(x);
        super.setAltezza(y);
        super.setProfondità(z);
    }
    
/**
 * metodo della classe Geometry3D ereditado dalla 
 * classe Cube che calcola il volume di questo solido
 */    
    public void calcVolume()
    {
        super.volume = super.getX()*super.getY()*super.getZ();
    }
}
