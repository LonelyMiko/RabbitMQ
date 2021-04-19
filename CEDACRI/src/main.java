import com.weapon.*;

public class main {
    public static void main(String[] args) {
        Pistol ceramicPistol = new Pistol(12, 44, 36, 20, 6, ".40", "Handguns");
        Pistol metalicPistol = new Pistol(12, 44, 36, 20, 6, ".40", "Handguns");
        AK_47 ak47 = new AK_47(30, 30, 45, 45, 40, "7.62", "Assault Rifles");
        SniperRifle AWP = new SniperRifle(10, 25, 70, 95, 10, "12.7", "Sniper Rifles");

        ceramicPistol.print();
        metalicPistol.print();
        ak47.print();
        AWP.print();

        if(ak47.isBetterThan(AWP))
        {
            System.out.println("AK47 is better than AWP");
            System.out.println("AK47 Overall: " + ak47.overall());
            System.out.println("AWP Overall: " + AWP.overall());
        }
        else
            {
                System.out.println("AWP is better than AWP");
                System.out.println("AWP Overall: " + AWP.overall());
                System.out.println("AK47 Overall: " + ak47.overall());
            }
    }
}
