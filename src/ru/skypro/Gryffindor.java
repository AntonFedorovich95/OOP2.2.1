package ru.skypro;

public class Gryffindor extends hogwarts {
    public static int length;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int thePowerOfMagic, int theDistanceOfTransgression, int nobility, int honor, int bravery) {
        super(name, thePowerOfMagic, theDistanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +  " Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "} " ;
    }
}