package logicSecondTier;

public class loneSum {
    public int loneSum(int a, int b, int c) {
        if (a==b && b == c)
        {
            return 0;
        }
        if (a == b || a == c)
        {
            if (a==b)
            {
                return c;
            }
            else
            {
                return b;
            }
        }
        if (c == b)
        {
            return a;
        }
        return a+b+c;
    }
}
