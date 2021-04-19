package otherStuff;

public class stringYak {
    //yakpak -> "pak"
    //"pakyak" -> "pak"
    public static void main(String[] args) {
        String str = "yakpak";
        String newStr = "";
        newStr = str.replaceAll("yak","");
        System.out.println(newStr);
    }
}
