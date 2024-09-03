package Strings;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("kawak"));
    }

    public static boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
