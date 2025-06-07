package ar.edu.unahur.command.observer;

import ar.edu.unahur.command.EstadoANotificar;

import ar.edu.unahur.command.Sender;

public class TableroWeb implements Observador {

    private Sender sender;

    public TableroWeb(String urlString) {
        sender = new Sender(urlString);
    }

    @Override
    public void actualizar(EstadoANotificar estadoANotificar) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        sender.enviarMovimiento(estadoANotificar.getPosX(), estadoANotificar.getPoxY(),
                estadoANotificar.getCantMovims());
    }

}
