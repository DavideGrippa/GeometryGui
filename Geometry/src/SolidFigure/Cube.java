
/**
 *
 *  @version 1.0.0 05/11/2017
 *  @author Grippa Davide 
 *                                                                     
 */

package SolidFigure;

public class Cube extends GeometrySolid
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
 * calcolo del peso specifico
 */
    public void calcPeso(int mat)
    {
        calcVolume();
        switch(mat)
        {
            case 1:{super.peso = super.volume * super.psLegno;}break;
            
        }
        
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
