package stringfirstTier;

public class twoChar {
    public static void main(String[] args) {
        String str = "java";
        int n = 2;
        if(str.length() <= n + 1 || n < 0)
        {
            System.out.println(str.substring(0,2));
        }

    }
}
