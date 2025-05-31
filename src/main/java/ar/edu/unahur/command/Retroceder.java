package ar.edu.unahur.command;

public class Retroceder extends MovimientoCommand {

    public Retroceder(Jugador jugador) {
        super(jugador);
    }

    @Override
    public void doMovete() {
        jugador.retroceder();
    }

}
