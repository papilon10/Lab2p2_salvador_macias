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
                                        System.out.println("ingrese el nombre de la zona: ");
                                        String zona = str.nextLine();
                                        System.out.println("ingrese el clima: ");
                                        String clima = str.nextLine();
                                        System.out.println("ingrese el efecto del clima en el heroe : ");
                                        int efecto_clima_heroe = lea.nextInt();
                                        System.out.println("ingrese el efecto del clima en el enemigo :");
                                        int efecto_clima_enemigo = lea.nextInt();
                                        lista_mapas.add(new mapa(zona, clima, efecto_clima_heroe, efecto_clima_enemigo));

                                    }

                                    break;
                                    case 2: {
                                        System.out.println("ingrese el nombre del enemigo :");
                                        String nombre = str.nextLine();
                                        System.out.println("ingrese la vida: ");
                                        int vida = lea.nextInt();
                                        System.out.println("ingrese el ataque: ");
                                        int ataque = lea.nextInt();
                                        lista_enemigos.add(new enemigo(nombre, vida, ataque));

                                    }

                                    break;
                                    case 3: {
                                        System.out.println("");

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
                                        salida_admin = true;
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

    public static void listar_mapas() {
        System.out.println("---lista de mapas---");
        for (int i = 0; i < lista_mapas.size(); i++) {
            System.out.println(
                    lista_mapas.indexOf(lista_mapas.get(i)) + "-"
                    + lista_mapas.get(i)
            );
        }

    }
    
    public static void listar_enemigos() {
        System.out.println("---lista de enemigos---");
        for (int i = 0; i < lista_enemigos.size(); i++) {
            System.out.println(
                    lista_enemigos.indexOf(lista_enemigos.get(i)) + "-"
                    + lista_enemigos.get(i)
            );
        }

    }

}//fin clase
