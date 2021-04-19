package logicSecondTier;

public class roundSum {
    int round10(int num)
    {
        if (num%10 >= 5 ) {
            return num + 10 - (num%10);
        }
        return num - (num%10);
    }
    public int roundSum(int a, int b, int c) {
        a = round10(a);
        b = round10(b);
        c = round10(c);
        return a+b+c;
    }
}
