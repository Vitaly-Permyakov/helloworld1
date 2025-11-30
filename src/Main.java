public class Main {
    public static void main(String[] args) {
        // 1 задача
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789.;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // 2 задача
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // 3 задача
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // 4 задача
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // 5 5задача
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // 6 задача
        var firstBox = 78.2;
        var secondBox = 82.7;
        var obshaaMassa = firstBox + secondBox;
        System.out.println(obshaaMassa);
        var difference = secondBox - firstBox;
        System.out.println(difference);

        // 7 задача
        var remainder = secondBox % firstBox;
        System.out.println(remainder);

        //8 задача
        // 8.1
        var hWork = 640;
        var oneEmployee = 8;
        var employee = 640 / 8;
        System.out.println("Всего работников в компании - "+ employee+" человек.");
        // 8.2
        employee = employee + 94;
        var newHoursWork = employee * oneEmployee;
        System.out.println("Если в компании работает "+employee+" человека, то всего "+newHoursWork+" часов работы может быть поделено между сотрудниками");



    }
}
