/*
 * Exercise4 11/15/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package excercises;

import utils.ScannerUtils;

public class Exercise4 {

    public static void removeSpaces() {
        System.out.println("Write a text to remove its spaces: ");
        String text = ScannerUtils.getScanner().nextLine();
        String textWithoutSpaces = ScannerUtils.getAlphaNumericString();
        System.out.println("Your original text:  " + text);
        System.out.println("Text without spaces: " + textWithoutSpaces );
    }
}
