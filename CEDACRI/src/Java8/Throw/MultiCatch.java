package Java8.Throw;

import java.util.HashMap;
import java.util.Map;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] vals = {1,2,3};
        try {
            int result = a/b;
            vals[10] = 19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException exception)
        {
            System.out.println(exception);
        }
    }

}
