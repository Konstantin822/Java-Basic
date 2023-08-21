package lessons.lesson13.nested;

import java.util.Arrays;

public class Car {

    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door rightDoor = new Door();
    public Door leftDoor = new Door();

    private int someInt = 10;
    private static int staticInt = 20;
    private void demo() {
        System.out.println("I am private");
    }

    private static void demo2() {
        System.out.println("Static Private");
    }

    public void tryPrintInnerVariable() {
        System.out.println(engine.volume);
    }

    public void tryPrintInnerVariable2() {
        System.out.println(Wheel.wheelPrivate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine.getName() +
                ", wheel=" + Arrays.toString(wheel) +
                ", rightDoor=" + rightDoor +
                ", leftDoor=" + leftDoor +
                ", someInt=" + someInt +
                '}';
    }

    public void startEngine() {

    }

    // Локальный класс
    public void demoLocalClass() {
        // Локальный класс: доступен локально в месте его создания
        class DemoLocal {
            private String str = "Qwerty";
            public void doSomething() {
                System.out.println(str);
            }
        }

        DemoLocal demoLocal = new DemoLocal();
        demoLocal.doSomething();
    }

    /* Внутренние классы нужны для:
    1. Инкапсуляции на более высоком уровне
    2. Если будут приватные поля сделать доступ без геттеров
        */

    // Обычный класс
    class Engine {

        private double volume = 5.5;

        private String name = "N20";

        public String getName() {
            return name;
        }

        public void start() {
            System.out.println(someInt);
            demo();
        }

        public void stop() {
        }
    }
/* У обычного класа есть доступ и к статическим и обычным
у статического только к статическим
 */
    // Статический класс
    static class Wheel {
        private static double wheelPrivate = 12;
        public void infalre(int psi) {
        } // Повернуть колесо на кол-во градусов

        public void demo() {
            System.out.println(staticInt);
            demo2();
        }
    }

    class Window {
        public void rollUp() {
        }

        public void rollDown() {
        }
    }

    class Door {
        public Window window = new Window();

        public void open() {
        }

        public void close() {
        }
    }
}
