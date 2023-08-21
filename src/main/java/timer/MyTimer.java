package timer;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JLabel jLabelBreak = new JLabel();
        JLabel jLabel = new JLabel();

        jLabelBreak.setText("Break: ");

        jFrame.setLayout(new FlowLayout());
        jFrame.setTitle("Timer");
        jFrame.setBounds(500, 300, 400, 100);
        jFrame.add(jLabelBreak);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            int seconds = 10 * 60;

            public void run() {
                jLabel.setText(
                        (seconds / 60 < 10
                        ? "0" + seconds / 60
                        : seconds / 60)
                        + ":"
                        + (seconds % 60 < 10
                        ? "0" + seconds % 60
                        : seconds % 60));
                seconds--;
                if (seconds < 0) {
                    timer.cancel();
                    jLabel.setText("Time Over");
                }
            }
        },0 , 1000);
    }
}
