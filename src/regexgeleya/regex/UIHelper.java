/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regexgeleya.regex;

import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;

/**
 *
 * @author Thejesh_GN
 */
public class UIHelper {

    public static Color DEFAULT_HIGHLIGHT_COLOR = new Color(206, 255, 123);
    public static Color DEFAULT_CLEAR_COLOR = new Color(255, 255, 255);
    public static Color DEFAULT_ERROR_COLOR = new Color(255, 255, 255);
    private static DefaultHighlightPainter painter;

    public static void highlight(List<Match> matches, javax.swing.JTextArea jTextAreaTestText) {
        try {
            for (Match match : matches) {
                jTextAreaTestText.getHighlighter().addHighlight(match.getStart(), match.end, getCurrentLineHighlighter(null));
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(UIHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DefaultHighlightPainter getCurrentLineHighlighter(Color highlightColor) {
        if (painter == null) {
            Color c = highlightColor != null ? highlightColor : DEFAULT_HIGHLIGHT_COLOR;
            painter = new DefaultHighlighter.DefaultHighlightPainter(c);
        }
        return painter;
    }
}
