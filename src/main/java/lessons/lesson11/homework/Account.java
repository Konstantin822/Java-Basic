package lessons.lesson11.homework;

public class Account {
    final String name;
    final int dayOfBirth;
    final int monthOfBirth;
    final int yearOfBirth;
    final String email;
    final String phone;

    String surname;
    int weight;
    int pressure;
    int stepsTakenPerDay;
    int age;

    public Account(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String phone,
                   String surname, int weight, int pressure, int stepsTakenPerDay) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsTakenPerDay = stepsTakenPerDay;
        this.age = 2020 - yearOfBirth;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setStepsTakenPerDay(int stepsTakenPerDay) {
        this.stepsTakenPerDay = stepsTakenPerDay;
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void printAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tracker:\n" +
                "name: " + name + "\n" +
                "dayOfBirth: " + dayOfBirth + "\n" +
                "monthOfBirth: " + monthOfBirth + "\n" +
                "yearOfBirth: " + yearOfBirth + "\n" +
                "email: " + email + "\n" +
                "phone: " + phone + "\n" +
                "surname: " + surname + "\n" +
                "weight: " + weight + "\n" +
                "pressure: " + pressure + "\n" +
                "stepsTakenPerDay: " + stepsTakenPerDay + "\n" +
                "age: " + age + "\n";
    }
}
