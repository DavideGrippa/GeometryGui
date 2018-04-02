
/**
 *
 *  @version 1.0.0 05/11/2017
 *  @author Grippa Davide 
 *                                                                     
 */

package SolidFigure;

public class Pyramid extends GeometrySolid
{
    private float areaBase;
/**
 * Costruttore della sottoclasse Pyramid
 * @param aB (area di base)
 * @param y (altezza)
 */    
    public void Pyramid(float aB,
                        float y)
    {
        this.areaBase = aB;
        super.setAltezza(y);
    }
    
    
/**
 * metodo della classe Geometry3D ereditado dalla 
 * classe Pyramid che calcola il volume di questo solido
 */ 
    public void calcVolume()
    {
        super.volume = (this.areaBase * super.getY())/3;
    }
}
