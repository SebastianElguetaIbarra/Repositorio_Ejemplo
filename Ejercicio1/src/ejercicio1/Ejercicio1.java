/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una edad para determinar la etapa de dicha persona");
        int E=sc.nextInt();
        if(E<0){
            System.out.println("No ha nacido");
        } 
        else{if(E<=5)
                System.out.println("Es un bebé");
        else{if(E<=11)
                System.out.println("Es un niño");
        else{if(E<=18)
                System.out.println("Es un adolecente");
        else{if(E<=59)
                System.out.println("Es un adulto");
        else{if(E<=100)
                System.out.println("Es un adulto mayor");
        else{if(E>100)
                System.out.println("No es por ser mala onda, pero seguramente ya esté muerto");
            }
            }
            }
            }
            }
            }
        
    }
    
}
