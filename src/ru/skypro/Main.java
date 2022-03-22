package ru.skypro;

public class Main {
    public static void comparisonOfPropertiesSlytserin(Slytherin[] Slytherin) {
        int student1 = Slytherin[0].getAmbition();
        int student2 = Slytherin[2].getAmbition();
        if (student1 > student2) {
            System.out.println(Slytherin[0].getName() + " амбициознее чем " + Slytherin[2].getName());
        } else {
            System.out.println(Slytherin[2].getName() + " амбициознее чем " + Slytherin[0].getName());
        }
    }

    public static void comparisonOfPropertiesHufflepuff(Hufflepuff[] Hufflepuff) {
        int student1 = Hufflepuff[0].getHonesty();
        int student2 = Hufflepuff[1].getHonesty();
        if (student1 > student2) {
            System.out.println(Hufflepuff[0].getName() + " честнее чем " + Hufflepuff[1].getName());
        } else {
            System.out.println(Hufflepuff[1].getName() + " честнее чем " + Hufflepuff[0].getName());
        }
    }

    public static void comparisonOfPropertiesRavenclaw(Ravenclaw[] Ravenclaw) {
        int student1 = Ravenclaw[1].getSmart();
        int student2 = Ravenclaw[2].getSmart();
        if (student1 > student2) {
            System.out.println(Ravenclaw[1].getName() + " умнее чем " + Ravenclaw[2].getName());
        } else {
            System.out.println(Ravenclaw[2].getName() + " умнее чем " + Ravenclaw[1].getName());
        }
    }

    public static void main(String[] args) {
        Gryffindor[] Gryffindor = {
                new Gryffindor("Гарри Поттер", 76, 75, 50, 60, 99),
                new Gryffindor("Гермиона Грейнджер", 80, 45, 50, 65, 56),
                new Gryffindor("Рон Уизли", 67, 50, 64, 67, 78),
        };

        Slytherin[] Slytherin = {
                new Slytherin("Драко Малфой", 70, 55, 60, 57, 72, 68, 59),
                new Slytherin("Грэхэм Монтегю", 50, 54, 57, 48, 73, 55, 45),
                new Slytherin("Грегори Гойл", 45, 30, 34, 58, 64, 60, 71),
        };

        Hufflepuff[] Hufflepuff = {
                new Hufflepuff("Захария Смит", 63, 59, 60, 54, 70),
                new Hufflepuff("Седрик Диггори", 45, 54, 67, 56, 89),
                new Hufflepuff("Джастин Финч-Флетчли", 40, 48, 65, 71, 63),
        };

        Ravenclaw[] Ravenclaw = {
                new Ravenclaw("Чжоу Чанг", 54, 67, 54, 56, 80, 46),
                new Ravenclaw("Падма Патил", 66, 52, 46, 59, 43, 67),
                new Ravenclaw("Маркус Белби", 43, 50, 50, 67, 43, 59),
        };
        Ravenclaw[1].comparisonOfPropertiesRavenclaw(Ravenclaw[0]);
        Slytherin[0].comparisonOfPropertiesSlytserin(Slytherin[2]);
        Hufflepuff[1].comparisonOfPropertiesHufflepuff(Hufflepuff[2]);
        Gryffindor[0].comparisonOfPropertiesGryffindor(Gryffindor[2]);
        Ravenclaw[1].comparisonOfProperties(Hufflepuff[0]);
        System.out.println("Gryffindor[1] = " + Gryffindor[1]);
    }
    }