package com.weapon;

public class Pistol extends Weapon implements IWeapon
    {
    public Pistol(int ammoCapacity, int fireRate, int accuracy, int range, int clipSize, String typeOfBullet, String typeOfWeapon)
    {
        super(ammoCapacity, fireRate, accuracy, range, clipSize, typeOfBullet, typeOfWeapon);
    }

    @Override
    public void reload()
    {
        System.out.println("I am reloading pistol with " + getAmmoCapacity() + " bullets");
    }

    @Override
    public void shot()
    {
        System.out.println("Piu - Piu");
    }

    @Override
    public int getMaxBullets()
    {
       return getAmmoCapacity() * getClipSize();
    }
    }
