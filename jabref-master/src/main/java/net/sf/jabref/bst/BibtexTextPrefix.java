/*  Copyright (C) 2003-2011 JabRef contributors.
    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/
// $Id$
package net.sf.jabref.bst;

/**
 * The |built_in| function {\.{text.prefix\$}} pops the top two literals (the
 * integer literal |pop_lit1| and a string literal, in that order). It pushes
 * the substring of the (at most) |pop_lit1| consecutive text characters
 * starting from the beginning of the string. This function is similar to
 * {\.{substring\$}}, but this one considers an accented character (or more
 * precisely, a ``special character''$\!$, even if it's missing its matching
 * |right_brace|) to be a single text character (rather than however many
 * |ASCII_code| characters it actually comprises), and this function doesn't
 * consider braces to be text characters; furthermore, this function appends any
 * needed matching |right_brace|s. If any of the types is incorrect, it
 * complains and pushes the null string.
 */
public class BibtexTextPrefix {

    /**
     * @param numOfChars
     * @param toPrefix
     * @param warn       may-be-null
     * @return
     */
    public static String textPrefix(int inNumOfChars, String toPrefix, Warn warn) {

        int numOfChars = inNumOfChars;
        StringBuilder sb = new StringBuilder();

        char[] cs = toPrefix.toCharArray();
        int n = cs.length;
        int i = 0;

        int braceLevel = 0;

        while ((i < n) && (numOfChars > 0)) {
            char c = cs[i];
            i++;
            if (c == '{') {
                braceLevel++;
                if ((braceLevel == 1) && (i < n) && (cs[i] == '\\')) {
                    i++; // skip backslash
                    while ((i < n) && (braceLevel > 0)) {
                        if (cs[i] == '}') {
                            braceLevel--;
                        } else if (cs[i] == '{') {
                            braceLevel++;
                        }
                        i++;
                    }
                    numOfChars--;
                }
            } else if (c == '}') {
                if (braceLevel > 0) {
                    braceLevel--;
                } else {
                    if (warn != null) {
                        warn.warn("Unbalanced brace in string for purify$: " + toPrefix);
                    }
                }
            } else {
                numOfChars--;
            }

        }
        sb.append(toPrefix.substring(0, i));
        while (braceLevel > 0) {
            sb.append('}');
            braceLevel--;
        }

        return sb.toString();
    }
}
