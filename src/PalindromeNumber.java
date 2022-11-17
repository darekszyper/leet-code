public class PalindromeNumber {

    public static void main(String[] args) {
        int palindrome = 121;
        int notPalindrome = 123;

        System.out.println(isPalindrome(palindrome));
        System.out.println(isPalindrome(notPalindrome));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String xString = String.valueOf(x);
        char[] xCharArray = xString.toCharArray();
        int lenght = xCharArray.length;

        for (int i = 0; i < lenght / 2; i++) {
            char temporary = xCharArray[lenght - 1 - i];
            xCharArray[i] = temporary;
        }

        return String.valueOf(x).equals(new String(xCharArray));
    }
}
