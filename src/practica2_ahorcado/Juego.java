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
        
    //Devuelve true o false si el jugador a adivinado la palabra
    public Boolean AdivinarPalabra(String palabra, Jugadores jugador) {
        Boolean result = null;
        if (this.jugador1.getNombreJugador() == jugador.getNombreJugador()) {
            if(this.jugador2.getPalabraAdivinar().compareTo(palabra) == 0) {
                result = true;
            }
            else {
                result = false;
            }
        }  
        else {
            if(this.jugador1.getPalabraAdivinar().compareTo(palabra) == 0) {
                result = true;
            }
            else {
                result = false;
            }         
        }
        return result;
    }
    
    //Devuelve un 0 si no coincide la letra a adivinar
    public int LetraDisponible(String palabra, Jugadores jugador) {
        int result = 0;
        String letra = "";
        
        letra = String.valueOf(palabra.charAt(0));
        
        if (this.jugador1.getNombreJugador() == jugador.getNombreJugador()) {
            result = this.jugador2.getPalabraAdivinar().indexOf(letra);
        }
        else {
            result = this.jugador1.getPalabraAdivinar().indexOf(letra);
        }
        return result;
    }
    
    //Devuelve un String con la posicion de las letras adivinadas
    public String CambiarLetra(String letra, String cadAdivinar, Jugadores jugador) {
        char [] cadena, cambio = null;


             
        if (this.jugador1.getNombreJugador() == jugador.getNombreJugador()) {
            
            cadena = this.jugador2.getPalabraAdivinar().toCharArray();
            cambio = cadAdivinar.toCharArray();
            
            for (int i = 0; i < cadena.length; i++) {
                if (cadena[i] == letra.charAt(0)) {
                    cambio[i] = cadena[i];
                }
            }
        }
        else {
            cadena = this.jugador1.getPalabraAdivinar().toCharArray();
            cambio = cadAdivinar.toCharArray();
            
            for (int i = 0; i < cadena.length; i++) {
                if (cadena[i] == letra.charAt(0)) {
                    cambio[i] = cadena[i];
                }
            }            
        }
        return String.valueOf(cambio);
    }
}
