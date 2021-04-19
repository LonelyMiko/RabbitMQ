package stack;
import stack.checkstring.CheckString;

public class Main {
    public static void main(String[] args) {
        CheckString checkString = new CheckString();
        String token = "99+55+1*(2"; // <- Insert your token here
        /*
        (99+1)2-(50)3
         */
        token = checkString.check(token);
        if (!token.equals("Error, your token is invalid!")) {
            System.out.println("Token: " + token.replaceAll("\\s+",""));
            System.out.println("Result: " + stack.evaluate(token));
        }
        else
            {
                System.out.println(token);
            }
    }
}
