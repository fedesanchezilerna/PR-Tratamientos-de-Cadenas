/*
 * Exercise2 11/15/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package excercises;

import utils.ScannerUtils;

public class Exercise2 {

    public static void crumbleText() {
        System.out.println("Write a text tu crumble in pieces :)");
        String text = ScannerUtils.getScanner().nextLine();
        int textLength = text.length();
        for (int i = 0; i < textLength; i++) {
            System.out.println(text.charAt(i));
        }
    }
}
