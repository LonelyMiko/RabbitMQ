package stack;
import java.util.Stack;

public class stack
{
    /**
     * This function takes a string and evaluate arithmetic expressions.
     * @param expression string
     * @return result of arithmetic expressions
     */
    public static int evaluate(String expression)
    {
        char[] tokens = expression.toCharArray();

        Stack<Integer> values = new Stack<>();

        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i] == ' ')
            {
                continue;
            }

            // If token is a number,
            // push it to stack for numbers
            if (tokens[i] >= '0' && tokens[i] <= '9')
            {
                StringBuilder buff = new StringBuilder();

                // There may be more than one
                // digits in number
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
                    buff.append(tokens[i++]);
                }
                values.push(Integer.parseInt(buff.toString()));
                i--;
            }

            // If token is an opening brace,
            // push it to 'ops'
            else if (tokens[i] == '(')
            {
                ops.push(tokens[i]);
            }

            // Closing brace encountered,
            // solve entire brace
            else if (tokens[i] == ')')
            {
                while (ops.peek() != '(') {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.pop();
            }

            // If token is an operator.
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/')
            {
                // While top of 'ops' has same
                // or greater precedence to current
                // token, which is an operator.
                // Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }

                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }
        }

        // Entire expression has been
        // parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty())
        {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        // Top of 'values' contains result, return it
        return values.pop();
    }

    /**
     * This function checks the precedence of operators
     * and returns true if op2 has more priority
     * or the same priority than op1
     * otherwise returns false
     * @param op1 char
     * @param op2 char
     * @return boolean
     */
    // Returns true if 'op2' has higher
    // or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * This function executes the logic of the operator 'op'
     * @param op char
     * @param b int
     * @param a int
     * @return a op b if the operator is valid,otherwise it return 0
     */
    public static int applyOp(char op, int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }
}
