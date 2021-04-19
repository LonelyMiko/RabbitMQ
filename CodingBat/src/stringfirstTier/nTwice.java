package stringfirstTier;

public class nTwice {
    public static void main(String[] args) {
        String str = "Hello";
        int n = 2;
        System.out.println(str.substring(0,n) + str.substring(str.length()-n));
    }
}
