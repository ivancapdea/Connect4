package es.usantatecla.a3_numbers.a3_even.v0_05;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    int number = console.readInt("Escribe un número? ");
    console.writeln("El numero " + number + " es " + (number % 2 == 0 ? "par" : "impar"));
  }
}
