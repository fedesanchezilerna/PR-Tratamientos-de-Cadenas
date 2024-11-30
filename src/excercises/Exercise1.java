/*
 * Exercise1 11/15/2024
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
 * Muestra la longitud del texto: “This is JAVA!”
 */
public class Exercise1 {

        public static void textLength() {
            System.out.println("Write a text to find its length: ");
            String text = ScannerUtils.getScanner().nextLine();
            System.out.println("Your text length is: " + text.length());
        }
}
