package ar.edu.unahur.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TecladoTest {
    private Jugador jugador = new Jugador(0, 0);
    private Teclado teclado = new Teclado(jugador);

    @BeforeEach
    void setUp() {
        jugador.reset();
    }

    @Test
    void alPresionarUnaTecla_ElPersonajeAvanzaCorrectamente() {
        teclado.mover('d');
        assertEquals(1, jugador.getPosX());
        assertEquals(1, jugador.getCantMovimientos());
    }

    @Test
    void alAvanzarYAvanzar_PresionarUnaTecla_ElPersonajeRetrocedaCorrectamente() {
        teclado.mover('d');
        teclado.mover('d');
        teclado.mover('a');

        assertEquals(1, jugador.getPosX());
        assertEquals(3, jugador.getCantMovimientos());
    }

    @Test
    void alPresionarUnaTecla_ElPersonajeCorreCorrectamente() {
        teclado.mover('s');
        assertEquals(3, jugador.getPosX());
        assertEquals(1, jugador.getCantMovimientos());
    }

}
