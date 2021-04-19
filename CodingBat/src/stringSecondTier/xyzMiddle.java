package stringSecondTier;

public class xyzMiddle {
    public boolean xyzMiddle(String str) {
        if (str.length() < 3)
        {
            return false;
        }
        int middle1 = str.length() / 2 - 2;
        int middle2 = str.length() / 2 - 1;
        if(str.length() % 2 == 0) {
            return "xyz".equals(str.substring(middle1, middle1 + 3)) ||
                    "xyz".equals(str.substring(middle2, middle2 + 3));
        }
        return str.substring(middle2, middle2 + 3).equals("xyz");
    }
}
