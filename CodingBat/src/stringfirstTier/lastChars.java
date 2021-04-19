package stringfirstTier;

public class lastChars {
    public static void main(String[] args) {
        String a = "abc";
        String b = "cat";
        if (a.charAt(a.length()-1) == b.charAt(0))
        {
            System.out.println(a + b.substring(1));
        }
    }
}
