package stringfirstTier;

public class lastTwo {
    public static void main(String[] args) {
        String str = "coding";
        if (str.length() > 1) {
            int length = str.length() - 1;
            System.out.println(str.substring(0, length - 1) + str.charAt(length) + str.charAt(length - 1));
        }
    }
}
