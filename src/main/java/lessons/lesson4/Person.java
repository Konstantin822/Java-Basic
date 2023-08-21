package lessons.lesson4;

public class Person {
    public static void main(String[] args) {
//        Задание 2
//
//        1. Сделать класс Person и в нем метод personInfo()
//
//        2. На вход передавать ему четыре параметра: имя, фамилию, город, телефон
//
//        3. Внутри метода формировать строку в формате:
//
//        a. Позвонить гражданину + ИМЯ ФАМИЛИЯ + из города + ГОРОД можно по номеру + ТЕЛЕФОН
//
//        4. Метод должен возвращать String
//
//        5. В main-методе сделать три вызова метода personInfo, каждый раз передавая нового человека;
//
//        6. Должен получиться вывод такого типа:
//
//        a. Позвонить гражданину Will Smith из города New York можно по номеру 2936729462846.
//        b. Позвонить гражданину Jackie Chan из города Shanghai можно по номеру 12312412412.
//        c. Позвонить гражданину Sherlock Holmes из города London можно по номеру 37742123513.

        String personInfo1 = personInfo("Will", "Smith", "New York", "2936729462846");
        String personInfo2 = personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        String personInfo3 = personInfo("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(personInfo1);
        System.out.println(personInfo2);
        System.out.println(personInfo3);

    }

    static String personInfo(String name, String secondName, String town, String phone) {
        return "Call citizen " + name + " " + secondName + " from " + town + " by number " + phone;
    }
}
