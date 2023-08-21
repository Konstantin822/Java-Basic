package lessons.lesson10;

import java.util.Collection;

public class OOP1 {
    public static void main(String[] args) {
        demo3();
    }

    static void demo1() {
        Person person1 = new Person();
        person1.name = "Bob";
        person1.age = 28;

        System.out.println(person1.name);
        System.out.println(person1.age);

        person1.run();

        System.out.println();

        Person person2 = new Person();
        person2.name = "Chief";
        person2.age = 30;

        System.out.println(person2.name);
        System.out.println(person2.age);

        person2.run();
    }

    static void demo2() {
        Box box1 = new Box(3, 2, 4);
//        box1.a = 5;
//        box1.b = 7;
//        box1.c = 2;

        System.out.println("volume = " + box1.volume());

        Box box2 = new Box(5, 6, 7);
//        box2.a = 10;
//        box2.b = 9;
//        box2.c = 8;

        System.out.println("volume = " + box2.volume());

        Box box3 = new Box(box1, 5 , 6, 7);

        System.out.println("volume = " + box3.volume());

        System.out.println(box1.toString());
    }

    static void demo3() {
        ColorBox colorBox1 = new ColorBox();
        colorBox1.a = 10;
        colorBox1.b = 7;
        colorBox1.c = 8;
        colorBox1.color = "Red";

        System.out.println(colorBox1.volume());
        colorBox1.printColor();
    }
}
