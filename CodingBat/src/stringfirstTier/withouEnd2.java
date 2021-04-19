package stringfirstTier;

public class withouEnd2 {
    public static void main(String[] args) {
        String str = "abc";
        if(str.length() > 1)
        {
            System.out.println(str.substring(1,str.length()-1));
        }
        else {
            System.out.println("");
        }
    }
}
