package ar.edu.unahur.command;

public class Subir extends MovimientoCommand {

    public Subir(Jugador jugador) {
        super(jugador);
    }

    @Override
    public void doMovete() {
        jugador.subir();
    }

}
