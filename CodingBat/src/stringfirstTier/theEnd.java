package stringfirstTier;

public class theEnd {
    public static void main(String[] args) {
        String str = "Hello";
        boolean front = false;
        System.out.println((front)? str.charAt(0) : str.charAt(str.length()-1));
        if (front)
        {
            System.out.println(str);
        }
    }
}
