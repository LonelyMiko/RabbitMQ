package stringSecondTier;

public class sameStarChar {
    public boolean sameStarChar(String str) {
        int len = str.length();
        for(int i = 1; i < len-1; i++){
            if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
