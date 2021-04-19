package stringSecondTier;

public class prefixAgain {
    public boolean prefixAgain(String str, int n) {
        String newStr = str.substring(0,n);
        for (int i = n; i < str.length(); i++) {
            if(n+i <= str.length()) {
                if (newStr.equals(str.substring(i,n+i)))
                return true;
            }
        }
        return false;
    }
}
