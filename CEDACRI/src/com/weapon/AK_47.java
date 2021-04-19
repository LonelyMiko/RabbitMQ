package com.weapon;

public class AK_47 extends Weapon implements IWeapon
    {
    public AK_47(int ammoCapacity, int fireRate, int accuracy, int range, int clipSize, String typeOfBullet, String typeOfWeapon)
    {
        super(ammoCapacity, fireRate, accuracy, range, clipSize, typeOfBullet, typeOfWeapon);
    }

    @Override
    public void reload()
    {
        System.out.println("I am reloading AK-47 with " + getAmmoCapacity() + " bullets");
    }

    @Override
    public void shot()
    {
        System.out.println("Trtrtrtr!");
    }

    @Override
    public int getMaxBullets()
    {
        return getAmmoCapacity() * getClipSize();
    }
}
