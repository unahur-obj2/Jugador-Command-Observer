package ar.edu.unahur.command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Correr extends MovimientoCommand {

    private List<MovimientoCommand> movs = new ArrayList<>();

    public Correr(Jugador jugador, Integer cantidad) {
        super(jugador);
        IntStream.rangeClosed(1, 3).forEach(i -> movs.add(new Avanzar(jugador)));
    }

    @Override
    public void doMovete() {
        movs.forEach(MovimientoCommand::doMovete);
    }

}
