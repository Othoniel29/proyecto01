
package herramienta;

import libreta.libreta;
import lapiz.lapiz;
/**
 *
 * @author OTHONIEL
 */
public class Herramienta {
    public static void main(String[] args) {
        // TODO code application logic here
        libreta miHerramienta= new libreta();
        libreta miHerramienta2= new libreta("verde","cuadros","norma",200);
        System.out.println(miHerramienta.getColor());
        System.out.println(miHerramienta.getHoja_tipo());
        System.out.println(miHerramienta.getMarca());
        System.out.println(miHerramienta.getCantidad_de_hojas());
        System.out.println("---------------------------------------");
        System.out.println(miHerramienta2.getColor());
        System.out.println(miHerramienta2.getHoja_tipo());
        System.out.println(miHerramienta2.getMarca());
        System.out.println(miHerramienta2.getCantidad_de_hojas());
         System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        
        lapiz milapiz= new lapiz();
        lapiz milapiz2 = new lapiz("morado","gruesa","bic",4);
        System.out.println(milapiz.getColor());
        System.out.println(milapiz.getpunta());
        System.out.println(milapiz.getMarca());
        System.out.println(milapiz.getnumero());
        System.out.println("---------------------------------------");
        System.out.println(milapiz2.getColor());
        System.out.println(milapiz2.getpunta());
        System.out.println(milapiz2.getMarca());
        System.out.println(milapiz2.getnumero());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
     
        
       
    }
    
}
