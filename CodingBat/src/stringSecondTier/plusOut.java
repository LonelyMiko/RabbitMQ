package stringSecondTier;

public class plusOut {
    public String plusOut(String str, String word) {
        StringBuilder newStr = new StringBuilder();
        int wordLength = word.length();
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            if (i <= strLength - wordLength) {
                if (str.substring(i, i + wordLength).equals(word)) {
                    newStr.append(word);
                    i += wordLength - 1;
                }
                else
                    {
                    newStr.append("+");
                }
            }
            else
                {
                newStr.append("+");
            }
        }
        return newStr.toString();
    }
}
