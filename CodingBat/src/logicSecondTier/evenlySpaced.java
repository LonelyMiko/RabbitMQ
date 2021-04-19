package logicSecondTier;

public class evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int smallDif = b - a;
        int largeDif = c - b;
        int diff1 = Math.abs(a - b);
        int diff2 = Math.abs(a - c);
        int diff3 = Math.abs(b - c);
        if (smallDif == largeDif)
        {
            return true;
        }
        if (diff1 == diff2 || diff1 == diff3)
        {
            return true;
        }
        else if (diff2 == diff3)
        {
            return true;
        }

        return false;
    }
}
