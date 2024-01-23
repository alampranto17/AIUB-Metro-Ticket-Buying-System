package componet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class booking extends JFrame{
    private ImageIcon barimage, image;
    private Container background;
    private JLabel a1, a2, a3, a4, a5, a6, a7;


    private JComboBox cb, rb;

    private JRadioButton one, two;
    private ButtonGroup group, group2;

    private JCheckBox c1, c2, c3, c4;

    private int ways, ticket, form, to;

    private JTextField s1;

    private JButton Okey, buy,back;


    booking() {
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
        background.setBackground(new Color(30,130,65));
        image = new ImageIcon(getClass().getResource("assetment//ticket.jpg"));
        a1 = new JLabel(image);
        a1.setBounds(400, 150, image.getIconWidth(), image.getIconHeight());




//        p1.add(image);


       Font f1 = new Font("Times New Roman", Font.BOLD, 30);
       JLabel t1 = new JLabel("METRO RAIL TICKET BOOKING");
        t1.setBounds(230, 40, 600, 70);
        t1.setForeground(Color.white);
        t1.setFont(f1);
       background.add(t1);


        Font f2 = new Font("Times New Roman", Font.BOLD, 14);
        a3 = new JLabel("FORM");
        a3.setForeground(Color.white);
        a3.setFont(f2);
        a3.setBounds(40, 120, 100, 30);
        background.add(a3);

        String station[] = {"Select", "Uttara North", "Uttara Center", "Uttara South", "Pallabi", "Mirpur 11", "Mirpur 10", "Kazipara", "Shewrapara", "Agargaon"};
        cb = new JComboBox(station);
        cb.setBounds(40, 150, 180, 30);
        background.add(cb);
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form = cb.getSelectedIndex();
            }
        });


        a4 = new JLabel("TO");
        a4.setForeground(Color.white);
        a4.setFont(f2);
        a4.setBounds(40, 180, 100, 30);
        background.add(a4);

        rb = new JComboBox(station);
        rb.setBounds(40, 210, 180, 30);
        background.add(rb);
        rb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                to = rb.getSelectedIndex();
            }
        });

        a5 = new JLabel("TYPE (one way or two way)");
        a5.setFont(f2);
        a5.setForeground(Color.white);
        a5.setBounds(40, 300, 200, 40);
        background.add(a5);
        one = new JRadioButton("One Way");
        one.setFocusable(false);
        one.setForeground(Color.white);
        one.setBorderPainted(false);
        one.setBackground(new Color(30,130,65));
        one.setBounds(40, 340, 80, 30);
        background.add(one);


        two = new JRadioButton("two ways");
        two.setFocusable(false);
        two.setForeground(Color.white);
        two.setBorderPainted(false);
        two.setBackground(new Color( 30,130,65));
        two.setBounds(125, 340, 80, 30);
        background.add(two);
        group = new ButtonGroup();
        group.add(one);
        group.add(two);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ways = 1;
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ways = 2;
            }
        });


        a6 = new JLabel("TICKETS");
        a6.setBounds(40, 240, 200, 30);
        a6.setForeground(Color.white);
        a6.setFont(f2);
        background.add(a6);

        c1 = new JCheckBox("one");
        c1.setForeground(Color.white);
        c1.setBounds(40, 270, 80, 30);
        c1.setBackground(new Color(30,130,65));
        c1.setFocusable(false);
        c1.setBorderPainted(false);
        background.add(c1);
        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticket = 1;
            }
        });

        c2 = new JCheckBox("two");
        c2.setForeground(Color.white);
        c2.setBounds(124, 270, 80, 30);
        c2.setBackground(new Color(30,130,65));
        c2.setFocusable(false);
        c2.setBorderPainted(false);
        background.add(c2);
        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticket = 2;
            }
        });

        c3 = new JCheckBox("Three");
        c3.setForeground(Color.white);
        c3.setBounds(208, 270, 80, 30);
        c3.setBackground(new Color(30,130,65));
        c3.setFocusable(false);
        c3.setBorderPainted(false);
        background.add(c3);
        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticket = 3;
            }
        });

        c4 = new JCheckBox("Four");
        c4.setForeground(Color.white);
        c4.setBounds(292, 270, 80, 30);
        c4.setBackground(new Color(30,130,65));
        c4.setFocusable(false);
        c4.setBorderPainted(false);
        background.add(c4);
        c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticket = 4;
            }
        });
        group2 = new ButtonGroup();
        group2.add(c1);
        group2.add(c2);
        group2.add(c3);
        group2.add(c4);

        a7 = new JLabel("PRICE");
        a7.setFont(f2);
        a7.setForeground(Color.white);
        a7.setBackground(Color.white);
        a7.setBounds(40, 440, 80, 40);
        background.add(a7);

        s1 = new JTextField();
        s1.setBounds(40, 480, 80, 40);
        s1.setFont(f2);
        s1.setHorizontalAlignment(JTextField.CENTER);
        s1.setText("0");
        s1.setEditable(false);
        background.add(s1);

        buy = new JButton("Buy");
        buy.setFocusable(false);
        buy.setBackground(Color.white);

        buy.setBorderPainted(false);
        buy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buy.setBounds(250, 580, 80, 30);
        buy.setEnabled(false);
        background.add(buy);
        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Processing");

                JOptionPane.showMessageDialog(null,"PLEASE CHECK YOUR E-MAIL");
            }

        });

        Okey = new JButton("Okey");
        Okey.setFocusable(false);
        Okey.setBackground(Color.white);
        Okey.setBorderPainted(false);
        Okey.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Okey.setBounds(40, 400, 80, 30);
        background.add(Okey);
        Okey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(form==0 || to==0 || ticket==0 || ways==0 )
                {
                    JOptionPane.showMessageDialog(null,"SOME INFORMATION IS MISSING");
                }
                else {

                    int result = 0;
                    if (form > to) {
                        result = form - to;
                    } else if (to > form) {
                        result = to - form;
                    }

                    result = result * ways * 10 * ticket;
                    s1.setText(String.valueOf(result));
                    buy.setEnabled(true);

                }

            }
        });




        back = new JButton("back");
        back.setFocusable(false);
        back.setBackground(Color.white);
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


        
        
        


        background.add(a1);


    }

}
