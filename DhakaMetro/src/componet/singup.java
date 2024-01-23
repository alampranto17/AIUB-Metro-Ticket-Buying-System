package componet;
import server.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.chrono.JapaneseDate;
import java.util.Objects;

public class singup extends JFrame implements ActionListener {
  private  ImageIcon barimage,i1;
    private Container background;
   private JPanel p1;
   private JLabel image,t1,t2,password,cpassword;

   private JTextField w1,w2,w3,w4,w6,w7,w8,w9,w10;

   private JPasswordField x1,x2;

   private JTextArea w5;

   private JLabel name,email,date,nid,address,religion,phone,Bloodgroup,status,gender;
   private Font f1,f2,f3,f4;

   private JButton b1,b2;

   private JScrollPane scroll;

   private JRadioButton male,female,other,married,unmarried;

   private ButtonGroup group,group2;

   private JCheckBox a1;
  private  String Gender = null;
  private  String Status = null;


    singup()
    {
        try {

            barimage = new ImageIcon(Objects.requireNonNull(getClass().getResource("assetment//barlogomatro.png")));
            this.setIconImage(barimage.getImage());
        }catch(Exception e)
        {

        }
        this.setLayout(null);
        this.setSize(900,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Dhaka Metro");

        //background function
        Background();
    }
    void Background() {
        background = getContentPane();
        background.setBackground(Color.red);

        //panel 1
        i1 = new ImageIcon(getClass().getResource("assetment/registerlogo.jpeg"));

        image = new JLabel((i1));
        image.setBounds(0, 0, i1.getIconWidth(), i1.getIconHeight());


        p1 = new JPanel();
        p1.setBounds(0, 0, 900, 100);
        p1.setBackground(new Color(043));
//        p1.add(image);
        background.add(image);
        background.add(p1);

        // text 2 in panel
        f1 = new Font("Times New Roman", Font.BOLD, 30);
        t1 = new JLabel("REGISTRATION FROM");
        t1.setBounds(230, 80, 600, 70);
        t1.setForeground(Color.white);
        t1.setFont(f1);
        p1.add(t1);

        //from textfield
        f2 = new Font("Times new Roman", Font.BOLD, 22);

        //text front
        name = new JLabel("Name *");
        name.setBounds(80, 120, 90, 20);
        name.setForeground(Color.white);
        name.setFont(f2);
        background.add(name);

        //fieldtext
        f3 = new Font("Times new Roman", Font.PLAIN, 18);
        w1 = new JTextField();
        w1.setBounds(80, 145, 250, 35);
        w1.setBackground(Color.LIGHT_GRAY);
        w1.setFont(f3);
        background.add(w1);
        //text 
        email = new JLabel("Email *");
        email.setBounds(80, 192, 90, 20);
        email.setForeground(Color.white);
        email.setFont(f2);
        background.add(email);

        //tf -> textfield

        w2 = new JTextField();
        w2.setBounds(80, 217, 250, 35);
        w2.setFont(f3);
        w2.setBackground(Color.LIGHT_GRAY);
        background.add(w2);

        //dateofbirth
        f4 = new Font("Times new roman", Font.BOLD, 18);
        date = new JLabel("Date of birth * (dd/mm/YYYY)");
        date.setBounds(80, 259, 250, 20);
        date.setForeground(Color.white);
        date.setFont(f4);
        background.add(date);

        w3 = new JTextField();
        w3.setBounds(80, 282, 250, 35);
        w3.setFont(f3);
        w3.setBackground(Color.LIGHT_GRAY);
        background.add(w3);

        nid = new JLabel("National Id Card Number *");
        nid.setBounds(80, 325, 250, 20);
        nid.setForeground(Color.white);
        nid.setFont(f4);
        background.add(nid);

        w4 = new JTextField();
        w4.setBounds(80, 348, 250, 35);
        w4.setFont(f3);
        w4.setBackground(Color.LIGHT_GRAY);
        background.add(w4);

        address = new JLabel("Address ");
        address.setBounds(80, 393, 250, 20);
        address.setForeground(Color.white);
        address.setFont(f2);
        background.add(address);

        w5 = new JTextArea();
        w5.setFont(f3);
        w5.setBackground(Color.LIGHT_GRAY);
        w5.setLineWrap(true);
        w5.setWrapStyleWord(true);

        scroll = new JScrollPane(w5);
        scroll.setBounds(80, 423, 250, 60);
        background.add(scroll);

        phone = new JLabel("Mobile Number *");
        phone.setBounds(80, 487, 250, 20);
        phone.setForeground(Color.white);
        phone.setFont(f4);
        background.add(phone);

        w6 = new JTextField();
        w6.setBounds(80, 510, 250, 35);
        w6.setFont(f3);
        w6.setBackground(Color.LIGHT_GRAY);
        background.add(w6);
        // one side done 

        religion = new JLabel("Religion");
        religion.setBounds(500, 120, 90, 30);
        religion.setForeground(Color.white);
        religion.setFont(f2);
        background.add(religion);

        w7 = new JTextField();
        w7.setBounds(500, 155, 250, 30);
        w7.setFont(f3);
        w7.setBackground(Color.LIGHT_GRAY);
        background.add(w7);

        Bloodgroup = new JLabel("Blood Group");
        Bloodgroup.setBounds(500, 189, 150, 30);
        Bloodgroup.setForeground(Color.white);
        Bloodgroup.setFont(f2);
        background.add(Bloodgroup);

        w8 = new JTextField();
        w8.setBounds(500, 221, 250, 30);
        w8.setFont(f3);
        w8.setBackground(Color.LIGHT_GRAY);
        background.add(w8);

        gender = new JLabel("Gender *");
        gender.setBounds(500, 255, 150, 30);
        gender.setForeground(Color.white);
        gender.setFont(f2);
        background.add(gender);

        male = new JRadioButton("Male");
        male.setBackground(Color.red);
        male.setForeground(Color.white);
        male.setFont(f4);
        male.setFocusable(false);
        male.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(male.isSelected())
                {
                    Gender="Male";
                }
            }
        });

        male.setBounds(500, 287, 80, 30);

        female = new JRadioButton("Female");
        female.setBackground(Color.red);
        female.setForeground(Color.white);
        female.setFont(f4);
        female.setFocusable(false);
        female.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Gender="Female";
            }
        });

        female.setBounds(590, 287, 120, 30);

        other = new JRadioButton("Other ");
        other.setBackground(Color.red);
        other.setForeground(Color.white);
        other.setFocusable(false);


        other.setFont(f4);
        other.setBounds(712, 287, 100, 30);
        other.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Gender="Other";
            }
        });

        group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);
        background.add(male);
        background.add(female);
        background.add(other);






        status = new JLabel(" Status *");
        status.setBounds(500, 315, 150, 30);
        status.setForeground(Color.white);
        status.setFont(f2);
        background.add(status);

        married = new JRadioButton("Married ");
        married.setBackground(Color.red);
        married.setForeground(Color.white);
        married.setFocusable(false);
        married.setFont(f4);
        married.setBounds(500, 347, 100, 30);
        married.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Status="Married";
            }
        });

        unmarried = new JRadioButton("Unmarried ");
        unmarried.setBackground(Color.red);
        unmarried.setForeground(Color.white);
        unmarried.setFocusable(false);
        unmarried.setFont(f4);
        unmarried.setBounds(610, 347, 130, 30);
        unmarried.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Status="Unmarried";
            }
        });
        group2=new ButtonGroup();
        group2.add(married);
        group2.add(unmarried);
        background.add(married);
        background.add(unmarried);






        password =new JLabel("Password*");
        password.setBounds(500,377,130,30);
        password.setFont(f2);
        password.setForeground(Color.white);
        background.add(password);

        x1=new JPasswordField();
        x1.setEchoChar('*');
        x1.setBackground(Color.LIGHT_GRAY);
        x1.setBounds(500,409,250,30);
        x1.setFont(f2);
        background.add(x1);

        cpassword =new JLabel("Confirm Password*");
        cpassword.setBounds(500,442,250,30);
        cpassword.setFont(f2);
        cpassword.setForeground(Color.white);
        background.add(cpassword);

        x2=new JPasswordField();
        x2.setEchoChar('*');
        x2.setBackground(Color.LIGHT_GRAY);
        x2.setBounds(500,475,250,30);
        x2.setFont(f2);
        background.add(x2);








