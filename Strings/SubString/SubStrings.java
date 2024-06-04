package Strings.SubString;

public class SubStrings {

    public static void main(String[] args) {

        String s = "abc";
        Substrings(s);

    }

    public static void Substrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                System.out.println(str);
            }
        }
    }
}
