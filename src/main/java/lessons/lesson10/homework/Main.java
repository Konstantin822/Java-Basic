package lessons.lesson10.homework;

public class Main {
    public static void main(String[] args) {
        Burger burger1 = new Burger("Bun", "meat", "cheese", "salad", "mayonnaise");
        Burger burger2 = new Burger("Bun", "meat", "cheese", "salad");
        Burger burger3 = new Burger("Bun", "meat", 2, "cheese", "salad", "mayonnaise");

        System.out.println(burger1);
        System.out.println(burger2);
        System.out.println(burger3);
    }
}
