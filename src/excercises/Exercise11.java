/*
 * Exercise11 11/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package excercises;

import utils.ScannerUtils;

import java.util.Arrays;

public class Exercise11 {

    public static void largestWord() {
        System.out.println("Write something to find its laaaaargest word: ");
        String userText = ScannerUtils.getScanner().nextLine();

        String[] words = userText.split(" ");

        String largestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                largestWord = word;
                maxLength = word.length();
            }
        }

        System.out.println("Words introduced: " + Arrays.toString(words));
        System.out.println("Largest word: " + largestWord);
        System.out.println("Word length: " + maxLength);
    }
}
