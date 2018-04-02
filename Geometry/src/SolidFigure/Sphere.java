
/**
 *
 *  @version 1.0.0 05/11/2017
 *  @author Grippa Davide 
 *                                                                     
 */

package SolidFigure;

public class Sphere extends GeometrySolid
{
    private float raggio;
    private final float pi = 3.14f;
    
/**
 * Costruttore della sottoclasse Sphere
 * @param r (raggio della sfera)
 */    
    public void Sphere(float r)
    {
        this.setRaggio(r);
    }
    
    
/**
 * metodo void setRaggio
 * metodo utilizzato per inizializzare l'attributo raggio
 * @param r raggio della sfera
 */
    public void setRaggio(float r)
    {
        this.raggio = r;
    }
    
/**
 * Metodo della superclasse astratta Geometry3D ereditato
 * dalla sottoclasse Sphere per calcolare il volume
 */    
    public void calcVolume()
    {
        super.volume = (4/3)*this.pi*this.raggio*this.raggio*this.raggio;
    }
}
