package ru.skypro;

public class hogwarts {
    private String name;
    private int thePowerOfMagic;
    private int theDistanceOfTransgression;

    public hogwarts(String name, int thePowerOfMagic, int theDistanceOfTransgression) {
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

    @Override
    public String toString() {
        return "hogwarts{" +
                "name='" + name + '\'' +
                ", thePowerOfMagic=" + thePowerOfMagic +
                ", theDistanceOfTransgression=" + theDistanceOfTransgression +
                '}';
    }
}