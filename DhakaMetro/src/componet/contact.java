package componet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class contact extends JFrame {
   private ImageIcon barimage,image;
  private  Container background;

  private JButton back;

    contact()
    {
        try {

            barimage = new ImageIcon(Objects.requireNonNull(getClass().getResource("assetment//barlogomatro.png")));
            this.setIconImage(barimage.getImage());
        }catch(Exception e)
        {

        }
        this.setLayout(null);
        this.setSize(1175,675);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Dhaka Metro");

        //background function
        Background();




    }
    void Background()
    {
        background = getContentPane();
        background.setBackground(new Color(12345));
     image=new ImageIcon(getClass().getResource("assetment//contact.jpg"));
       JLabel l1=new JLabel(image);
        l1.setBounds(0,0,image.getIconWidth(),image.getIconHeight());



        back = new JButton("back");
        back.setFocusable(false);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.white);
        back.setBorderPainted(false);
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        back.setBounds(40, 600, 80, 30);
        background.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dashboard().setVisible(true);
                dispose();
            }
        });





       background.add(l1);




    }

}
