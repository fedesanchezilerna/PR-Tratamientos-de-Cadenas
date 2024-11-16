/*
 * Exercise12 11/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package excercises;

import utils.ScannerUtils;

public class Exercise12 {

    public static void wordsCounter() {
        System.out.println("Write something: ");
        String text = ScannerUtils.getScanner().nextLine();

        String[] words = text.split(" ");
        int numberOfWords = words.length;

        System.out.println("Number of words: " + numberOfWords);
    }
}
