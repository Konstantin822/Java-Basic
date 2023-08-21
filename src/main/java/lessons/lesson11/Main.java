package lessons.lesson11;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee("Bob", 28, new Car("BMW"));

        // Клон
        Employee employee2 = new Employee(employee1);
//        employee2.name = employee1.name;
//        employee2.age = employee1.age;
        // employee2.car = employee1.car;  неправильно
//        employee2.car = new Car(employee1.car.carModel);

        /* Employee employee2 = employee1; - неправильно
         employee2.age = 29; - изменение второго обьекта
         меняет и первый обьект.
        */

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println();

        employee2.age = 29;
        employee2.car.carModel = "Mercedez";

        System.out.println(employee1);
        System.out.println(employee2);

        Employee employee3 = (Employee) employee1.clone();

        System.out.println(employee3);
        employee3.car.carModel = "Audi";

        System.out.println(employee1);
        System.out.println(employee3);

        Employee employee4 = new Employee(employee1.name, employee1.age, new Car(employee1.car.carModel));
        Employee employee5 = new Employee("Alex");
    }
}
