public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789.0;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19.0;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var x = 78.2;
        var y = 82.7;
        var result1 = x + y;
        System.out.println("Общая масса двух бойцов = " + result1 + "кг");
        var result2 = y - x;
        System.out.println("Разница между массами бойцов = " + result2 + "кг");
        var result3 = y % x;
        System.out.println("Общий остаток от деления = " + result3 + "кг");

        var a = 640;
        var b = 8;
        var result4 = a / b;
        System.out.println("Всего работников в компании - " + result4 + " человек ");
        var result5 = result4 + 94;
        System.out.println("Если в компании работает - " + result5 + " человек, то всего " + result5 * 8 + " часов работы может быть поделено между сотрудниками");

    }
}