package stack.checkstring;


public class CheckStringOperators {
    /**
     * This function checks if there is a digit after the closing bracket
     * @param token
     * @return true if token has a digit after the closing bracket, otherwise return false
     */
    static boolean hasDigitAfterParenthesis(String token)
    {
        char[] characters = token.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == ')' && (i+1 < characters.length && characters[i+1] >= '0' && characters[i+1] <= '9'))
            {
                return true;
            }
            if (i+1 < characters.length && (characters[i] == ')' && characters[i+1] == '('))
            {
                return true;
            }
        }
        return false;
    }

    public static String isValid(String token)
    {

        if (hasDigitAfterParenthesis(token))
        {
            StringBuilder stringBuilder = new StringBuilder(token);
            stringBuilder.insert(token.indexOf(')') + 1,'*'); // ERROR
            return stringBuilder.toString();
        }
        return token;
    }
}
