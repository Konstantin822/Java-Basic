package lessons.snake.objects;

import lessons.snake.SnakeMain;

public class Apple {

    public int posX;
    public int posY;

    public Apple(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Apple() {
        setRandomPosition();
    }

    public void setRandomPosition() {
        posX = Math.abs((int) (Math.random() * SnakeMain.WIDTH - 1));
        posY = Math.abs((int) (Math.random() * SnakeMain.HEIGHT - 1));
    }
}
