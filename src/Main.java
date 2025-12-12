public class Main {
    public static void main(String[] args) {

        // задача 1
        System.out.println("Номер 1");

        int weightBus = 1000000124;
        byte banana = 127;
        short longCat = 17777;
        long apple = 13431143143424242L;
        float weightCar = 2.2E+8F;
        double numDog = 1.8;
        System.out.println("Значение переменной weightBus с типом int равно " + weightBus);
        System.out.println("Значение переменной banana с типом byte равно " + banana);
        System.out.println("Значение переменной longCat с типом short равно " + longCat);
        System.out.println("Значение переменной apple с типом long равно " + apple);
        System.out.println("Значение переменной weightCar с типом float равно " + weightCar);
        System.out.println("Значение переменной numDog с типом double равно " + numDog);

        // задача 2

        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        // задача 3
        System.out.println("Номер 3");

        byte persLuda = 23;
        byte persAnna = 27;
        byte persKatya = 30;

        short generalPaper = 480;
        int generalPers = persKatya + persAnna + persLuda;  //23 + 27 + 30 = 80
        int persPaper = generalPaper / generalPers;
        System.out.println("На каждого ученика расчитано " + persPaper + " листов бумаги");

        // задача 4
        System.out.println("Номер 4");

        byte prodMin = 16 / 2;
        int prodTwentyMin = prodMin * 20;
        int prodDay = prodTwentyMin * 72;
        int prodThreeDay = prodDay * 3;
        long prodMonth = prodThreeDay * 10;

        System.out.println("За 20 минут машина произвела " + prodTwentyMin + " штук бутылок");
        System.out.println("За день машина произвела " + prodDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + prodThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + prodMonth + " штук бутылок");

        // задача 5
        System.out.println("Номер 5");

        byte generalPaint = 120;
        byte whitePaintOneClass = 2;
        byte brownPaintOneClass = 4;
        int generalPaintOneClass = whitePaintOneClass + brownPaintOneClass; // 6
        int classes = generalPaint / generalPaintOneClass; // 20
        int generalWhite = classes * whitePaintOneClass;
        int generalBrown = classes * brownPaintOneClass;
        System.out.println("В школе где " + classes + " классов, нужно " + generalWhite + " банок белой краски и " + generalBrown + " коричневой краски");

        // задача 6
        System.out.println("Номер 6");

        short banan = 5 * 80;
        short milk = 105 * 2;
        short iceCream = 2 * 100;
        short egg = 4 * 70;

        int generalWeight = banan + milk + iceCream + egg;
        int weightInKg = generalWeight / 1000;
        System.out.println(generalWeight + " - вес в граммах");
        System.out.println(weightInKg + " - вес в килограммах");

        // задача 7
        System.out.println("Номер 7");

        byte resetKG = 7;
        int resetG = resetKG * 1000;
        short minReset = 250;
        short maxReset = 500;
        int minResetDay = resetG / minReset;
        int maxResetDay = resetG / maxReset;
        int aveResetDay = (minResetDay + maxResetDay) / 2;
        System.out.println(minResetDay);
        System.out.println(maxResetDay);
        System.out.println(aveResetDay);

        // задача 8
        System.out.println("Номер 8");

        int stockMasha = 67760;
        int stockDen = 83690;
        int stockKris = 76230;
        // + 10 % = * 1.1
        float percentMasha = stockMasha * 1.1F;
        float percentDen = stockDen * 1.1F;
        float percentKris = stockKris * 1.1F;
        // Прошлый годовой
        int stockMashaYear = stockMasha * 12;
        int stockDenYear = stockDen * 12;
        int stockKrisYear = stockKris * 12;
        // Стал годовой
        float percentYearMasha = percentMasha * 12;
        float percentYearDen = percentDen * 12;
        float percentYearKris = percentKris * 12;
        // Разница
        float difMasha = percentYearMasha - stockMashaYear;
        float difDen = percentYearDen - stockDenYear;
        float difKris = percentYearKris - stockKrisYear;

        System.out.println("Маша теперь получает " +percentMasha+ " рублей. Годовой доход вырос на "+difMasha+" рублей");
        System.out.println("Денис теперь получает " +percentDen+ " рублей. Годовой доход вырос на "+difDen+" рублей");
        System.out.println("Кристина теперь получает " +percentKris+ " рублей. Годовой доход вырос на "+difKris+" рублей");
    }
}
