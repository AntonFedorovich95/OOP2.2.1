package ru.skypro;

public abstract class Hogwarts {
    private String name;
    private int thePowerOfMagic;
    private int theDistanceOfTransgression;

    public Hogwarts(String name, int thePowerOfMagic, int theDistanceOfTransgression) {
        this.thePowerOfMagic = thePowerOfMagic;
        this.theDistanceOfTransgression = theDistanceOfTransgression;
        this.name = name;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getTheDistanceOfTransgression() {
        return theDistanceOfTransgression;
    }

    public void setTheDistanceOfTransgression(int theDistanceOfTransgression) {
        this.theDistanceOfTransgression = theDistanceOfTransgression;
    }

    public void comparisonOfProperties( Hogwarts student) {
        if ((this.getThePowerOfMagic() + this.getTheDistanceOfTransgression()) > (student.getThePowerOfMagic() + student.getTheDistanceOfTransgression())) {
            System.out.println(this.getName() + " сила магии мощнее чем у " + student.getName());
        } else if (this.getThePowerOfMagic() == student.getThePowerOfMagic()) {
            System.out.println("Студенты обладают одинаковой силой магии!");
        } else {
            System.out.println(student.getName() + " сила магии мощнее чем у " + this.getName());
        }
    }

    @Override
    public String toString() {
        return  " Имя: " + name + ". " +
                " Сила магии: " + thePowerOfMagic + ". " +
                " Дальность магии: " + theDistanceOfTransgression + ". ";

    }
}