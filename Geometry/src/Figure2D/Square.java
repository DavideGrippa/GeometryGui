
/*
 *
 *  @version 1.0.0 05/11/2017
 *  @author Grippa Davide 
 *                                                                     
 */

package Figure2D;

public class Square extends Geometry2D
{ 
/**
 * costruttore che inzializza gli attibuti x e y che corrispondono ai rispettivi assi 
 * @param x1 asse x (base)
 * @param y1 asse y (altezza)
 */
    public void Square(float x1,
                       float y1,
                       float b,
                       float h)
    {
        super.Geometry2D(b, h, x1, y1);
    }
    
    
/**
 * metodo ereditato dalla classe Geometry2D
 * serve per calcolare l'area del cerchio
 */
    public void calcArea()
    {
        super.area = super.getB()*super.getH();
    }
/**
 * metodo ereditato dalla classe Geometry2D
 * serve per calcolare il perimetro del cerchio
 */
    public void calcPerimetro()
    {
        super.perimetro = (super.getB()*2)+(super.getH()*2);
    }
}
