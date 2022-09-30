/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int menor=0;
        int entre=0;
        int mayor=0;
        int cantidad=0;
        float peso;
        do{
            System.out.println("Ingese el peso(Kg) de la pieza:");
            peso = sc.nextFloat();
            
            if(peso==0){break;}
            else{
                cantidad=cantidad+1;
            if((peso<9.8)){
                menor=menor+1;
            }else{if(peso<=10.2){
                entre=entre+1;
            }else{if(peso>10.2){
                mayor=mayor+1;
            }
            }
            }
            }
        }while(peso!=0);
        
        System.out.println("Piezas menores a 9.8Kg: "+menor);
        System.out.println("Piezas entre 9.8Kg a 10.2Kg: "+entre);
        System.out.println("Piezas mayores a 10.2Kg: "+mayor);
        System.out.println("Cantidad de piezas ingresadas: "+cantidad);
    }
    
}
