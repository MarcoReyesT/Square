/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersquare;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        long baldozas;
        long cantX, cantY;
        //System.out.println("Ingrese el ancho de la plaza");
        Scanner in = new Scanner(System.in);
        int ancho = in.nextInt();

        //System.out.println("Ingrese el largo de la plaza");
        int largo = in.nextInt();

        //System.out.println("Ingrese el tamaño de la baldoza");
        int size = in.nextInt();

        cantY = largo / size;
        if (largo % size != 0) {
            cantY++;
        }
        cantX = ancho / size;
        if (ancho % size != 0) {
            cantX++;
        }
        baldozas = cantX * cantY;
        
        System.out.println(baldozas);
        
    }

}
