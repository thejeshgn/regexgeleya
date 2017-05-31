/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regexgeleya.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;

/**
 *
 * @author Thejesh_GN
 */
public class RegExCompile {

    public static List<Match> compile(String regex, String str) {
        List matches = new ArrayList<Match>();
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str + "");
        boolean result = m.find();

        // Loop through and create a new String
        // with the replacements
        StringBuffer sb = new StringBuffer();
        while (result) {
            //m.appendReplacement(sb, "dog");
            matches.add(new Match(m.start(), m.end()));
            Logger.getLogger(RegExCompile.class.getName()).log(Level.FINE, m.start() + " - " + m.end() + "|");
            result = m.find();
        }
        // Add the lsast segment of input to
        // the new String
        //m.appendTail(sb);

        return matches;

    }
}
