/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_salvador_macias;

/**
 *
 * @author Apple
 */
public class mapa {

    private String zona;
    private String clima;
    private int efecto_clima_heroe;
    private int efecto_clima_enemigo;

    public mapa() {
    }

    public mapa(String zona, String clima, int efecto_clima_heroe, int efecto_clima_enemigo) {
        this.zona = zona;
        this.clima = clima;
        this.efecto_clima_heroe = efecto_clima_heroe;
        this.efecto_clima_enemigo = efecto_clima_enemigo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getEfecto_clima_heroe() {
        return efecto_clima_heroe;
    }

    public void setEfecto_clima_heroe(int efecto_clima_heroe) {
        this.efecto_clima_heroe = efecto_clima_heroe;
    }

    public int getEfecto_clima_enemigo() {
        return efecto_clima_enemigo;
    }

    public void setEfecto_clima_enemigo(int efecto_clima_enemigo) {
        this.efecto_clima_enemigo = efecto_clima_enemigo;
    }

    @Override
    public String toString() {
        return "nombre del mapa:  "+zona + "\nclima del mapa: "+clima+ "\nefecto del clima sobre el heroe: "+efecto_clima_heroe+ " puntos de vida "
                + "restados "+ "\nefecto del clima sobre el enemigo: "+efecto_clima_enemigo+ " puntos de vida restados "  ;
    }

}
