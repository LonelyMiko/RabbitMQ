package stringfirstTier;

public class comboString {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "hi";
        if ((a.length() > b.length())) {
            System.out.println(b + a + b);
        } else {
            System.out.println(a + b + a);
        }
    }
}