//        a1 = new JCheckBox();
//        a1.setBounds(250, 575, 20, 20);
//        a1.setBackground(Color.red);
//        a1.setEnabled(true);
//        a1.setForeground(Color.white);
//        a1.setBorderPainted(false);
//        a1.addActionListener(this);

//        background.add(a1);

        t2 = new JLabel("You must fill in all the blanks marked with an asterisk(*) in this form");
        t2.setBounds(274, 567, 600, 40);
        t2.setForeground(Color.white);
        t2.setFont(f4);
        background.add(t2);
        //button

          b1 = new JButton("Sign-up");
          b1.setBounds(400, 610, 80, 30);
          b1.setFocusable(false);
          b1.setBackground(new Color(8905489));
          b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
          b1.setBorderPainted(false);
          b1.setEnabled(true);
          b1.setFocusPainted(false);
          b1.setDefaultCapable(false);
          b1.addActionListener(this);

          background.add(b1);

          b2 = new JButton("Back");
          b2.setBounds(700, 610, 80, 30);
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
                login lg=new login();
                lg.setVisible(true);
                dispose();

            }
        });





    }



        @Override
        public void actionPerformed(ActionEvent e) {






        if(e.getSource()==b1) {
            String name = w1.getText().trim();
            String email = w2.getText().trim();

            String dateofbirth = w3.getText().trim();

            String nid = w4.getText().trim();
            String address = w5.getText().trim();
            String Religion = w7.getText().trim();
            String Phone = w6.getText().trim();
            String Bloodgroup = w8.getText().trim();
            String CGender = Gender;
            String CStatus = Status;
            String password = null;


            try {
                if (x1.getText().equals(x2.getText())) {
                    password = x2.getText();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Password Not Match");
                    w1.setText("");
                    w2.setText("");
                    w3.setText("");
                    w4.setText("");
                    w5.setText("");
                    w6.setText("");
                    w7.setText("");
                    w8.setText("");
                    x1.setText("");
                    x2.setText("");
                }
            }catch(Exception ex)
            {

            }
            if (name.isEmpty() || email.isEmpty() || nid.isEmpty() || Phone.isEmpty() || dateofbirth.isEmpty() || CGender.isEmpty() || CStatus.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "It seems like some required information is missing. Please fill in all the fields to proceed. Thanks!");
                w1.setText("");
                w2.setText("");
                w3.setText("");
                w4.setText("");
                w5.setText("");
                w6.setText("");
                w7.setText("");
                w8.setText("");
                x1.setText("");
                x2.setText("");
                return;
            }


            //verification

            verification v=new verification();
            if(!v.isnameverification(name))
            {
                JOptionPane.showMessageDialog(null," Name invalid");
                return;
            }

            //email
            if(!v.isemailverification(email))
            {
                JOptionPane.showMessageDialog(null," Email invalid");
                return;

            }
            //birth
            if(!v.isdateofbirthverification(dateofbirth))
            {
                JOptionPane.showMessageDialog(null," Birthday invalid");
                dateofbirth=null;
                return;
            }
            //nid
            if(!v.isnidverification(nid))
            {
                JOptionPane.showMessageDialog(null," Nid invalid");
                nid=null;
                return;
            }
            //number
            if(!v.isphoneverification(Phone))
            {
                JOptionPane.showMessageDialog(null,"number invalid");
                Phone=null;
                return;
            }

            if ( !name.isEmpty() && !email.isEmpty() && !nid.isEmpty() && !Phone.isEmpty() && !dateofbirth.isEmpty() && !CGender.isEmpty() && !CStatus.isEmpty() && !password.isEmpty()) {
                new verification(name, email, nid, address, dateofbirth, Phone, Bloodgroup, Religion, CStatus, CGender, password);
                new login().setVisible(true);
                dispose();

            }
            else {
                JOptionPane.showMessageDialog(null,"ERROR");
                w1.setText("");
                w2.setText("");
                w3.setText("");
                w4.setText("");
                w5.setText("");
                w6.setText("");
                w7.setText("");
                w8.setText("");
                x1.setText("");
                x2.setText("");

            }





        }//if




    }

}
