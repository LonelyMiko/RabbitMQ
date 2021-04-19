package stringSecondTier;

public class repeatEnd {
    public String repeatEnd(String str, int n) {
        String newStr = str.substring(str.length()-n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(newStr);
        }
        return result.toString();
    }
}
