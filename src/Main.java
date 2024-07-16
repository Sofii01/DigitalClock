//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {

    private static JLabel clockLabel = new JLabel();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.add(clockLabel);
        frame.setVisible(true);

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateClock();
            }
        });
        timer.start();
    }

    public static void updateClock() {
        LocalDateTime currentTime = LocalDateTime.now();
        String timeString = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        clockLabel.setText(timeString);
    }
}