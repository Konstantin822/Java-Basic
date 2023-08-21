package lessons.lesson12;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.fly();

        System.out.println(Flyable.SOME_VARIABLE);

//        Cat.demo();
//
//        CatChild.demo();
//
//        System.out.println(Cat.someInt);
//        System.out.println(CatChild.someInt);

//        Person person1 = new Person(15);
//        Person person2= new Person(15);
//        Person person3 = new Person(15);
//        Person person4= new Person(15);
//        Person person5 = new Person(15);
//
//        System.out.println(Person.counter);

//        Person person1 = new Person(25);
//        Person person2 = new Person(26);
//
//        System.out.println(person1.getAge());
//        System.out.println(person2.getAge());
//        System.out.println();
//
//        Person.counter = 5;
//
//        System.out.println(person1.counter);
//        System.out.println(person2.counter);
//
//        System.out.println(Person.counter);

//        Cat cat = new Cat();
//        Dog dog = new Dog();

//        Animal cat = new Cat();
//        Animal dog = new Dog();
//
//        cat.greeting();
//        dog.greeting();

//        animal1.greeting();
//        animal2.greeting();
//
//        Animal animal;
//
//        animal = new Cat();
//
//        animal.greeting();


    }

    static void demo() {
        Animal[] animals = new Animal[] {
                new Cat(), new Cat(), new Dog(), new Cat(), new Dog()
        };

        for (Animal animal : animals) {
            animal.greeting();
        }
    }
}
