package ru.skypro;

public class PrintService {

    public void print(Gryffindor[] Gryffindor) {
        for (ru.skypro.Gryffindor gryffindor : Gryffindor) {
            System.out.println(" Факультет: Гриффендор "
                    + " Имя: " + gryffindor.getName()
                    + " Сила магии: " + gryffindor.getThePowerOfMagic()
                    + " Дальность магии: " + gryffindor.getTheDistanceOfTransgression()
                    + " Благородство: " + gryffindor.getBravery()
                    + " Честь: " + gryffindor.getHonor()
                    + " Храбрость: " + gryffindor.getNobility());
        }
    }

    public void print(Slytherin[] Slytherin) {
        for (ru.skypro.Slytherin slytherin : Slytherin) {
            System.out.println(" Факультет: Слизерин "
                    + " Имя: " + slytherin.getName()
                    + " Сила магии: " + slytherin.getThePowerOfMagic()
                    + " Дальность магии: " + slytherin.getTheDistanceOfTransgression()
                    + " Хитрость: " + slytherin.getCunning()
                    + " Решительность: " + slytherin.getDetermination()
                    + " Амбициозность: " + slytherin.getAmbition()
                    + " Находчивост: " + slytherin.getResourcefulness()
                    + " Жажда власти: " + slytherin.getThirstForPower());
        }
    }

    public void print(Hufflepuff[] Hufflepuff) {
        for (ru.skypro.Hufflepuff hufflepuff : Hufflepuff) {
            System.out.println(" Факультет: Пуффендуй "
                    + " Имя: " + hufflepuff.getName()
                    + " Сила магии: " + hufflepuff.getThePowerOfMagic()
                    + " Дальность магии: " + hufflepuff.getTheDistanceOfTransgression()
                    + " Трудолюбие: " + hufflepuff.getDiligence()
                    + " Верность: " + hufflepuff.getLoyalty()
                    + " Честность: " + hufflepuff.getHonesty());
        }
    }

    public void print(Ravenclaw[] Ravenclaw) {
        for (ru.skypro.Ravenclaw ravenclaw : Ravenclaw) {
            System.out.println(" Факультет: Когтевран "
                    + " Имя: " + ravenclaw.getName()
                    + " Сила магии: " + ravenclaw.getThePowerOfMagic()
                    + " Дальность магии: " + ravenclaw.getTheDistanceOfTransgression()
                    + " Ум: " + ravenclaw.getSmart()
                    + " Мудрость: " + ravenclaw.getWise()
                    + " Остроумность: " + ravenclaw.getWitty()
                    + " Полны творчества: " + ravenclaw.getFullOfCreativity());
        }
    }
}
