package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class UpdateAddingStaff extends JFrame {
    
    JTextField  tfsid,tfsname, tfsfield, tfsemail, tfstele, tfsaddress ;
    JButton update, back ;
            
    UpdateAddingStaff()    {
        setSize(1000, 800);
        setLocation(380, 25);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("CUSTOMIZE ADDING STAFF DETAILS");
        text.setBounds(560, 20, 400, 45);
        text.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
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
        
        
      
        
		
		
		
        //Label for Staff Member Name
        JLabel lblsname = new JLabel("Name"); 
        lblsname.setBounds(60, 140, 100, 25);
        lblsname.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p1.add(lblsname);

        //TextField for Staff Member Name
        tfsname = new JTextField();
        tfsname.setBounds(60, 180, 300, 30);
        tfsname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfsname);
		
		
		
        
        //Label for field
        JLabel lblsfield = new JLabel("Field");
        lblsfield.setBounds(60, 220, 100, 25);
        lblsfield.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p1.add(lblsfield);
        
        //Textfield for field
        tfsfield = new JTextField();
        tfsfield.setBounds(60, 260, 300, 30);
        tfsfield.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfsfield);
		
		
		
        
        //Label for Staff Email
        JLabel lblsemail = new JLabel("E-mail");
        lblsemail.setBounds(60, 300, 100, 25);
        lblsemail.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p1.add(lblsemail);
        
        //Textfield for Staff Email
        tfsemail = new JTextField();
        tfsemail.setBounds(60, 340, 300, 30);
        tfsemail.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfsemail);
		
		
		
		
        
        //Label for Telephone
        JLabel lblstele= new JLabel("Telephone");
        lblstele.setBounds(60, 380, 100, 25);
        lblstele.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p1.add(lblstele);
        
        //Textfield for  Telephone
        tfstele = new JTextField();
        tfstele.setBounds(60, 420, 300, 30);
        tfstele.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfstele);
		
		
		
		
        
        //Label for Address
        JLabel lblsaddress = new JLabel("Address");
        lblsaddress.setBounds(60, 460, 150, 25);
        lblsaddress.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p1.add(lblsaddress);
        
        //Textfield for Address
        tfsaddress = new JTextField();
        tfsaddress.setBounds(60, 500, 300, 30);
        tfsaddress.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfsaddress);
        
		
		
		
        
        //SUpdate Button
        update = new JButton("Update");
        update.setBounds(80, 600, 100, 30);
        update.setBackground(new Color(102,102,255));
        update.setForeground(Color.WHITE);
        update.setBorder(new LineBorder(new Color (102,102,255)));
        //create.addActionListener(this);
        p1.add(update);

        //Back Button
        back = new JButton("Back");
        back.setBounds(250, 600, 100, 30);
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
    
    
    
public static void main(String[] args) {
    new UpdateAddingStaff();
}
    
}
