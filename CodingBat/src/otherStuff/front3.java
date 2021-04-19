package otherStuff;

public class front3 {
    public static void main(String[] args) {
        System.out.println(front3("Tt"));
    }
    static public String front3(String str) {
        if (str.length() >= 3) {
            String front3 = str.substring(0, 3);
            return front3.repeat(3);
        }
        return str.repeat(3);
    }
}
