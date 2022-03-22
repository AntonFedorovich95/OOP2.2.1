package ru.skypro;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int thePowerOfMagic, int theDistanceOfTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, thePowerOfMagic, theDistanceOfTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void comparisonOfPropertiesSlytserin(Slytherin student) {
        if (this.getCunning() > student.getCunning()) {
            System.out.println(this.getName() + " хитрее чем " + student.getName());
        } else if (this.getCunning() == student.getCunning()) {
            System.out.println("Студенты хитры одинаково!");
        } else {
            System.out.println(student.getName() + " хитрее чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Факультет Слизерин! " +
                "Хитрость: " + cunning +
                ", Решительность: " + determination +
                ", Амбициозность: " + ambition +
                ", Находчивост: " + resourcefulness +
                ", Жажда власти: " + thirstForPower +
                ".";
    }
}