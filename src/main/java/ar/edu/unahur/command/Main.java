package ar.edu.unahur.command;

import java.util.Scanner;

import ar.edu.unahur.command.observer.TableroConsola;
import ar.edu.unahur.command.observer.TableroWeb;

public class Main {
    public static void main(String[] args) {
        TableroConsola tc = new TableroConsola();
        TableroWeb tw = new TableroWeb("http://alocalhost:3000/move");
        Jugador jugador = new Jugador(0, 0);
        jugador.agregarObservador(tc);
        jugador.agregarObservador(tw);
        Teclado teclado = new Teclado(jugador);
        Scanner sc = new Scanner(System.in);

        Character c = sc.next().toLowerCase().charAt(0);

        while (c != 'q') {
            teclado.mover(c);
            c = sc.next().toLowerCase().charAt(0);
        }
        sc.close();
    }
}