package lessons.lesson11.homework;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Bob", 16, 5, 1997,
                "some email", "6755683456", "Anderson", 85, 90, 10000);
        Account account2 = new Account("John", 14, 9, 1980,
                "some email", "3838384834", "Smith", 90, 93, 12384);
        Account account3 = new Account("Jane", 19, 3, 1984,
                "some email", "2038573390", "Smith", 60, 994, 11345);

        account1.printAccountInfo();
        account2.setSurname("Cage");
        account2.setWeight(95);
        account3.setStepsTakenPerDay(13456);
        account3.setWeight(62);

        account2.printAccountInfo();
        account3.printAccountInfo();
    }
}
