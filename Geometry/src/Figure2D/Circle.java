
/*
 *
 *  @version 1.0.0 05/11/2017
 *  @author Grippa Davide 
 *                                                                     
 */

package Figure2D;

final class Circle extends Geometry2D
{
    private float raggio;
    private final float Pi = 3.14f;
 
    
/**
 * costruttore che inzializza l'attributo raggio
 * @param r raggio del cerchio
 * @param x1 coordinata centro cerchio
 * @param y1 raggio del cerchio
 */    
    public void Circle(float r,
                       float x1,
                       float y1)
    {
        this.setRaggio(r);
        super.setCoord(x1, y1);
    }
    
    
/**
 * metodo void setRaggio
 * metodo utilizzato per inizializzare l'attributo raggio
 * @param r raggio del cerchio
 */
    public void setRaggio(float r)
    {
        this.raggio = r;
    }
 
    
/**
 * metodo ereditato dalla classe Geometry2D
 * serve per calcolare l'area del cerchio
 */
    public void calcArea()
    {
        super.area = Pi*this.raggio*this.raggio;
    }
/**
 * metodo ereditato dalla classe Geometry2D
 * serve per calcolare il perimetro del cerchio
 */
    public void calcPerimetro()
    {
        super.perimetro = 2*Pi*this.raggio;
    }
}
