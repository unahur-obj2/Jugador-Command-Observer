package ar.edu.unahur.command.observer;

import ar.edu.unahur.command.EstadoANotificar;

public interface Observador {
    void actualizar(EstadoANotificar estadoANotificar);
}
