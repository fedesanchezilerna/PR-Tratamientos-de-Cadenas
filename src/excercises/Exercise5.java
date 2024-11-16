/*
 * Excercise5 11/15/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package excercises;

import utils.StringUtils;

public class Exercise5 {

    public static void vocalsCounter() {
        System.out.println("Write a text to count its vocals and consonants: ");
        String text = StringUtils.getAlphaNumericString();
        int textLength = text.length();
        int vocalCounter = 0;
        int consonantCounter = 0;

        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                vocalCounter++;
            } else {
                consonantCounter++;
            }
        }
        System.out.println("Number of vocals in the text:     " + vocalCounter);
        System.out.println("Number of consonants in the text: " + consonantCounter);
    }

}
