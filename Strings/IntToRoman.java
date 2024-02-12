package Strings;

public class IntToRoman {
    public String intToRoman(int num) {
        // 58
        // 58/1000
        // 0
        // 58%1000
        // 58

        int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] str = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            if (num == 0) {
                break;
            }

            int times = num / nums[i];

            for (int j = 0; j < times; j++) {
                ans.append(str[i]);
            }
            num = num % nums[i];
        }
        return ans.toString();
    }

}
