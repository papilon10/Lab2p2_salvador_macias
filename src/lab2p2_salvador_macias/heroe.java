/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_salvador_macias;

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

    @Override
    public String toString() {
        return "nombre del heroe: "+nombre + "\narma: "+ arma + "\nvida: "+ vida + "\nataque: "+ataque;
    }

    
}
