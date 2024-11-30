/*
 * Exercise13 11/16/2024
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
 * Se leerá un número de teléfono en formato cadena, y se debe convertir de la
 * siguiente manera:
 * Número recibido: 34644683430
 * Nueva cadena: (+34) 644 683 430
 */
public class Exercise13 {

    public static void spainPhoneFormat() {
        System.out.print("Introduce a number: ");
        String number = ScannerUtils.getScanner().nextLine();
        System.out.println("Phone number format: " + phoneFormat(number));
    }

    private static String phoneFormat(String number) {
        // Check Spain Country code
        if ((number.length() < 12) && number.charAt(0) == '3' && number.charAt(1) == '4') {
            String countryCode = number.substring(0, 2);
            String phoneBlock1 = number.substring(2, 5);
            String phoneBlock2 = number.substring(5, 8);
            String phoneBlock3 = number.substring(8, 11);
            return "(+" + countryCode + ") " + phoneBlock1 + " " + phoneBlock2 + " " + phoneBlock3;
        }
        return "Invalid number";
    }
}
