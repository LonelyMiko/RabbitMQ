package stack.checkstring;

public class CheckStringBracket {

    /**
     * This function adds brackets to the token
     * if the token does not contain an equal number of brackets
     * @param token
     * @return new token, string
     */
    static String isValid(String token)
    {
        short openBracketCount = 0;
        short closedBracketCount = 0;
        char[] characters = token.toCharArray();
        for (char character : characters) {
            if (character == '(') {
                openBracketCount++;
            }
            if (character == ')') {
                closedBracketCount++;
            }
        }
        if (closedBracketCount > openBracketCount)
        {
            for (int i = openBracketCount; i < closedBracketCount; i++)
            {
                token = '(' + token;
            }
        }
        if (openBracketCount > closedBracketCount)
        {
            for (int i = closedBracketCount; i <openBracketCount ; i++)
            {
                token = token + ')';
            }
        }
        return token;
    }
}
