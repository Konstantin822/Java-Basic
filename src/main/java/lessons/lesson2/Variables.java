package lessons.lesson2;

public class Variables {
    public static void main(String[] args) {
        byte byteVariable;

        byteVariable = -128;

        short shortVariable = 32000;

        int intVariable = 21470000;

        long longVariable = 20403403040340L;

        float floatVariable = 35.1234567891234F;

        double doubleVariable = 35.123456789123454534534;

        System.out.println(byteVariable);
        System.out.println(shortVariable);
        System.out.println(intVariable);
        System.out.println(longVariable);
        System.out.println(floatVariable);
        System.out.println(doubleVariable);

        char charVariable = 'A';
        char charVariable2 = 65;
        char charVariable3 = '\u0041';
        char charVariable4 = '\u2766';

        System.out.println(charVariable);
        System.out.println(charVariable2);
        System.out.println(charVariable3);
        System.out.println(charVariable4);

        boolean booleanVariable = true;
        boolean booleanVariable2 = false;

        System.out.println(booleanVariable);
        System.out.println(booleanVariable2);


        String someStr = "Hello" + "sdfsdfds";
        System.out.println(someStr);

        int a = 10;
        int b = 4;
        int c = 5;

        int badResult = a / b;

        double goodResult = (double) a / b;


        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println("result = " + badResult);
        System.out.println("result = " + goodResult);


        double avg = (double) (a + b + c) / 3;

        System.out.println("avg = " + avg);
        System.out.println();


        byte someByteVariable = (byte) 500;
        System.out.println(someByteVariable);

//        short badShort = (short) 2_000_000;
//        System.out.println(badShort);


//        int someInt;

        //System.out.println(someInt);


        Byte a1 = 10;
        Short a2;
        Integer a3 = Integer.MAX_VALUE;
        Long a4;
        Float a5;
        Double a6;
        Character a7 = 'A';
        Boolean a8 = true;


        a3.doubleValue();

        for (int i = 127; i <= 150; i++) {

            System.out.println("number " + i + " = " + (byte) i);
        }

        byte da = (byte) 130;
        System.out.println(da);
    }
}
