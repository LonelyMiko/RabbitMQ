package otherStuff;

public class front22 {
    public static void main(String[] args) {
        System.out.println(front22("kitten"));
    }
    static public String front22(String str) {
        if (str.length() >= 2) {
            String newStr = str.substring(0, 2);
            return newStr + str + newStr;
        }
        else if (str.length() == 0)
        {
            return str;
        }
        String newStr = str.substring(0, str.length());
        return newStr + str + newStr;
    }
}
