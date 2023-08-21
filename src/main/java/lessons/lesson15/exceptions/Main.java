package lessons.lesson15.exceptions;

import lessons.lesson15.DrinkMachine.DrinksMachine;

import java.io.IOError;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "qwerty";
        try {
            DrinksMachine.valueOf(str);
        } catch (IllegalArgumentException e) {
            System.out.println("Choose drink from list: " +
                    Arrays.toString(DrinksMachine.values()));
        }

        try {
            demo();
        } catch (SQLException | IOException | NullPointerException e) { //Мультикэтч
            // Или просто (Exception - ловит любое исключение) использовать
            // в крайнем случае если не надо ловить конкретное исключение
            e.printStackTrace();
        }
    }

    static void demo() throws SQLException, IOException {
        if (1 > 2) {
            throw new SQLException("some error");
        } else {
            throw new IOException("some error");
        }
    }
}
