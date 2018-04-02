
/**
 *
 *  @version 1.0.0 05/11/2017
 *  @author Grippa Davide 
 *                                                                     
 */

package SolidFigure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class GeometrySolid 
{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    private String material;
    private float base;
    private float altezza;
    private float profondità;
    public float volume;
    public float peso;
    public final float psLegno = 0.75f;
    public final float psFerro = 7.8f;
    public final float psOro = 19.32f;
    public final float psPlatino = 3.5f;
    public final float psPolicarconato = 1.2f;
    

/**
 * costruttore che inzializza gli attibuti x e y che corrispondono ai rispettivi assi 
 * @param x1 asse x (base)
 * @param y1 asse y (altezza)
 * @param z1 asse z (profondità)
 */
    public void GeometrySolid(float x1,
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
 * metodo per la scelta del materiale
 * @return mat che serve per selezionare il materiale
 */
    public int scelta()
    {
        int mat = 0;
        
        System.out.println("Di che matriale è composto l'oggetto?");
        System.out.println("            1)  LEGNO");
        System.out.println("            2)  FERRO");
        System.out.println("            3)  ORO");
        System.out.println("            4)  PLATINO");
        System.out.println("            5)  POLICARBONATO");
        System.out.print  ("                                    Scegli:");
        
        try
                {
                    mat = Integer.parseInt(key.readLine());
                }
                catch (IOException e)
                {
                    System.out.println("\nNumero non corretto!");
                }
        return mat;
    }
 
    
/** 
 * metodo astratto calcVolume()
 * utilizzato nelle sottoclassi per calccolare il volume   
 */
    public void calcVolume()
    {}  
/** 
 * metodo astratto calcPeso()
 * utilizzato nelle sottoclassi per calccolare il peso   
 */   
    public void calcPeso()
    {}
}