
package evaluacionweb2;

import java.util.Scanner;

public class EvaluacionWeb2 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        //PUNTO 1 --GALLINAS Y CONEJOS--
        
       /* int gallinas,conejos,cabezas,patas,cab_pat,cabezas_y;
        System.out.print("                          ---Bienvenido---                   ");
        System.out.print("\n-Con este programa podrás calcular la cantidad de conejos y Gallinas que tienes en tu granja-");
                
        System.out.print("\n\nIngrese la cantidad de Patas: ");
        patas=leer.nextInt();
        System.out.print("Ingre la cantidad de Cabezas: ");
        cabezas=leer.nextInt();
        
        cabezas_y=cabezas*-2;
        cab_pat=cabezas_y+patas;
       
        conejos=cab_pat/2;
        gallinas=cabezas-conejos;
        
        System.out.println("\n...RESULTADO...");
        System.out.println("la cantidad de conejos son: "+conejos);
        System.out.println("La cantidad de gallinas son: "+gallinas);*/
        
        //PUNTO 2 --20 NUMEROS--
        
        /*int con_nega = 0;
        System.out.print("                          ---Bienvenido---                   ");
        System.out.print("\n-En este programa podras ingresar numeros positivos o negativos, y el mismo cuenta los numeros negativos-");
        System.out.println("\n");
        System.out.print("Digite la cantidad de numeros a almacenar: ");
        int cantidadNumero=leer.nextInt();
        int[]numeros=new int[cantidadNumero];
       
        for ( int i=0;i<cantidadNumero;i++){
            System.out.print("Digite el numero: "+(i+1)+" : ");
            int numero=leer.nextInt(); 
            
            if (numero<0){
                con_nega=con_nega+1;
            }
        }
        System.out.println("\n...RESULTADO...");
        System.out.println("la cantidad de numeros Negativos Ingresados son: "+con_nega);*/
        
        
        //PUNTO 3 -- MATRIZ, SUMA DE COLUMNA --

        int matriz [][], num_filas, num_col, sumaCol;
        
         System.out.print("                          ---Bienvenido---                   ");
        System.out.println("\n");
        
        System.out.print("Digite el número de filas: ");
        num_filas = leer.nextInt();
        
        System.out.print("Digite el número de columnas: ");
        num_col = leer.nextInt();
        
        matriz = new int [num_filas][num_col];
        
        System.out.print("Digite la matriz");
        
        for (int i=0; i<num_filas; i++){
            for (int j=0; j<num_col; j++){
                System.out.print("Matriz["+j+"]["+i+"] : ");
                matriz[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("\nLa matriz es: ");
        for (int i=0; i<num_filas; i++){
            for (int j=0; j<num_col; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
       
         for (int j=0; j<num_col; j++){
             sumaCol= 0;
                for (int i=0; i<num_col; i++){
                sumaCol += matriz[i][j];  
        
                 
         } 
                System.out.println("La suma de la columna["+j+"] es: "+ sumaCol);
                
         }
        
        
    }
}
