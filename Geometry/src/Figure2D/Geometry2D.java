
/** 
 *
 *  @author Grippa Davide
 *  @version 1.0.0 05/11/2017
 *                                                                      
 */

package Figure2D;

public abstract class Geometry2D 
{
    private float base;
    private float altezza;
    private float x;
    private float y;
    public float area;
    public float perimetro;
    

/**
 * costruttore che inzializza gli attibuti x e y che corrispondono ai rispettivi assi 
 * @param b asse x (base)
 * @param h asse y (altezza)
 * @param x1 coordinata x del primo punto di partenza
 * @param y1 coordinata y del primo punto di partenza
 */
    public void Geometry2D(float b,
                           float h,
                           float x1,
                           float y1)
    {
        this.setBase(b);
        this.setAltezza(h);
        this.x = x1;
        this.y = y1;
    }
    
    
/** 
 * metodo setBase()
 * serve per inizializzare l'attributo base cha rappresenta la base della figura 2D 
 * @param b base
 */
    public void setBase(float b)
    {
        this.base = b;
    }
/** 
 * metodo setAltezza()
 * serve per inizializzare l'attributo altezza che rappresenta l'altezza della figura 2D 
 * @param h altezza 
 */
    public void setAltezza(float h)
    {
        this.altezza = h;
    }   
/**
 * metodo che serve per inizializzare le coordinate del primo punto
 * @param x1 coordinata x
 * @param y1 coordinata y
 */
   public void setCoord(float x1,
                        float y1)
   {
        this.x = x1;
        this.y = y1;
   }
   
/**
 * @return base
 */
    public float getB()
    {
        return this.base;
    }
/**
 * @return altezza
 */
    public float getH()
    {
        return this.altezza;
    }
    
        
/** 
 * metodo astratto calcArea()
 * utilizzato nelle sottoclassi per calccolare l'area   
 */
    public void calcArea()
    {}  
/** 
 * metodo astratto calcPerimetro()
 * utilizzato nelle sottoclassi per calccolare il perimetro   
 */   
    public void calcPerimetro()
    {}
}