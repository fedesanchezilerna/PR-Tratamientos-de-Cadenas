/*
 * Exercise6 11/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package excercises;

/**
 * Divide la cadena de texto “Este es el módulo, de programación” en dos partes: “Este
 * es el módulo” y “de programación”.
 * Muéstralas por separado, y después, vuelve a concatenarlas y vuelve a mostrarlas
 * unidas.
 */
public class Exercise6 {

    public static void textDividing(){
        String text = "Este es el módulo, de programación";

        int divisor = text.indexOf(',');

        String firstPart = text.substring(0, divisor);
        String secondPart = text.substring(divisor + 1);
        String concatenatedText = firstPart.concat(secondPart);

        System.out.println("Original Text: " + text);
        System.out.println("Primera parte: \"" + firstPart + "\"");
        System.out.println("Segunda parte: \"" + secondPart + "\"");
        System.out.println("Text concatenated: " + concatenatedText);
    }
}
