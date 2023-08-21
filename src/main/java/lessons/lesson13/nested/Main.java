package lessons.lesson13.nested;

import lessons.lesson13.nested.Car;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.engine.start();
//
//        Car.Wheel wheel = new Car.Wheel();
//        wheel.demo();
//
//        System.out.println(car);

//        car.demoLocalClass();

        // Анонимный класс
        MusicStyle musicStyle = new MusicStyle() {
            @Override
            void playMusic() {
                System.out.println("Playing classic music");
            }
        };

        MusicStyle musicStyle2 = new MusicStyle() {
            @Override
            void playMusic() {
                System.out.println("qwerty");
            }
        };

        MusicStyleInterface musicStyleInterface = () -> System.out.println("Qwerty");
        musicStyle.playMusic();
        musicStyle2.playMusic();
        musicStyleInterface.playMusic();
//
    }
}
