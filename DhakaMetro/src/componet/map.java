package componet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class map extends JFrame {
  private  ImageIcon barimage,image;
   private JLabel l1;
   private JPanel p1;
    private JButton back;
    private Container background;
    private Font f1;
    private JLabel t1;


map()
    {
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
    void Background()
    {
        background=getContentPane();
        //title
        f1 = new Font("Times New Roman", Font.BOLD, 30);
        t1 = new JLabel("DHAKA METRO RAIL MAP");
        t1.setBounds(250, 20, 600, 70);
        t1.setForeground(new Color(12345));
        t1.setFont(f1);
        background.add(t1);





        image=new ImageIcon(getClass().getResource("assetment//metro_rail-wb_1.jpg"));
        l1=new JLabel(image);
        l1.setBounds(10,85,image.getIconWidth(),image.getIconHeight());
        background.add(l1);

        p1=new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(0,600,900,200);
        background.add(p1);

        back=new JButton("BACK");
        back.setBounds(0,0,40,30);
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        back.setBackground(Color.LIGHT_GRAY);
        back.setFocusable(false);
        back.setBorderPainted(false);
        back.setAlignmentX(Component.LEFT_ALIGNMENT);
        back.setForeground(Color.BLACK);
        p1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Dashboard d=new Dashboard();
                d.setVisible(true);
                dispose();
            }
        });
        
        

    }


}
