package Strings;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    // space = words - 1
    // spaceslots = maxwidth - lettercounts
    // both are diff
    // for every line except last we have to adjust extra space to the left if not
    // equal spaces
    // for last line to the right no spaces between
    // pehle while loop( <n chlege kyuki last line ka diff h) me lettercount plus
    // spaceslots check krenge
    // again while loop to check if i can add next word
    // then find remaining slots
    // then eachwordsapce and exraspace
    // then for last line each space is 1 and extra is 0
    // then ab result me string add krni h
    // for string new string create kri amnd loop j tak chlega kyuki tabhi to i tak
    // strimg me dalenege loop break hi j se hoga
    // J tak add kra
    // then spaces set ki to the left jo extra h

    int Width;

    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();
        int n = words.length;
        Width = maxWidth;
        int i = 0;

        while (i < n) {

            int lettersCount = words[i].length();
            int j = i + 1;
            int spaceSlots = 0;

            while (j < n && spaceSlots + lettersCount + words[j].length() + 1 <= maxWidth) {
                lettersCount += words[j].length();
                spaceSlots += 1;
                j++;
            }

            int remainingSlots = maxWidth - lettersCount;

            int eachWordSpace = spaceSlots == 0 ? 0 : remainingSlots / spaceSlots;
            int extraSpace = spaceSlots == 0 ? 0 : remainingSlots % spaceSlots;

            if (j == n) {
                eachWordSpace = 1;
                extraSpace = 0;
            }
            result.add(getFinalWord(words, i, j, eachWordSpace, extraSpace));
            i = j;
        }

        return result;
    }

    private String getFinalWord(String[] words, int i, int j, int eachWordSpace, int extraSpace) {
        StringBuilder s = new StringBuilder();

        for (int k = i; k < j; k++) {
            s.append(words[k]);

            if (k == j - 1)
                continue;

            for (int space = 1; space <= eachWordSpace; space++)
                s.append(" ");

            if (extraSpace > 0) {
                s.append(" ");
                extraSpace--;
            }

        }

        while (s.length() < Width) {
            s.append(" ");

        }

        return s.toString();
    }

}
