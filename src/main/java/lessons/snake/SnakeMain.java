package lessons.snake;

import lessons.lesson11.homework.Account;
import lessons.snake.objects.Apple;
import lessons.snake.objects.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SnakeMain extends JPanel implements ActionListener {
    public static JFrame jFrame; // Полотно для работы
    public static final int SCALE = 32; // Размер клетки в пикселях
    public static final int WIDTH = 20; // Размер клетки в пикселях
    public static final int HEIGHT = 20; // Размер клетки в пикселях

    public Snake snake = new Snake(5, 6, 5, 5);
    //public Apple apple = new Apple(Math.abs((int) (Math.random() * SnakeMain.WIDTH - 1)), Math.abs((int) (Math.random() * SnakeMain.HEIGHT - 1)));
    public Apple apple = new Apple();
    public static int speed = 9;
    public Timer timer = new Timer(1000 / speed, this);
    public SnakeMain() {
        timer.start();
        addKeyListener(new KeyBoard()); // Добавляем слушателя для нажатия кнопки
        setFocusable(true); // Что бы сфокусироваться на этом окне
    }

    public static void main(String[] args) {
        // тайтл
        jFrame = new JFrame("Snake"); // По удобству
//        jFrame = new JFrame();
//        jFrame.setTitle("");

        // размер окна
        jFrame.setSize(WIDTH * SCALE + 12, HEIGHT * SCALE + 2);

        // завершение при закрытии окна
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // запрет растягивания окна
        jFrame.setResizable(false);

        // размещение посередине
        jFrame.setLocationRelativeTo(null);

        jFrame.add(new SnakeMain());

        // сделать видимым
        jFrame.setVisible(true);
    }
    // Рисуем линии по вертикали
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE); // зарисовка всего поля

//        g.setColor(Color.GREEN);
//        g.fillOval(100, 100, 350, 350); // овал или круг
//
//        g.setColor(Color.WHITE);
//        g.fillOval(120, 120, 330, 350);

        g.setColor(Color.BLACK);
        for (int x = 0; x < WIDTH * SCALE; x += SCALE ) {
            g.drawLine(x, 0, x, HEIGHT * SCALE);
        }

        // горизонтальные
        for (int y = 0; y < HEIGHT * SCALE; y += SCALE ) {
            g.drawLine(0, y, WIDTH * SCALE, y);
        }

        g.setColor(Color.RED);
        g.fillOval(apple.posX * SCALE + 3, apple.posY * SCALE + 3, SCALE - 8, SCALE - 8);

        // Рисуем змейку
        for (int i = 0; i < snake.lenght; i++) {
            g.setColor(Color.GREEN);
            g.fillRect(snake.snakeX[i] * SCALE + 1, snake.snakeY[i] * SCALE + 1,
                    SCALE - 2, SCALE - 2);
            g.setColor(Color.GRAY);
            g.fillRect(snake.snakeX[0] * SCALE + 1, snake.snakeY[0] * SCALE + 1,
                    SCALE - 2, SCALE - 2);
        }


        //g.drawLine(100, 100, 350, 550);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        snake.move();

        if ((snake.snakeX[0] == apple.posX) && (snake.snakeY[0] == apple.posY)) {
            apple.setRandomPosition();
            snake.lenght++;
            if (snake.lenght % 5 == 0) {
                speed += 2;
                timer.setDelay(1000 / speed);
            }
        }

        for (int i = 1; i < snake.lenght; i++) {
            // Если яблоко появляется в теле змейки генерируется новая позиция
            if ((snake.snakeX[i] == apple.posX) && (snake.snakeY[i] == apple.posY)) {
                apple.setRandomPosition();
            }

            // Если голову врезалась в тело, игра окончена. Перезапуск игры.
            if ((snake.snakeX[0] == snake.snakeX[i]) && (snake.snakeY[0] == snake.snakeY[i])) {
                timer.stop();
                int opt = JOptionPane.showConfirmDialog(null, "Game over!!!", "", JOptionPane.YES_NO_OPTION);
                if (opt == 0) {
                    jFrame.setVisible(false);
                    snake.lenght = 2;
                    snake.direction = 0;
                    apple.setRandomPosition();
                    jFrame.setVisible(true);
                    timer.start();
                } else {
                    System.exit(0);
                };
            }
        }
        repaint();
    }
    // х1, у1 - начальные точки рисунка


    // Подключение клавиатуры к игре для управления змейкой
    public class KeyBoard extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            // Предотвращение переключения в противоположное направление
            if ((key == KeyEvent.VK_UP) && (snake.direction != 2)) {
                snake.direction = 0;
            }
            if ((key == KeyEvent.VK_DOWN) && (snake.direction != 0)) {
                snake.direction = 2;
            }
            if ((key == KeyEvent.VK_LEFT) && (snake.direction != 1)) {
                snake.direction = 3;
            }
            if ((key == KeyEvent.VK_RIGHT) && (snake.direction != 3)) {
                snake.direction = 1;
            }
        }
    }
}
