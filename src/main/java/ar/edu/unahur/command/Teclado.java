package ar.edu.unahur.command;

import java.util.Arrays;
import java.util.HashMap;

public class Teclado {

    private HashMap<Character, MovimientoCommand> keysCommand = new HashMap<>();

    public Teclado(Jugador jugador) {
        keysCommand.put('d', new Avanzar(jugador));
        keysCommand.put('a', new Retroceder(jugador));
        keysCommand.put('s',
                new Correr(
                        jugador,
                        3));
        keysCommand.put('w', new Subir(jugador));
    }

    public void mover(Character caracter) {
        keysCommand.get(caracter).movete();
    }

}
