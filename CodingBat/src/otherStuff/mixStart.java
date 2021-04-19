package otherStuff;

import java.util.ArrayList;
import java.util.Arrays;

public class mixStart {
    public static void main(String[] args) {
        String str = "xxHxix";
        String newStr = "";
        if (str.startsWith("x")) {
            newStr = str.replaceAll("x", "");
            newStr = "x" + newStr;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            newStr += "x";
        }
        System.out.println(newStr);
    }
}
