package lessons.snake.objects;

import lessons.snake.SnakeMain;

public class Snake {
    public int lenght = 2; // длина змейки
    public int direction = 1; // направление движения змейки

    public int[] snakeX = new int[300]; // максимальный размер змейки
    public int[] snakeY = new int[300];

    // Начальный координаты для головы и туловища
    public Snake(int x1, int y1, int x2, int y2) {
        snakeX[0] = x1; // Голова змейки. Старт
        snakeX[1] = x2;
        snakeY[0] = y1;
        snakeY[1] = y2;
    }
    // Метод движения змейки
    public void move() {
        // Цикл движения хвоста за головой
        for (int i = lenght; i > 0; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }
        
        // UP
        if (direction == 0) {
            snakeY[0]--;
        }
        // DOWN
        if (direction == 2) {
            snakeY[0]++;
        }
        // RIGHT
        if (direction == 1) {
            snakeX[0]++;
        }
        // LEFT
        if (direction == 3) {
            snakeX[0]--;
        }


        // Если змейка доходит до конца окна, перерисовуется с противоположной стороны
        if (snakeY[0] > SnakeMain.HEIGHT - 1) {
            snakeY[0] = 0;
        }
        if (snakeY[0] < 0) {
            snakeY[0] = SnakeMain.HEIGHT - 1;
        }
        if (snakeX[0] > SnakeMain.WIDTH - 1) {
            snakeX[0] = 0;
        }
        if (snakeX[0] < 0) {
            snakeX[0] = SnakeMain.WIDTH - 1;
        }
    }
}
