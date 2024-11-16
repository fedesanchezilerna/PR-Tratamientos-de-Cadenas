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
                1.  Text Length.
                2.  Crumble Text.
                3.  Text Inverter.
                4.  Spaces Remover.
                5.  Vocal/Consonant Counter.
                6.  Text Divider
                7.  
                8.  
                9.  
                10. 
                11. 
                12. 
                13. 
                14. 
                15. 
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
