public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        int age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2
        System.out.println("Задача 2");

        int temp = 6;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }

        // Задача 3
        System.out.println("Задача 3");

        int speed = 45;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        // Задача 4
        System.out.println("Задача 4");

        int year = 9;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в детский сад");
        }
        if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в школу");
        }
        if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + ", то его место в университете");
        }
        if (year > 24) {
            System.out.println("Если возраст человека равен " + year + ", то ему пора ходить на работу");
        }

        // Задача 5
        System.out.println("Задача 5");

        int yOld = 15;
        if (yOld < 5) {
            System.out.println("Если возраст ребенка равен " + yOld + ", то ему нельзя кататься на аттракционе");
        }
        if (yOld >= 5 && yOld <= 14) {
            System.out.println("Если возраст ребенка равен " + yOld + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (yOld > 14) {
            System.out.println("Если возраст ребенка равен " + yOld + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // Задача 6
        System.out.println("Задача 6");

        int place = 60;
        if (place <= 60) {
            System.out.println("В вагоне присутствует сидячее и стоячее места");
        }
        if (place > 60 && place < 102) {
            System.out.println("В вагоне присутствуют стоячие места");
        }
        if (place > 102) {
            System.out.println("Вагон заполнен,мест нет");
        }

        // Задача 7
        System.out.println("Задача 7");

        int one = 2;
        int two = 4;
        int three = 1;
        if (one > two) {
            System.out.println("one больше two");
        } else {
            System.out.println("one меньше two");
        }
        if (two > three) {
            System.out.println("two больше three");
        } else {
            System.out.println("two меньше three");
        }
        if (one > three) {
            System.out.println("one больше three");
        } else {
            System.out.println("one меньше three");
        }


    }
}
