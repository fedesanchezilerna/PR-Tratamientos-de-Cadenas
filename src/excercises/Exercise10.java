/*
 * Exercise10 11/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package excercises;

/**
 * Transforma la cadena de caracteres del String: “ABCD” a ASCII. Para ello debes
 * desglosar la cadena y transformar cada carácter a ASCII.
 */
public class Exercise10 {

    public static void textToASCII() {
        String string = "ABCD";
        char[] characters = string.toCharArray();

        System.out.println("Original String: " + string);
        System.out.print("ASCII values: ");

        for (char c : characters) {
            System.out.print((int) c + " ");
        }

        System.out.println("\n");
    }
}
