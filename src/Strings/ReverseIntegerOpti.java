package Strings;

public class ReverseIntegerOpti {

    public static void main(String[] args) {
        int x = 1234;
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x%10;
            x/=10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                reversed = 0;
            }
        }
        System.out.println(reversed);
    }
}
