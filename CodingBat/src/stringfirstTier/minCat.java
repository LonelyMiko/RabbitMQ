package stringfirstTier;

public class minCat {
    public static void main(String[] args) {
        String a = "java";
        String b = "Hello";
        int aLength = a.length();
        int bLength = b.length();
        if (aLength > bLength)
        {
            System.out.println(a.substring(aLength-bLength,aLength) + b);
        }
        if (aLength < bLength)
        {
            System.out.println(a + b.substring(bLength-aLength,bLength));
        }
    }
}
