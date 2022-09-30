/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el numero inicial de la serie:");
        int i=0;
        int n = sc.nextByte();
        int T = n;
        System.out.println("Escriba hasta que numero de la serie quiere mostrar:");
        int F = sc.nextByte();
        System.out.println("-----------------------------------------------------");
        while(i<=F){
                if(((i%3)==0)&&(i!=0)){
                    
                    T=T+i*27*(-1);
                    System.out.println(i+". "+T);
                    i=i+1;
                }
                else{
                    
                    T=T+i*27;
                    System.out.println(i+". "+T);
                    i=i+1;
                }
        }
    }
    
}
