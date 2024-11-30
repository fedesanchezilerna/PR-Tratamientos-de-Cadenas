/*
 * Exercise3 11/15/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package excercises;

import utils.ScannerUtils;

/**
 * Invertir el texto: “Tratamiento de cadenas con JAVA”
 */
public class Exercise3 {

    public static void textInverter() {
        System.out.println("Write a text to invert: ");
        String text = ScannerUtils.getScanner().nextLine();
        int textLength = text.length();

        for (int i = textLength - 1 ; i >= 0; i--) {
            System.out.println(text.charAt(i));
        }
    }
}
