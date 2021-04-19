package stringSecondTier;

public class repeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < count; i++) {
            newStr.append(word);
            if (i+1 != count)
            {
                newStr.append(sep);
            }
        }
        return newStr.toString();
    }
}
