/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_salvador_macias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Lab2p2_salvador_macias {

    public static ArrayList lista = new ArrayList();
    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salida = false;
        do {
            System.out.println("---menu---");
            System.out.println("1.zeldaRPG");
            System.out.println("0.salir");
            int opc = lea.nextInt();
            if (opc == 1) {

                System.out.println("a");
            } else if (opc == 0) {
                System.out.println("se abandonara el programa");
                salida = true;

            } else {
                System.out.println("opcion ingresada es invalida");

            }

        } while (salida != true);

    }

}
