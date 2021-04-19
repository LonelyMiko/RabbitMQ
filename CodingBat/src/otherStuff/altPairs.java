package otherStuff;

import java.util.ArrayList;

public class altPairs {
    //kitten -> kien
    //0 -> k, 1 -> i, 4 -> e, 5 -> n

    //CodingHorror - >Congrr
    //0 -> C, 1 -> o, 4 -> n, 5 -> g, 8 -> r, 9 -> r

    //0,1, 4,5, 8,9, 11,12, 15,16
    public static void main(String[] args) {
        String str = "Chocolate";
        String newStr = "";
        for (int i = 0; i < str.length(); i+=4) {

            for (int j = i; j <= i+1; j++) {
                if (j < str.length()) {
                    newStr += str.charAt(j);
                }
            }
            }
        System.out.println(newStr);
        }
    }
