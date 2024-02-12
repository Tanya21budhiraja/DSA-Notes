package Array;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {
    // H INDEX = maximum no of paper with citation greater then or equal to the
    // number of papers
    // in this question arrays index represent no of papers also {i+1} as array
    // starts from zero

    // { 3, 0 , 6,1,5}
    // papers = 5
    // no of papes greater or equal to 5 are 2 only
    // similarly for 4 = 2
    // for 3 =3
    // h index = 3;

    // {1,3,1}
    // for 3 = 1
    // for 2 = 1
    // for 1 = 2
    // ans == 1

    public int hIndex(int[] citations) {
        int n = citations.length;
        Integer[] c = new Integer[n];

        for (int i = 0; i < n; i++) {
            c[i] = citations[i];
        }
        Arrays.sort(c, Collections.reverseOrder());

        int cnt = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= i + 1) {
                cnt++;
            } else {
                return i;
            }
        }
        return cnt;

    }
}
