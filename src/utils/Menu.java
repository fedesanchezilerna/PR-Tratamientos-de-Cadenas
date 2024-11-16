/*
 * Menu 11/15/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package utils;

public class Menu {

    public static void mainMenu() {
        System.out.println("""
                ===============================
                MAIN MENU
                Select an exercise:
                1.  Text Length
                2.  Crumble Text
                3.  Text Inverter
                4.  Spaces Remover
                5.  Vocal/Consonant Counter
                6.  Text Divider
                7.  Text to UpperCase and LowerCase
                8.  Compare JAVA - JavaScript
                9.  "JEVE to JAVA"
                10. Text to ASCII
                11. Largest Word in text
                12. Words Counter
                13. Spain Phone Number Format
                14. Text Mixer
                15. Text Length % in text
                ===============================
                """);
    }

    public static void endExerciseMenu() {
        System.out.println("""
                ===============================
                End of exercise.
                0.  Exit application.
                1.  Back to Main Menu.
                ===============================
                """);
    }
}
