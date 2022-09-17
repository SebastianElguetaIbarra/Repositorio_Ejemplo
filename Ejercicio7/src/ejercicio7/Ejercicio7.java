/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int si=350;
        int di=300;
        int ni=300;
        int pi=310;
        int ci=280;
        int ai=360;
        int sm=650;
        int dm=550;
        int nm=500;
        int pm=460;
        int cm=490;
        int am=520;
        System.out.println("Ingrese nombre del estudiante:");
        String nombre = sc.next();
        System.out.println("Escoja una de las siguientes facultades");
        System.out.println("Ing. de Sistemas = 1");
        System.out.println("Derecho = 2");
        System.out.println("Ing. Naviera = 3");
        System.out.println("Ing. Pesquera = 4");
        System.out.println("Contabilidad = 5");
        System.out.println("Administracion = 6");
        System.out.println("Ingrese el numero asociado a su Facultad a continuacion:");
        int facu = sc.nextInt();
        if(facu == 1){
            System.out.println(nombre+" de Ing. de Sistemas debe pagar:");
            System.out.println("Importe de matricula = Q"+si);
            System.out.println("Mensualidad = Q"+sm);
            System.out.println("IGV = Q"+((si+sm)*18/100));
        }
        if(facu == 2){
            System.out.println(nombre+" de Derecho debe pagar:");
            System.out.println("Importe de matricula = Q"+di);
            System.out.println("Mensualidad = Q"+dm);
            System.out.println("IGV = Q"+((di+dm)*18/100));
        }
        if(facu == 3){
            System.out.println(nombre+" de Ing. Naviera debe pagar:");
            System.out.println("Importe de matricula = Q"+ni);
            System.out.println("Mensualidad = Q"+nm);
            System.out.println("IGV = Q"+((ni+nm)*18/100));
        }
        if(facu == 4){
            System.out.println(nombre+" de Ing. Pesquera debe pagar:");
            System.out.println("Importe de matricula = Q"+pi);
            System.out.println("Mensualidad = Q"+pm);
            System.out.println("IGV = Q"+((pi+pm)*18/100));
        }
        if(facu == 5){
            System.out.println(nombre+" de Contabilidad debe pagar:");
            System.out.println("Importe de matricula = Q"+ci);
            System.out.println("Mensualidad = Q"+cm);
            System.out.println("IGV = Q"+((ci+cm)*18/100));
        }
        if(facu == 6){
            System.out.println(nombre+" de Administracion debe pagar:");
            System.out.println("Importe de matricula = Q"+ai);
            System.out.println("Mensualidad = Q"+am);
            System.out.println("IGV = Q"+((ai+am)*18/100));
        }
    }
    
}
