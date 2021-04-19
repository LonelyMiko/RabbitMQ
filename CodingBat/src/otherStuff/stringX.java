package otherStuff;

public class stringX {
    public static void main(String[] args) {
        //axbixc -> abic
        //xabx - >xabx
        String str = "";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.charAt(i) == 'x')) {
                newStr = newStr + str.charAt(i);
            }
        }
    }
}
