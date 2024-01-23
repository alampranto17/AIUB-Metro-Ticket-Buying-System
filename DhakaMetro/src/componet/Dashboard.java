package componet;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Dashboard extends JFrame {
    private ImageIcon barimage, image, i1;
    private Container background;
    private JPanel p1, p2;
    private JLabel l1, l2, t1;

    private Font f1;

    private JButton booking, contact, timetable, Map, logout;

    Dashboard() {
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
        //panel


        i1 = new ImageIcon(getClass().getResource("assetment/registerlogo.jpeg"));

        l2 = new JLabel((i1));
        l2.setBounds(0, 0, i1.getIconWidth(), i1.getIconHeight());


        p1 = new JPanel();
        p1.setBounds(0, 0, 900, 80);
        p1.setBackground(new Color(043));
//        p1.add(image);
        background.add(l2);
        background.add(p1);

        f1 = new Font("Times New Roman", Font.BOLD, 30);
        t1 = new JLabel("WELCOME TO DHAKA METRO RAIL");
        t1.setBounds(230, 80, 600, 70);
        t1.setForeground(Color.white);
        t1.setFont(f1);
        p1.add(t1);


        p2 = new JPanel();
        p2.setBounds(35, 115, 779, 40);
        p2.setLayout(new FlowLayout());
        p2.setBackground(Color.white);
        background.add(p2);


        booking = new JButton("TICKET");
        booking.setBounds(0, 5, 40, 30);
        booking.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        booking.setBackground(Color.white);
        booking.setFocusable(false);
        booking.setBorderPainted(false);
        booking.setAlignmentX(Component.LEFT_ALIGNMENT);
        booking.setForeground(Color.BLACK);
        p2.add(booking);
        booking.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new booking().setVisible(true);
                dispose();
            }
        });

        contact = new JButton("ABOUT-US");
        contact.setBounds(40, 0, 40, 30);
        contact.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contact.setBackground(Color.white);
        contact.setFocusable(false);
        contact.setBorderPainted(false);
        contact.setAlignmentX(Component.LEFT_ALIGNMENT);
        contact.setForeground(Color.BLACK);
        p2.add(contact);
        contact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new contact().setVisible(true);
                dispose();
            }
        });

        Map = new JButton("MAP ");
        Map.setBounds(40, 0, 40, 30);
        Map.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Map.setBackground(Color.white);
        Map.setFocusable(false);
        Map.setBorderPainted(false);
        Map.setAlignmentX(Component.LEFT_ALIGNMENT);
        Map.setForeground(Color.BLACK);
        p2.add(Map);
        Map.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new map().setVisible(true);
                dispose();
            }
        });

        timetable = new JButton("TIMETABLE");
        timetable.setBounds(40, 0, 40, 30);
        timetable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        timetable.setBackground(Color.white);
        timetable.setFocusable(false);
        timetable.setBorderPainted(false);
        timetable.setAlignmentX(Component.LEFT_ALIGNMENT);
        timetable.setForeground(Color.BLACK);
        p2.add(timetable);
        timetable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new timetable().setVisible(true);
                dispose();
            }
        });

        logout = new JButton("Log-out");
        logout.setBounds(40, 700, 80, 30);
        logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logout.setBackground(Color.white);
        logout.setFocusable(false);
        logout.setBorderPainted(false);
        logout.setAlignmentX(Component.LEFT_ALIGNMENT);
        logout.setForeground(Color.BLACK);
        p2.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new login().setVisible(true);
                dispose();
            }
        });


        image = new ImageIcon(getClass().getResource("assetment//d1.jpg"));
        l1 = new JLabel(image);
        l1.setBounds(35, 150, image.getIconWidth(), image.getIconHeight());
        background.add(l1);


    }
}
