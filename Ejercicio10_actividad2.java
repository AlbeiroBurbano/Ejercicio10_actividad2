
package com.mycompany.ejercicio10_actividad2;

import java.util.Scanner;

public class Ejercicio10_actividad2 {

    public static void main(String[] args) {
        Scanner leerporteclado = new Scanner(System.in);
        
        int  PAT, ES;
        String NOM, NI;
        double PAGMAT;
        
        System.out.print("Digite el nombre: ");
        NOM = leerporteclado.nextLine();
        
        System.out.print("Ingrese el numero de la inscripcion: ");
        NI = leerporteclado.next();
        

        
        System.out.print("Ingrese el patrimonio: ");
        PAT = leerporteclado.nextInt();
        
        System.out.print("Ingrese el estrato social: ");
        ES = leerporteclado.nextInt();
        
        PAGMAT = 50000;
        
        if (PAT > 2000000 && ES >3){
            PAGMAT = PAGMAT + (0.03*PAT);
        }
        
        System.out.println("El estudiante con numero de inscripcion " + NI+" y nombre "+NOM+" debe pagar: $"+PAGMAT);
    }
}
