package com.weapon;
import java.util.Scanner;
public class Weapon {
    private int ammoCapacity;
    private int fireRate;
    private int accuracy;
    private int range;
    private int clipSize;
    private String typeOfBullet;
    private String typeOfWeapon;

    //Setters && Getters

    //Setters with parameters
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setAmmoCapacity(int ammoCapacity) {
        this.ammoCapacity = ammoCapacity;
    }

    public void setClipSize(int clipSize) {
        this.clipSize = clipSize;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setTypeOfBullet(String typeOfBullet) {
        this.typeOfBullet = typeOfBullet;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }
    Scanner scan = new Scanner(System.in);

    //Setters without parameters
    public void setAccuracy() {
        System.out.print("Enter Accuracy: ");
        this.accuracy = scan.nextInt();
    }

    public void setAmmoCapacity() {
        System.out.print("Enter Ammo Capacity: ");
        this.ammoCapacity = scan.nextInt();
    }

    public void setClipSize() {
        System.out.print("Enter Clip Size: ");
        this.clipSize = scan.nextInt();
    }

    public void setFireRate() {
        System.out.print("Enter Fire Rate: ");
        this.fireRate = scan.nextInt();
    }

    public void setRange() {
        System.out.print("Enter Range: ");
        this.range = scan.nextInt();
    }

    public void setTypeOfBullet() {
        System.out.print("Enter Type Of Bullet: ");
        this.typeOfBullet = scan.nextLine();
    }

    public void setTypeOfWeapon() {
        System.out.print("Type Of Weapon: ");
        this.typeOfWeapon = scan.nextLine();
    }

    //Getters
    public int getAccuracy() {
        return accuracy;
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }

    public int getClipSize() {
        return clipSize;
    }

    public int getFireRate() {
        return fireRate;
    }

    public int getRange() {
        return range;
    }

    public String getTypeOfBullet() {
        return typeOfBullet;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    //Constructors

    public Weapon(int ammoCapacity, int fireRate, int accuracy, int range, int clipSize, String typeOfBullet, String typeOfWeapon) {
        this.ammoCapacity = ammoCapacity;
        this.fireRate = fireRate;
        this.accuracy = accuracy;
        this.range = range;
        this.clipSize = clipSize;
        this.typeOfBullet = typeOfBullet;
        this.typeOfWeapon = typeOfWeapon;
    }

    public Weapon(int ammoCapacity, int fireRate, int accuracy, int range, int clipSize, String typeOfBullet) {
        this.ammoCapacity = ammoCapacity;
        this.fireRate = fireRate;
        this.accuracy = accuracy;
        this.range = range;
        this.clipSize = clipSize;
        this.typeOfBullet = typeOfBullet;
        setTypeOfWeapon();
    }

    public Weapon(int ammoCapacity, int fireRate, int accuracy, int range, int clipSize) {
        this.ammoCapacity = ammoCapacity;
        this.fireRate = fireRate;
        this.accuracy = accuracy;
        this.range = range;
        this.clipSize = clipSize;
        setTypeOfBullet();
        setTypeOfWeapon();
    }

    public Weapon(int ammoCapacity, int fireRate, int accuracy, int range) {
        this.ammoCapacity = ammoCapacity;
        this.fireRate = fireRate;
        this.accuracy = accuracy;
        this.range = range;
        setClipSize();
        setTypeOfBullet();
        setTypeOfWeapon();
    }

    public Weapon(int ammoCapacity, int fireRate, int accuracy) {
        this.ammoCapacity = ammoCapacity;
        this.fireRate = fireRate;
        this.accuracy = accuracy;
        setClipSize();
        setRange();
        setTypeOfBullet();
        setTypeOfWeapon();
    }

    public Weapon(int ammoCapacity, int fireRate) {
        this.ammoCapacity = ammoCapacity;
        this.fireRate = fireRate;
        setAccuracy();
        setClipSize();
        setRange();
        setTypeOfBullet();
        setTypeOfWeapon();
    }

    public Weapon(int ammoCapacity) {
        this.ammoCapacity = ammoCapacity;
        setAccuracy();
        setClipSize();
        setFireRate();
        setRange();
        setTypeOfBullet();
        setTypeOfWeapon();
    }

    public Weapon() {
    setAccuracy();
    setAmmoCapacity();
    setClipSize();
    setFireRate();
    setRange();
    setTypeOfBullet();
    setTypeOfWeapon();
    }


    public void print() {
        System.out.println();
        System.out.println("AmmoCapacity " + ammoCapacity);
        System.out.println("Fire Rate: " + fireRate);
        System.out.println("Accuracy:" + accuracy);
        System.out.println("Range: " + range);
        System.out.println("Clip Size: " + clipSize);
        System.out.println("Type Of Bullet: " + typeOfBullet);
        System.out.println("Type Of Weapon: " + typeOfWeapon);
    };

    public double overall()
    {
        return (getAccuracy() + getFireRate() + getRange() + getClipSize()) / 4;
    }

    public boolean isBetterThan(Weapon weapon)
    {
        return this.overall() > weapon.overall();
    }
}
