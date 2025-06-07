package ar.edu.unahur.command;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Teclado {
    private final List<String> cararteresValidos = Arrays.asList("a", "d", "s", "w");
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
        if (!cararteresValidos.contains(caracter.toString()))
            throw new TeclaNoValidadException("la tecla " + caracter + " no es válida");
        keysCommand.get(caracter).movete();
    }

}
