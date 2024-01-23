package componet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class timetable extends JFrame {
    ImageIcon barimage,image;
    Container background;

    JPanel time;

    JButton back;

    JLabel a1,a2,a3;


    timetable() {
        try {

            barimage = new ImageIcon(Objects.requireNonNull(getClass().getResource("assetment//barlogomatro.png")));
            this.setIconImage(barimage.getImage());
        } catch (Exception e) {

        }
        this.setLayout(null);
        this.setSize(900, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Dhaka Metro");

        //background function
        Background();
    }
    void Background() {
        background = getContentPane();
        background.setBackground(Color.WHITE);

        image = new ImageIcon(getClass().getResource("assetment//timetable.jpg"));


        a1 = new JLabel(image);
        a1.setBounds(550, 120, image.getIconWidth(), image.getIconWidth());
        background.add(a1);

        Font f1 = new Font("Times New Roman", Font.BOLD, 30);
        a2 = new JLabel(
                "METRO TIMETABLES AND ROUTES");
        a2.setBounds(209, 20, 800, 50);
        a2.setFont(f1);
        a2.setBackground(Color.darkGray);
        background.add(a2);
        ImageIcon i = new ImageIcon(getClass().getResource("assetment//time.png"));
//        Font  f3 = new Font("Times New Roman", Font.BOLD, 25);
        a3 = new JLabel(i);
//        a3.setForeground(Color.white);

        time = new JPanel();
        time.setBounds(20, 90, 500, 500);
        time.setBackground(Color.white);
        time.add(a3);
        background.add(time);

        back = new JButton("back");
        back.setFocusable(false);
        back.setBackground(Color.GRAY);
        back.setBorderPainted(false);
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        back.setBounds(700, 615, 80, 30);
        background.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dashboard().setVisible(true);
                dispose();
            }
        });

    }
}
