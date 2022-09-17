/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese Primera Nota");
         int a=sc.nextInt();
         System.out.println("Ingrese Segunda Nota");
         int b=sc.nextInt();
         System.out.println("Ingrese Tercera Nota");
         int c=sc.nextInt();
         System.out.println("Ingrese Cuarta Nota");
         int d=sc.nextInt();
         int t1=(a*20/100);
         int t2=(b*20/100);
         int t3=(c*30/100);
         int t4=(d*30/100);
         int T=(t1+t2+t3+t4);
         if(T<=60){
             System.out.println("Clase perdida con "+T);
         }
         else{if(T<=70){
             System.out.println("Clase decente con "+T);
         }
         else{if(T<=80){
             System.out.println("Clase aceptable con "+T);
         }
         else{if(T<=100){
             System.out.println("Clase aceptable con "+T);
         }
         else{if(T>100){
             System.out.println("Notas no concuerdan, total de "+T);
         }
         }
         }
         }
         }
         
    }
    
}
