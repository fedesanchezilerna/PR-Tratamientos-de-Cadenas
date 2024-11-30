/*
 * Exercise14 11/16/2024
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
 * Hacer un programa que al recibir como datos dos cadenas de caracteres, forme una
 * cadena intercalando los caracteres de las palabras de las cadenas recibidas.
 */
public class Exercise14 {

    public static void textMixer() {
        System.out.print("Write your 1st text: ");
        String userText1 = ScannerUtils.getScanner().nextLine();
        System.out.print("Write your 2nd text: ");
        String userText2 = ScannerUtils.getScanner().nextLine();
        System.out.println("Let's mix them :)");

        System.out.println(intercalateString(userText1, userText2));
    }

    private static String intercalateString(String text1, String text2) {
        StringBuilder mixedText = new StringBuilder();
        int minLength = Math.min(text1.length(), text2.length()); // In case words have different length

        for (int i = 0; i < minLength; i++) {
            mixedText.append(text1.charAt(i));
            mixedText.append(text2.charAt(i));
        }

        // Add remaining char (if needed)
        mixedText.append(text1.substring(minLength));
        mixedText.append(text2.substring(minLength));

        return mixedText.toString();
    }
}
