package lessons.lesson4;

public class Methods {
    public static void main(String[] args) {
        //        String str1 = getStrHello();
//        System.out.println(str1);
        printGreeting();

//        double d1 = 1.222;
//        System.out.println(1.222);
//        System.out.println(d1);
//        System.out.println(demo1());
//        printGreeting();

        int a = 10;
        int b = 15;
        int sum = getSum(a, b);
        System.out.println(a);
        System.out.println(sum);

        double sum2 = getSum(10.5, 5);

        System.out.println(sum2);


        sum = getSum(getNumber1(), getNumber2());
        System.out.println(sum);

    }

    static int getNumber1() {
        return 10;
    }

    static int getNumber2() {
        return getNumber3();
    }

    static int getNumber3() {
        return 30;
    }

    static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    static double getSum(double a, int b) {
        double result = a + b;
        return result;
    }

    static double getSum(double a, double b) {
        double result = a + b;
        return result;
    }

    static void printGreeting() {
        System.out.println("Hello");
    }

    //    static String getStrHello() {
//        String hello = "Hello";
//        return hello;
//    }
//
//    static double demo1() {
//        return 1.222;
//    }
}
