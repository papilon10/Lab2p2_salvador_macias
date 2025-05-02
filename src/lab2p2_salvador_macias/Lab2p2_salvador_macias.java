/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_salvador_macias;

import java.util.ArrayList;
import java.util.Scanner;

//fila 3 silla 6
/**
 *
 *
 * @author Apple
 */
public class Lab2p2_salvador_macias {

    public static ArrayList<mapa> lista_mapas = new ArrayList();
    public static ArrayList<enemigo> lista_enemigos = new ArrayList();
    public static ArrayList<heroe> lista_heroes = new ArrayList();

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
                                        if (lista_mapas.size() == 0) {
                                            System.out.println("la lista de mapas esta vacia");
                                        } else {
                                            listar_mapas();
                                            System.out.println("ingrese el indice del mapa a modificar :");
                                            int mod_mapa = lea.nextInt();
                                            lista_mapas.get(mod_mapa);
                                            System.out.println("ingrese el nombre de la zona: ");
                                            String nombre = str.nextLine();
                                            lista_mapas.get(mod_mapa).setZona(nombre);
                                            System.out.println("ingrese el clima: ");
                                            String clima = str.nextLine();
                                            lista_mapas.get(mod_mapa).setClima(clima);
                                            System.out.println("ingrese el efecto del clima en el heroe : ");
                                            int efecto_clima_heroe = lea.nextInt();
                                            lista_mapas.get(mod_mapa).setEfecto_clima_heroe(efecto_clima_heroe);
                                            System.out.println("ingrese el efecto del clima en el enemigo :");
                                            int efecto_clima_enemigo = lea.nextInt();
                                            lista_mapas.get(mod_mapa).setEfecto_clima_enemigo(efecto_clima_enemigo);

                                        }

                                    }

                                    break;
                                    case 4: {
                                        if (lista_enemigos.size() == 0) {
                                            System.out.println("la lista de enemigos esta vacia");
                                        } else {
                                            listar_enemigos();
                                            System.out.println("ingrese el indice del enemigo a modificar : ");
                                            int mod_enemigo = lea.nextInt();
                                            System.out.println("ingrese el nombre del enemigo :");
                                            String nombre = str.nextLine();
                                            lista_enemigos.get(mod_enemigo).setNombre(nombre);
                                            System.out.println("ingrese la vida: ");
                                            int vida = lea.nextInt();
                                            lista_enemigos.get(mod_enemigo).setVida(vida);
                                            System.out.println("ingrese el ataque: ");
                                            int ataque = lea.nextInt();
                                            lista_enemigos.get(mod_enemigo).setAtaque(ataque);

                                        }

                                    }

                                    break;
                                    case 5: {
                                        listar_mapas();
                                    }

                                    break;
                                    case 6: {
                                        listar_enemigos();

                                    }

                                    break;
                                    case 7: {
                                        if (lista_mapas.size() == 0) {
                                            System.out.println("la lista de mapas esta vacia");
                                        } else {
                                            listar_mapas();
                                            System.out.println("ingrese el indice del mapa que desea borrar :");
                                            int borrar_mapa = lea.nextInt();
                                            lista_mapas.remove(borrar_mapa);

                                        }

                                    }

                                    break;
                                    case 8: {
                                        if (lista_enemigos.size() == 0) {
                                            System.out.println("la lista de enemigos esta vacia");
                                        } else {
                                            listar_enemigos();
                                            System.out.println("ingrese el indice del enemigo que desea borrar :");
                                            int borrar_enemigo = lea.nextInt();
                                            lista_mapas.remove(borrar_enemigo);

                                        }

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
                            boolean salida_jugador = false;
                            do {
                                System.out.println("1.explorar");
                                System.out.println("0.volver al menu principal");
                                int opc_jugador = lea.nextInt();
                                if (opc_jugador == 1) {
                                    System.out.println("ingrese el nombre del heroe : ");
                                    String nombre = str.nextLine();
                                    String arma = "piocha";
                                    int vida = 300;
                                    int ataque = 350;
                                    lista_heroes.add(new heroe(nombre, arma, vida, ataque));
                                    heroe.explorar(lista_mapas, lista_heroes, lista_enemigos);
                                    heroe.explorar(lista_mapas, lista_heroes, lista_enemigos, opc_jugador);

                                } else if (opc_jugador == 0) {
                                    System.out.println("se abandonara el menu de jugador");
                                    salida_jugador = true;

                                } else {
                                    System.out.println("la opcion ingresada es invalida");
                                }
                            } while (salida_jugador != true);

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
        if (lista_mapas.isEmpty()) {
            System.out.println("la lista de mapas esta vacia");
        } else {
            for (int i = 0; i < lista_mapas.size(); i++) {
                System.out.println(
                        lista_mapas.indexOf(lista_mapas.get(i)) + "-"
                        + lista_mapas.get(i)
                );
            }

        }

    }

    public static void listar_enemigos() {
        System.out.println("---lista de enemigos---");
        if (lista_enemigos.isEmpty()) {
            System.out.println("la lista de enemigos esta vacia");
        } else {
            for (int i = 0; i < lista_enemigos.size(); i++) {
                System.out.println(
                        lista_enemigos.indexOf(lista_enemigos.get(i)) + "-"
                        + lista_enemigos.get(i)
                );
            }
        }

    }

}//fin clase
