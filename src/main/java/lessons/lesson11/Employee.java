package lessons.lesson11;

public class Employee implements Cloneable {

    String name;
    int age;
    Car car;

    public Employee(String name) {
        this(name, 0);
    }

    public Employee(String name, int age) {
        this(name, age, null);
    }

    public Employee(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    // Клонирование через конструктор
    public Employee(Employee employee) {
        // Вариант 1
//        this.name = employee.name;
//        this.age = employee.age;
//        this.car = new Car(employee.car.carModel);

        // Вариант 2
        this(employee.name, employee.age, new Car(employee.car.carModel));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee temp = new Employee(this.name, this.age, new Car(this.car.carModel));
        return temp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car.carModel +
                '}';
    }
}
