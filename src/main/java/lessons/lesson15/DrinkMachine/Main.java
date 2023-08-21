package lessons.lesson15.DrinkMachine;

import lessons.lesson15.DrinkMachine.Drink;
import lessons.lesson15.DrinkMachine.DrinkMaker;
import lessons.lesson15.DrinkMachine.Drinks;
import lessons.lesson15.DrinkMachine.DrinksMachine;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int totalPrice = 0;

    public static void main(String[] args) {
        run();
        System.out.println("Total count: " + Drink.count);
        System.out.println("Total price: " + totalPrice);
        scanner.close();
    }

    private static void run() {
        System.out.println("You can buy: " + Arrays.toString(DrinksMachine.values()));

        while(true) {
            DrinksMachine drinksMachine = getDrinkType();
            if (drinksMachine == null) {
                return;
            }

            String str = "You choose: %s, price: %d";
            switch (drinksMachine) {
                case COFFEE -> {
                    System.out.println("You choose: " + drinksMachine.getTitle() + ", price: " + Drinks.COFFEE_PRICE);
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.COFFEE_PRICE;
                    break;
                }

                case TEA -> {
                //    System.out.println("You choose: " + drinksMachine.getTitle() + ", price: " + Drinks.TEA_PRICE);
                    System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.TEA_PRICE));
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.TEA_PRICE;
                    break;
                }
            }
        }
    }

    private static DrinksMachine getDrinkType() {
        System.out.println("Choose drink or type \"stop\"");

        while (true) {
            String str = scanner.next().toUpperCase();

            if (str.equals("STOP")) {
                return null;
            }

            for (DrinksMachine value: DrinksMachine.values()) {
                if (str.equals(value.toString())) {
                    return DrinksMachine.valueOf(str);
                }
            }
            System.out.println("Choose drink from the list " + Arrays.toString(DrinksMachine.values()));
        }
    }
}
