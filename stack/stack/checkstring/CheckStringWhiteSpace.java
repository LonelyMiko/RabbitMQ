package stack.checkstring;

public class CheckStringWhiteSpace {
    /**
     * This function checks if the token is valid
     * Checks if the current contains spaces
     * Checks if there are more operators than operands
     * @param token
     * @return true if token is valid, otherwise false
     */
    static boolean checkStringWhiteSpace(String token) {
        int operatorCount = 0;
        int numberCount = 0;
        char[] characters = token.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length; i++) {
            if (characters[i] == ' ') {
                if (i-1 >= 0 && (characters[i-1] >= '0' && characters[i-1] <= '9' && characters[i+1] >= '0' && characters[i+1] <= '9')) {
                    return false;
                }
                continue;
            }
            if (characters[i] == '+' || characters[i] == '-' || characters[i] == '*' || characters[i] == '/') {
                if (characters[i+1] == '+' || characters[i+1] == '-' || characters[i+1] == '*' || characters[i+1] == '/') {
                    return false;
                }
                operatorCount++;
            }
            if (characters[i] >= '0' && characters[i] <= '9') {


                // There may be more than one
                // digits in number
                while (i < length && characters[i] >= '0' && characters[i] <= '9') {
                    i++;
                }
                numberCount++;
                i--;
            }
        }
            //
            return operatorCount == (numberCount - 1);
        }

        static String isValid(String token)
        {
            if (checkStringWhiteSpace(token))
            {
                return token;
            }
            return "Error, your token is invalid!";
        }
    }


