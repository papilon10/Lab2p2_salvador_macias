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

    public static ArrayList lista_mapas = new ArrayList();
    public static ArrayList lista_enemigos = new ArrayList();
    public static ArrayList lista_heroes = new ArrayList();

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

                boolean salida_sub = false;
                do {
                    System.out.println("---submenu---");
                    System.out.println("1.ingresar como administador");
                    System.out.println("2.ingresar como jugador");
                    System.out.println("0.salir");
                    int opc_sub = lea.nextInt();
                    switch (opc_sub) {
                        case 1: {
                            boolean salida_admin = false;
                            do {
                                System.out.println("---menu administrador---");
                                System.out.println("1.agregar mapa ");
                                System.out.println("2.agregar enemigo ");
                                System.out.println("3.modificar mapa ");
                                System.out.println("4.modificar enemigo ");
                                System.out.println("5.listar mapas");
                                System.out.println("6.listar enemigos");
                                System.out.println("7.borrar mapa");
                                System.out.println("8.borrar enemigo");
                                System.out.println("0.salir");
                                int opc_admin = lea.nextInt();
                                switch (opc_admin) {
                                    case 1: {

                                    }

                                    break;
                                    case 2: {

                                    }

                                    break;
                                    case 3: {

                                    }

                                    break;
                                    case 4: {

                                    }

                                    break;
                                    case 5: {

                                    }

                                    break;
                                    case 6: {

                                    }

                                    break;
                                    case 7: {

                                    }

                                    break;
                                    case 8: {

                                    }

                                    break;
                                    case 0: {
                                        System.out.println("se abandonara el menu de adminstrador");
                                        salida_admin=true;
                                    }

                                    break;
                                    default:
                                        System.out.println("opcion ingresada es invalida");
                                }

                            } while (salida_admin != true);//fin while admin

                        }

                        break;
                        case 2: {
                            System.out.println("e");

                        }

                        break;
                        case 0: {
                            System.out.println("se abandonara el submenu");
                            salida_sub = true;

                        }

                        break;
                        default:
                            System.out.println("opcion ingresada es invalida");
                    }

                } while (salida_sub != true);//fin while submenu

            } else if (opc == 0) {
                System.out.println("se abandonara el programa");
                salida = true;

            } else {
                System.out.println("opcion ingresada es invalida");

            }

        } while (salida != true);//fin while menu principal

    }//fin main

}//fin clase
