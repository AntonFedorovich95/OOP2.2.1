package ru.skypro;

public class Ravenclaw extends hogwarts {
private int smart;
private int wise;
private int witty;
private int fullOfCreativity;

    public Ravenclaw(String name, int thePowerOfMagic, int theDistanceOfTransgression, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, thePowerOfMagic, theDistanceOfTransgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return super.toString() + "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                "} ";
    }
}