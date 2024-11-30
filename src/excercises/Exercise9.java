/*
 * Excercise9 11/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package excercises;

/**
 * Sobre la cadena de texto “JEVE JEVE JEVE”, sustituye/reemplaza todas las vocales e
 * por la vocal a dando como resultado “JAVA JAVA JAVA”.
 */
public class Exercise9 {

    public static void substituteVocalEtoA() {
        String text = "JEVE JEVE JEVE";

        String textWithReplacedVocal = text.replaceAll("E", "A");
        System.out.println("Original text: " + text);
        System.out.println("Modified text: " + textWithReplacedVocal);
    }
}
