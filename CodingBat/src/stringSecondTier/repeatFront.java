package stringSecondTier;

public class repeatFront {
    public String repeatFront(String str, int n) {
        int count = n;
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n; i++,count--) {
            newStr.append(str.substring(0, count));
        }
        return newStr.toString();
    }
}
