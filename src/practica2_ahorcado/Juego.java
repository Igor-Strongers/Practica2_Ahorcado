/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_ahorcado;

/**
 *
 * @author usuario
 */
public class Juego {
    private Jugadores jugador1;
    private Jugadores jugador2;

    public Juego() {
    }

    public Jugadores getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugadores jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugadores getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugadores jugador2) {
        this.jugador2 = jugador2;
    }
    
    public String TurnoJugador(Jugadores jug1, Jugadores jug2) {
        
        return "0";
    }
    
    //Devuelve true o false si el jugador a adivinado la palabra
    public Boolean AdivinarPalabra(String palabra, Jugadores jugador) {
        
        return false;
    }
    
    //Guarda la palabra a adivinar en el jugador
    public void PonerPalabra(String palabra, Jugadores jugador) {
        
    }
    
    //Devuelve un array con la posicion de las letras
    public int[] ComprobarLetra(String letra, Jugadores jugador) {
        
        return null;
    }
}
