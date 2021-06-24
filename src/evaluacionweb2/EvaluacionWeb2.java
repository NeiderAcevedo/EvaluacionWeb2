
package evaluacionweb2;

import java.util.Scanner;

public class EvaluacionWeb2 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        //PUNTO 1 --GALLINAS Y CONEJOS--
        int gallinas,conejos,cabezas,patas,cab_pat,cabezas_y;
        System.out.print("                          ---Bienvenido---                   ");
        System.out.print("\n-Con este programa podrás calcular la cantidad de conejos y Gallinas que tienes en tu granja-");
                
        System.out.print("\n\n Ingrese la cantidad de Patas: ");
        patas=leer.nextInt();
        System.out.print("Ingre la cantidad de cabezas: ");
        cabezas=leer.nextInt();
        
        cabezas_y=cabezas*-2;
        cab_pat=cabezas_y+patas;
       
        conejos=cab_pat/2;
        gallinas=cabezas-conejos;
        
        System.out.println("\n...RESULTADO...");
        System.out.println("la cantidad de conejos son: "+conejos);
        System.out.println("La cantidad de gallinas son: "+gallinas);
    }
}
