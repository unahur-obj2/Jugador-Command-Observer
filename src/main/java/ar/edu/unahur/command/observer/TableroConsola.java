package ar.edu.unahur.command.observer;

import ar.edu.unahur.command.Jugador;

public class TableroConsola implements Observador {

    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;

    public void dibujar(int x, int y, int pasos) {
        if (x < 0 || x >= COLUMNAS || y < 0 || y >= FILAS) {
            return;
        }

        // Parte superior
        System.out.print("╔");
        for (int i = 0; i < COLUMNAS - 1; i++) {
            System.out.print("═══╦");
        }
        System.out.println("═══╗");

        // Cuerpo de la grilla
        for (int fila = FILAS - 1; fila >= 0; fila--) {
            System.out.print("║");
            for (int columna = 0; columna < COLUMNAS; columna++) {
                if (columna == x && fila == y) {
                    System.out.print(String.format("%3d", pasos));
                } else {
                    System.out.print("   ");
                }
                System.out.print("║");
            }
            System.out.println();

            if (fila > 0) {
                // Línea intermedia
                System.out.print("╠");
                for (int i = 0; i < COLUMNAS - 1; i++) {
                    System.out.print("═══╬");
                }
                System.out.println("═══╣");
            }
        }

        // Parte inferior
        System.out.print("╚");
        for (int i = 0; i < COLUMNAS - 1; i++) {
            System.out.print("═══╩");
        }
        System.out.println("═══╝");
    }

    @Override
    public void actualizar(Jugador jugador) {
        dibujar(jugador.getPosX(), jugador.getPosY(), jugador.getCantMovimientos());
    }

}
