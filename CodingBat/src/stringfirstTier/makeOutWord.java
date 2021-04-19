package stringfirstTier;

public class makeOutWord {
    public static void main(String[] args) {
        String out = "<<>>";
        String word = "Yay";
        String firstPart = out.substring(0,2);
        String lastPart = out.substring(2,4);
        System.out.println(firstPart+word+lastPart);

    }
}
