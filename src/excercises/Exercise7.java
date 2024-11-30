/*
 * Exercise7 11/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package excercises;

/**
 * Transforma la cadena de texto “ilerna” a mayúsculas. Guarda el valor en la variable y
 * posteriormente conviértela nuevamente en minúsculas.
 */
public class Exercise7 {

    public static void toUpperAndLowerCase() {
        String text = "ilerna";
        String textUpperCase = text.toUpperCase();
        String textLowerCase = text.toLowerCase();

        System.out.println("Original text:  " + text);
        System.out.println("UpperCase text: " + textUpperCase);
        System.out.println("LowerCase text: " + textLowerCase + "\n");
    }
}
