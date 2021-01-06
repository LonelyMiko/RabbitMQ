package stack.checkstring;

public class CheckString {
    public String check(String token)
    {
        token = CheckStringBracket.isValid(token);
        token = CheckStringOperators.isValid(token);
        token = CheckStringWhiteSpace.isValid(token);
        return token;
    }
}
