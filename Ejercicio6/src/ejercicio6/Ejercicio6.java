/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
import java.util.Objects;
/**
 *
 * @author Sebastián
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("El Nombre se Usuario y Contraseña es el mismo");
        int i=5;
        while(true){
            
            System.out.println("Ingrese Nombre de Usuario");
            String a = sc.next();
            System.out.println("Ingrese Contraseña");
            String b = sc.next();
            if(Objects.equals(a,b)&& i>0){
            System.out.println("Acceso Correcto");
            break;
            }
            else{
                System.out.println("Incorrecto");
                System.out.println("Intente de nuevo");
                i=i-1;
                System.out.println("Le quedan "+i+" intentos");
                if(i<1){
                    System.out.println("Se acabaron los intentos, impostor");
                    break;
                }
                }
        }

    }
    
}
