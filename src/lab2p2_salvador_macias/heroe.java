/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_salvador_macias;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Apple
 */
public class heroe {

    private String nombre;
    private String arma;
    private int vida;
    private int ataque;

    public heroe() {
    }

    public heroe(String nombre, String arma, int vida, int ataque) {
        this.nombre = nombre;
        this.arma = arma;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public static Random random = new Random();
    public static int aleatorio = random.nextInt(4);
    public static int aleatorio_enemigos = random.nextInt(Lab2p2_salvador_macias.lista_enemigos.size());
    public static int aleatorio_mapas = random.nextInt(Lab2p2_salvador_macias.lista_mapas.size());

    public static void explorar(ArrayList<mapa> lista_mapas,ArrayList<heroe> lista_heroes,ArrayList<enemigo> lista_enemigos) {
        if (Lab2p2_salvador_macias.lista_enemigos.isEmpty() && Lab2p2_salvador_macias.lista_mapas.isEmpty()) {
            System.out.println("no se puede explorar debido a que la lista de mapas y enemigos esta vacia ");
        } else {

            if (aleatorio == 0) {
                System.out.println("->" + Lab2p2_salvador_macias.lista_heroes.get(0).getNombre()
                        + " se enfrento a un " + Lab2p2_salvador_macias.lista_enemigos.get(aleatorio_enemigos).getNombre()
                        + " en " + Lab2p2_salvador_macias.lista_mapas.get(aleatorio_mapas).getZona() + " con ataque basico");

                System.out.println("->" + Lab2p2_salvador_macias.lista_heroes.get(0).getNombre()
                        + " le quito al enemigo " + Lab2p2_salvador_macias.lista_enemigos.get(aleatorio_enemigos).getNombre()
                        + Lab2p2_salvador_macias.lista_heroes.get(0).getAtaque() + " puntos de vida y recibio un dano de "
                        + Lab2p2_salvador_macias.lista_enemigos.get(aleatorio_enemigos).getAtaque()
                );

                System.out.println("->" + "por efectos del clima, el heroe perdio : " + Lab2p2_salvador_macias.lista_mapas.get(aleatorio_mapas)
                        .getEfecto_clima_heroe() + "puntos de vida y el enemigo " + Lab2p2_salvador_macias.lista_mapas.get(aleatorio_mapas)
                                .getEfecto_clima_enemigo());

                //System.out.println("->" + "vida restante del heroe: "+Lab2p2_salvador_macias.lista_heroes.get(0).getVida()
                //-Lab2p2_salvador_macias.lista_enemigos.get(aleatorio_enemigos).getAtaque()+Lab2p2_salvador_macias.lista_mapas
                //.get(aleatorio_mapas).getEfecto_clima_heroe());
            } else if (aleatorio == 1 || aleatorio == 2 || aleatorio == 3) {
                explorar(lista_mapas, lista_heroes, lista_enemigos, aleatorio);
            }

        }

    }

    public static void explorar(ArrayList<mapa> lista_mapas,ArrayList<heroe> lista_heroes,ArrayList<enemigo> lista_enemigos, int multiplicador) {
        multiplicador = aleatorio;
        multiplicador = Lab2p2_salvador_macias.lista_heroes.get(0).ataque * multiplicador;
        System.out.println("->" + Lab2p2_salvador_macias.lista_heroes.get(0).getNombre()
                + " se enfrento a un " + Lab2p2_salvador_macias.lista_enemigos.get(aleatorio_enemigos).getNombre()
                + " en " + Lab2p2_salvador_macias.lista_mapas.get(aleatorio_mapas).getZona() + " con "
        + Lab2p2_salvador_macias.lista_heroes.get(0).getArma());

        System.out.println("->" + Lab2p2_salvador_macias.lista_heroes.get(0).getNombre()
                + " le quito al enemigo " + multiplicador + " puntos de vida y recibio un dano de "
                + Lab2p2_salvador_macias.lista_enemigos.get(aleatorio_enemigos).getAtaque()
        );

        System.out.println("->" + "por efectos del clima, el heroe perdio : " + Lab2p2_salvador_macias.lista_mapas.get(aleatorio_mapas)
                .getEfecto_clima_heroe() + "puntos de vida y el enemigo " + Lab2p2_salvador_macias.lista_mapas.get(aleatorio_mapas)
                        .getEfecto_clima_enemigo());

    }

    @Override
    public String toString() {
        return "nombre del heroe: " + nombre + "\narma: " + arma + "\nvida: " + vida + "\nataque: " + ataque;
    }

}
