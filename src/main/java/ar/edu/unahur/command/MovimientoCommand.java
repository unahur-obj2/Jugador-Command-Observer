package ar.edu.unahur.command;

public abstract class MovimientoCommand {

    protected Jugador jugador;

    public MovimientoCommand(Jugador jugador) {
        this.jugador = jugador;
    }

    public void movete() {
        jugador.incMovimientos();
        this.doMovete();
    }

    public abstract void doMovete();
}
