package hr.pejak.lib;

import java.util.Comparator;

public class StringLengthComparator implements Comparator <String> {

    @Override
    public int compare(String s, String s1) {
        int len1 = s.length();
        int len2 = s1.length();

        if (len1 > len2){
            return 1;
        } else if (len1 < len2){
            return -1;
        }

        return 0;
    }
}
