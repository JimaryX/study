package LeetCode;

public class Problem38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        String str = "1";
        StringBuilder builder = new StringBuilder("");

        for (int m = 0; m < n - 1; m++) {
            char[] chars = str.toCharArray();
            int i = 1;
            for (int j = 0; j < chars.length; j++) {
                if (j != (chars.length - 1)) {
                    if (chars[j] == chars[j + 1]) {
                        i++;
                    } else {
                        builder.append(i + "").append(chars[j]);
                        i = 1;
                    }
                } else {
                    builder.append(i + "").append(chars[j]);
                }
            }
            str = builder.toString();
            builder.delete(0, builder.length());
        }

        return str;
    }
}
