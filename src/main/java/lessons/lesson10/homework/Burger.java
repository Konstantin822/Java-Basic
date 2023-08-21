package lessons.lesson10.homework;

public class Burger {
    String bun;
    String meat;
    int amount;
    String cheese;
    String salad;
    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;

        System.out.println("Standart burger: " + bun + ", " + meat + ", " + cheese + ", " + salad + ", " + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String salad) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;

        System.out.println("Diet burger: " + bun + ", " + meat + ", " + cheese + ", " + salad);
    }

    public Burger(String bun, String meat, int amount, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.amount = amount;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;

        System.out.println("Double meat burger: " + bun + ", " + meat + " " + amount + " pieces, " + cheese + ", " + salad + ", " + mayonnaise);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", amount=" + amount +
                ", cheese='" + cheese + '\'' +
                ", salad='" + salad + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                '}';
    }
}
