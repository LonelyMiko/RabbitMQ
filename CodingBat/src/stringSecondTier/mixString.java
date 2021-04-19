package stringSecondTier;
/*
Given two strings, a and b, create a bigger string made of the first char of a,
the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result.
 */
public class mixString {
    public String mixString(String a, String b) {
        int min;
        StringBuilder stringBuilder = new StringBuilder();
        min = Math.min(a.length(), b.length());
        for (int i = 0; i < min ; i++) {
            stringBuilder.append(a.charAt(i)).append(b.charAt(i));
        }
        if (a.length() > b.length())
        {
            for (; min < a.length() ; min++) {
             stringBuilder.append(a.charAt(min));
            }
        }
        else
            {
                for (; min < b.length() ; min++) {
                    stringBuilder.append(b.charAt(min));
                }
            }
        return stringBuilder.toString();
    }
}
