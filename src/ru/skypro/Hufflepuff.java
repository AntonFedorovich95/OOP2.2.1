package ru.skypro;

public class  Hufflepuff extends hogwarts {
    private int Diligence;
    private int Loyalty;
    private int Honesty;

    public Hufflepuff(String name, int thePowerOfMagic, int theDistanceOfTransgression, int diligence, int loyalty, int honesty) {
        super(name, thePowerOfMagic, theDistanceOfTransgression);
        Diligence = diligence;
        Loyalty = loyalty;
        Honesty = honesty;
    }

    public int getDiligence() {
        return Diligence;
    }

    public void setDiligence(int diligence) {
        Diligence = diligence;
    }

    public int getLoyalty() {
        return Loyalty;
    }

    public void setLoyalty(int loyalty) {
        Loyalty = loyalty;
    }

    public int getHonesty() {
        return Honesty;
    }

    public void setHonesty(int honesty) {
        Honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "Hufflepuff{" +
                "Diligence=" + Diligence +
                ", Loyalty=" + Loyalty +
                ", Honesty=" + Honesty +
                "} ";
    }
}