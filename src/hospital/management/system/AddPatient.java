package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;

public class AddPatient extends JFrame {
    
    JTextField  tfname,tfgender, tfnic, tfdob, tfadd, tftel, tfusername, tfpassword ;
    JButton create, back ;
            
    AddPatient()    {
        setSize(1000, 800);
        setLocation(380, 25);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("MAKE APPOINTMENT");
        text.setBounds(560, 20, 400, 45);
        text.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
        text.setForeground(Color.BLUE); // To change the text color to blue (you can choose any color)
        text.setHorizontalAlignment(JLabel.CENTER); // To center the text horizontally
        text.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK)); // To add an underline effect
        add(text);


        //panel for login image & blue part
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(500, 0, 500, 800);
        p1.setLayout(null);
        add(p1);
        
        
                //Label for USERNAME
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 80, 150, 25);
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lblusername);

        //TextField for USERNAME
        tfusername = new JTextField();
        tfusername.setBounds(60, 110, 350, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        //Label for PASSWORD
        JLabel lblpassword = new JLabel("Password"); 
        lblpassword.setBounds(60, 140, 150, 25);
        lblpassword.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lblpassword);

        //TextField for PASSWORD
        tfpassword = new JTextField();
        tfpassword.setBounds(60, 170, 350, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        //Label for Name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60, 200, 150, 25);
        lblname.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lblname);
        
        //Textfield for Name
        tfname = new JTextField();
        tfname.setBounds(60, 230, 350, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        //Label for Gender
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(60, 260, 150, 25);
        lblgender.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lblgender);
        
        //Textfield for Gender
        tfgender = new JTextField();
        tfgender.setBounds(60, 290, 350, 30);
        tfgender.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfgender);
        
        //Label for NIC
        JLabel lblnic = new JLabel("NIC");
        lblnic.setBounds(60, 320, 150, 25);
        lblnic.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lblnic);
        
        //Textfield for NIC
        tfnic = new JTextField();
        tfnic.setBounds(60, 350, 350, 30);
        tfnic.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfnic);
        
        //Label for DOB
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(60, 380, 150, 25);
        lbldob.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lbldob);
        
        //Textfield for DOB
        tfdob = new JTextField();
        tfdob.setBounds(60, 410, 350, 30);
        tfdob.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfdob);
        
        //Label for Address
        JLabel lbladd = new JLabel("Address");
        lbladd.setBounds(60, 440, 150, 25);
        lbladd.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lbladd);
        
        //Textfield for Address
        tfadd = new JTextField();
        tfadd.setBounds(60, 470, 350, 30);
        tfadd.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfadd);
        
        //Label for Telephone
        JLabel lbltel = new JLabel("Telephone");
        lbltel.setBounds(60, 500, 150, 25);
        lbltel.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lbltel);
        
        //Textfield for Telephone
        tftel = new JTextField();
        tftel.setBounds(60, 530, 350, 30);
        tftel.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tftel);
        
        
        //Signup Button
        create = new JButton("Create");
        create.setBounds(80, 660, 100, 30);
        create.setBackground(new Color(102,102,255));
        create.setForeground(Color.WHITE);
        create.setBorder(new LineBorder(new Color (102,102,255)));
        //create.addActionListener(this);
        p1.add(create);

        //Back Button
        back = new JButton("Back");
        back.setBounds(250, 660, 100, 30);
        back.setBackground(new Color(102,102,255));
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(new Color (102,102,255)));
        //back.addActionListener(this);
        p1.add(back);
        
        
        //Add image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images OOP/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(600,600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30, 100, 450, 450);
        add(image);
        
         
        
        setVisible(true);
    }
    
    
    
    public static void main(String args[])  {
            new AddPatient();
    
    }
}
