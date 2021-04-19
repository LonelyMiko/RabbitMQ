package com.weapon;

public class SniperRifle extends Weapon implements IWeapon
{
    public SniperRifle(int ammoCapacity, int fireRate, int accuracy, int range, int clipSize, String typeOfBullet, String typeOfWeapon)
    {
        super(ammoCapacity, fireRate, accuracy, range, clipSize, typeOfBullet, typeOfWeapon);
    }

    @Override
    public void reload() {
        System.out.println("I am reloading Sniper Rifle with " + getAmmoCapacity() + " bullets");
    }

    @Override
    public void shot() {
        System.out.println("BANG!");
    }

    @Override
    public int getMaxBullets() {
        return getAmmoCapacity() * getClipSize();
    }
}
