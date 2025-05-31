package ar.edu.unahur.command.observer;

public interface Observable {
    void agregarObservador(Observador observador);

    void quitarObservador(Observador observador);

    void notificar();
}
