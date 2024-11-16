/*
 * StringUtils 11/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package utils;

public class StringUtils {

    /**
     * Transform a text into alphanumeric and lowercase text
     * @return user introduced by the user in the expected state
     */
    public static String getAlphaNumericString() {
        return ScannerUtils.getScanner().nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");
    }
}
