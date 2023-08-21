package lessons.practise.ticTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
    private char[][] board; // Объявление переменной board типа char[][],
    //                         которая представляет игровое поле размером 3x3.
    private char currentPlayer; // Объявление переменной currentPlayer типа char,
    //                             которая хранит текущего игрока ('X' или 'O').


    // Конструктор класса TicTacToe, который инициализирует игровое поле
    // и устанавливает текущего игрока на 'X'.
    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }


    // Метод playGame(), который содержит основной игровой цикл
    // и управляет ходами игроков и проверками на победу/ничью.
    public void playGame() {
        boolean gameOver = false;
        int moves = 0;

        while(!gameOver) {
            printBoard();
            int[] move = getPlayerMove();
            int row = move[0];
            int col = move[1];

            if (isValidMove(row, col)) {
                makeMove(row, col);

                if (checkWin(row, col)) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " won");
                    gameOver = true;
                } else if (moves == 8) {
                    printBoard();
                    System.out.println("Draw");
                    gameOver = true;
                }

                switchPlayer();
                moves++;
            } else {
                System.out.println("Wrong move. Try again.");
            }
        }

        if (playAgain()) {
            resetBoard();
            playGame();
        }
    }


    // Метод initializeBoard(), который заполняет игровое поле символами '-' для представления пустых ячеек.
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }


    // Метод printBoard(), который выводит текущее состояние игрового поля в консоль.
    private void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }


    // Метод getPlayerMove(), который запрашивает у текущего игрока ввод строки
    // и столбца для совершения хода и возвращает массив с координатами.
    private int[] getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int[] move = new int[2];

        System.out.println("Player " + currentPlayer + ", enter row number: ");
        move[0] = scanner.nextInt() - 1;

        System.out.println("Player " + currentPlayer + ", enter column number: ");
        move[1] = scanner.nextInt() - 1;

        return move;
    }


    // Метод isValidMove(int row, int col), который проверяет,
    // является ли ход валидным (в пределах размеров поля и на пустую ячейку).
    private boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }
        return board[row][col] == '-';
    }


    // Метод makeMove(int row, int col), который осуществляет ход игрока,
    // помещая его символ ('X' или 'O') в указанную ячейку поля.
    private void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }


    // Метод checkWin(int row, int col), который проверяет,
    // есть ли победа после совершения хода игрока.
    private boolean checkWin(int row, int col) {
        return (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) ||
                (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) ||
                (row == col && board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (row + col == 2 && board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }


    // Метод switchPlayer(), который переключает текущего игрока между 'X' и 'O'.
    private void switchPlayer() {
        currentPlayer = currentPlayer == 'X' ? '0' : 'X';
    }


    // Метод playAgain(), который запрашивает у игрока желание сыграть еще раз.
    private boolean playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? (1 - Yes, 2 - No): ");
        int choice = scanner.nextInt();

        return choice == 1;
    }


    // Метод resetBoard(), который сбрасывает игровое поле
    // и устанавливает текущего игрока на 'X' для новой игры.
    private void resetBoard() {
        initializeBoard();
        currentPlayer = 'X';
    }
}
