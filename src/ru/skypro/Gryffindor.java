package ru.skypro;

public class Gryffindor extends Hogwarts {
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

    public void comparisonOfPropertiesGryffindor(Gryffindor student) {
        if (this.getBravery() > student.getBravery()) {
            System.out.println(this.getName() + " благороднее чем " + student.getName());
        } else if (this.getBravery() == student.getBravery()) {
            System.out.println("Студенты благородны одинаково!");
        } else {
            System.out.println(student.getName() + " благороднее чем " + this.getName());
        }
    }


    @Override
    public String toString() {
        return super.toString() + " Факультет Гриффендор!" +
                " Благородство: " + nobility +
                ", Честь: " + honor +
                ", Храбрость: " + bravery + ".";
    }

}