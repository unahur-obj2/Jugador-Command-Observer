package ar.edu.unahur.command;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.command.observer.Observable;
import ar.edu.unahur.command.observer.Observador;

public class Jugador implements Observable {
    private Integer posX;
    private Integer posY;
    private Integer cantMovimientos = 0;
    private Set<Observador> observadores = new HashSet<>();

    public Jugador(Integer posX, Integer posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void avanzar() {
        posX++;
        notificar();
    }

    public void retroceder() {
        posX--;
        notificar();
    }

    public void subir() {
        posY++;
        notificar();
    }

    public void bajar() {
        posY--;
        notificar();
    }

    public void incMovimientos() {
        cantMovimientos++;
    }

    public Integer getPosX() {
        return posX;
    }

    public Integer getCantMovimientos() {
        return cantMovimientos;
    }

    public Integer getPosY() {
        return posY;
    }

    public void reset() {
        posX = 0;
        posY = 0;
        cantMovimientos = 0;
        notificar();
    }

    public void setCantMovimientos(Integer cantMovimientos) {
        this.cantMovimientos = cantMovimientos;
    }

    @Override
    public String toString() {
        return "Jugador [posX=" + posX + ", posY=" + posY + ", cantMovimientos=" + cantMovimientos + "]";
    }

    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void quitarObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar() {
        observadores.forEach(o -> o.actualizar(this));
    }

}
