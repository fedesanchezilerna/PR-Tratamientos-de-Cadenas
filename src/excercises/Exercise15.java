/*
 * Exercise15 11/16/2024
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
 * Se leerá un texto largo, y deberás indicar el porcentaje de palabras que tienen menos
 * de 5 caracteres y el porcentaje de palabras con 5 o más caracteres.
 */
public class Exercise15 {

    public static void wordsAnalysis() {
        System.out.println("Write a beautiful text: ");
        String userText = ScannerUtils.getScanner().nextLine();

        String[] words = userText.split("\\s+");
        int totalWords = words.length;
        int shortWordsCounter = 0;
        int longWordsCounter = 0;

        // Count short and long words
        for (String word : words) {
            if (word.length() < 5) {
                shortWordsCounter++;
            } else {
                longWordsCounter++;
            }
        }

        // Calculate %
        double shortPercentage = ((double) shortWordsCounter / totalWords) * 100;
        double longPercentage = ((double) longWordsCounter / totalWords) * 100;

        System.out.println("\n Total words: " + totalWords);
        System.out.printf("Less than 5 character words percentage: %.2f%% ~ %d Short words.\n", shortPercentage, shortWordsCounter);
        System.out.printf("More than 5 character words percentage: %.2f%% ~ %d Long words.\n", longPercentage, longWordsCounter);
    }
}
