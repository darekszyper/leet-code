import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input = {""};
        System.out.println(longestCommonPrefix(input));
        Arrays.sort(input);
        for (String word: input) {
            System.out.println(word);
        }
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int counter = 0;
        Arrays.sort(strs);

        while (counter < strs[0].length())
        {
            if (strs[0].charAt(counter) == strs[strs.length - 1].charAt(counter))
                counter++;
            else
                break;
        }

        return counter == 0 ? "" : strs[0].substring(0, counter);
    }

}
