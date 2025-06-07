package ar.edu.unahur.command;

import java.util.Scanner;

import ar.edu.unahur.command.observer.TableroConsola;

public class Main {
    public static void main(String[] args) {
        TableroConsola tc = new TableroConsola();
        Jugador jugador = new Jugador(0, 0);
        jugador.agregarObservador(tc);

        Teclado teclado = new Teclado(jugador);
        Scanner sc = new Scanner(System.in);

        Character c = sc.next().toLowerCase().charAt(0);

        while (c != 'q') {
            try {
                teclado.mover(c);
            } catch (TeclaNoValidadException tnve) {
                System.out.println(tnve.getMessage());
            }
            c = sc.next().toLowerCase().charAt(0);
        }
        sc.close();
    }
}