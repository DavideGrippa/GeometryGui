
/**
 *
 *  @version 1.0.0 05/11/2017
 *  @author Grippa Davide 
 *                                                                     
 */

package Figure3D;

public abstract class Geometry3D 
{
    private float base;
    private float altezza;
    private float profondità;
    public float volume;    
    
/**
 * costruttore che inzializza gli attibuti x e y che corrispondono ai rispettivi assi 
 * @param x1 asse x (base)
 * @param y1 asse y (altezza)
 * @param z1 asse z (profondità)
 */
    public void Geometry3D(float x1,
                           float y1,
                           float z1)
    {
        this.setBase(x1);
        this.setAltezza(y1);
        this.setProfondità(z1);
    }
   
    
/** 
 * metodo setBase()
 * serve per inizializzare l'attributo x ceh rappresenta l'asse x  della figura 3D 
 * @param x1 asse x (base)
 */
    public void setBase(float x1)
    {
        this.base = x1;
    } 
/** 
 * metodo setAltezza()
 * serve per inizializzare l'attributo y che rappresenta l'asse y della figura 3D 
 * @param y1 asse y (altezza)
 */
    public void setAltezza(float y1)
    {
        this.altezza = y1;
    } 
/**
 * metodo setProfondità()
 * serve per inizializzare l'attributo z che rappresenta l'asse z della figura 3D
 * @param z1  asse z (profondità)
 */
    public void setProfondità(float z1)
    {
        this.profondità = z1;
    }

    
/**
 * @return base
 */
    public float getX()
    {
        return this.base;
    }
/**
 * @return altezza
 */
    public float getY()
    {
        return this.altezza;
    }
/**
 * @return profondità
 */
    public float getZ()
    {
        return this.profondità;
    } 
    
    
/** 
 * metodo astratto calcVolume()
 * utilizzato nelle sottoclassi per calccolare il volume   
 */
    public void calcVolume()
    {}  

}
