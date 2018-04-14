/*
 * java-tron is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * java-tron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.tron.common.utils;

import com.google.protobuf.ByteString;

public class StringUtil {

  /**
   * n-bits hex string.
   *
   * @param str target string
   * @param bits string bits
   */
  public static boolean isHexString(String str, int bits) {
    String regex = String.format("^[A-Fa-f0-9]{%d}$", bits);
    return str.matches(regex);
  }


  public static byte[] createDbKey(ByteString string) {
    return string.toByteArray();
  }

  public static String createReadableString(ByteString string) {
    return ByteArray.toHexString(string.toByteArray());
  }
}