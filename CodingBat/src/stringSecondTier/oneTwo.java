package stringSecondTier;

public class oneTwo {
    public String oneTwo(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length()-2; i+=3) {
            newStr.append(str.substring(i+1,i+3) + str.charAt(i));
        }
        return newStr.toString();
    }
}
