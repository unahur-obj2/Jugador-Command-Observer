
package ar.edu.unahur.command;

public class EstadoANotificar {

    private final Integer posX;
    private final Integer poxY;
    private final Integer cantMovims;

    public EstadoANotificar(Integer posX, Integer poxY, Integer cantMovims) {
        this.posX = posX;
        this.poxY = poxY;
        this.cantMovims = cantMovims;
    }

    public Integer getPosX() {
        return posX;
    }

    public Integer getPoxY() {
        return poxY;
    }

    public Integer getCantMovims() {
        return cantMovims;
    }

}
