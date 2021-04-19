package stringfirstTier;

public class extraEnd {
    public static void main(String[] args) {
        String str = "Hello";
        if (str.length() > 2) {
            String newStr = str.substring(str.length() - 2, str.length());
            System.out.println(newStr);
        }
        System.out.println(str);
    }
}
