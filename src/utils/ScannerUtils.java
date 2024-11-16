/*
 * Scanner 10/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package utils;

import java.util.Scanner;

public class ScannerUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    /**
     * Read an Integer safely.
     * @return Integer introduced by user.
     */
    public static int readInt() {
        int number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. This is not a Integer number mate :(");
                System.out.print("Please, introduce an Integer: ");
            }
        }
        return number;
    }

    /**
     * Read a Double safely.
     * @return Double introduced by user.
     */
    public static double readDouble() {
        double number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. This is not a Double number mate :(");
                System.out.print("Please, introduce a Double: ");
            }
        }
        return number;
    }

    public static void closeScanner() {
        scanner.close();
    }
}
