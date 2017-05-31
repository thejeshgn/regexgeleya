/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regexgeleya.regex;

/**
 *
 * @author Thejesh_GN
 */
public class Match {

    int start;
    int end;

    public Match(int start, int end) {
        this.end = end;
        this.start = start;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
