package stringfirstTier;

public class atFirst {
    public static void main(String[] args) {
        String str = "1";
        if (str.length() < 2)
        {
            while (str.length() < 2)
            {
                str+="@";
            }
        }
        System.out.println(str);
    }
}
