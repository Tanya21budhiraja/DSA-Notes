package Array;

public class Index {
    public int FirstOccurrenceinaString(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j < m; j++) {
                // main concept (i + j)
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
                if (j == m - 1)
                    return i;
            }
        }
        return -1;

    }
}
