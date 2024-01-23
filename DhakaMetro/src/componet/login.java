package componet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.*;

public class login extends JFrame {
   private ImageIcon barimage,logo;
   private Container background;
   private JPanel p1,p2;
   private JLabel w1,imagelable,w2;
   private JLabel user,password;

   private JPasswordField Password;
   private JTextField User;
   private Font f1,f2,f3;


    JButton b1,b2,b3;

    public login()
    {
        try {

            barimage = new ImageIcon(Objects.requireNonNull(getClass().getResource("assetment//barlogomatro.png")));
            this.setIconImage(barimage.getImage());
        }catch(Exception e)
        {

        }
        this.setLayout(null);
        this.setSize(800,500);
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
        background.setBackground(new Color(12345));



        // creating a panel 1

        // image for first page
        logo=new ImageIcon(getClass().getResource("assetment//barlogomatro.png"));
        imagelable =new JLabel(logo);
        imagelable.setBounds(30,20,logo.getIconWidth(),logo.getIconHeight());

        //text for under image
        f2=new Font("Times New Roman",Font.BOLD,16);

        w2=new JLabel("Welcome To Dhaka Metro Rail Corporation");
        int x=logo.getIconHeight();
        w2.setBounds(40,x+350,250,70);
        w2.setFont(f2);
        w2.setForeground(new Color(5639237));



        p1=new JPanel();
        p1.setSize(400,500);
        p1.setBackground(Color.white);
        p1.add(imagelable);
        p1.add(w2);

        background.add(p1);

        // Panel 2
        p2=new JPanel();
        p2.setBounds(400,40,400,50);
        p2.setBackground(Color.red);
        background.add(p2);

        // add login text
        f1=new Font("Times New Roman",Font.PLAIN,25);
        w1 =new JLabel("SIGN-IN");
        w1.setBounds(530,50, 230,40);
        w1.setFont(f1);
        w1.setForeground(Color.white);
        p2.add(w1);

        //user text add
            f3=new Font("Times New Roman",Font.CENTER_BASELINE,20);
        user =new JLabel("Email");
        user.setBounds(450,120,120,40);
        user.setFont(f3);
        user.setForeground(Color.white);
        background.add(user);

        //user text field

        User =new JTextField();
        User.setBounds(450,160,230,30);
        user.setBackground(Color.lightGray);
        background.add(User);

        password =new JLabel("Password");
        password.setForeground(Color.white);
        password.setBounds(450,190,150,40);
        password.setFont(f3);
        background.add(password);

        //password textfeild

        Password =new JPasswordField();
        Password.setBackground(Color.lightGray);
        Password.setBounds(450,230,230,30);
        Password.setEchoChar('*');
        background.add(Password);

        b1=new JButton("Sign in");
        b1.setBounds(450,280,80,30);
        b1.setFocusable(false);
        b1.setBackground(new Color(8905489));
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        b1.setBorderPainted(false);
        b1.setFocusPainted(false);
        b1.setDefaultCapable(false);
        background.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String path="D://DhakaMetro//src//server//data//password.CSV";
                String line="";
                try{
                    BufferedReader reader=new BufferedReader(new FileReader(path));
                    while((line=reader.readLine())!=null)
                    {
                       String [] value=line.split(",");

//                       System.out.println(value[i]);

                        for(int i=0;i<value.length;i++) {
                            if (User.getText().equals(value[i]) && Password.getText().equals(value[i + 1])) {
                                new Dashboard().setVisible(true);
                                dispose();
                                break;
                            }
                        }


                    }



                }catch(Exception ex)
                {

                }
            }
        });


        b2=new JButton("Register");
        b2.setBounds(590,280,90,30);
        b2.setFocusable(false);
        b2.setBackground(new Color(8905489));
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        b2.setBorderPainted(false);
        b2.setFocusPainted(false);
        b2.setDefaultCapable(false);
        background.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new singup().setVisible(true);
                dispose();
            }
        });


        b3=new JButton("Forget");
        b3.setBounds(450,314,80,30);
        b3.setFocusable(false);
        b3.setBackground(new Color(8905489));
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        b3.setBorderPainted(false);
        b3.setFocusPainted(false);
        b3.setDefaultCapable(false);
        b3.setVisible(false);
        background.add(b3);


    }

//    public static void main(String[] args) {
//        new login().setVisible(true);
//    }

}
