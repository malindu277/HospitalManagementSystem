package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;


public class AddAppointment extends JFrame {
    
    
    JTextField  tfappid,tfptname, tfnic, tfemail, tfdoa, tftoa, tfdoc, tfdocspc, tfpurpose, tfappfee ;
    JButton create, back ;
            
    AddAppointment()    {
        setSize(1000, 1000);
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
        
               
        
        //Label for Patient Name
        JLabel lblptname = new JLabel("Patient Name"); 
        lblptname.setBounds(60, 80, 150, 25);
        lblptname.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lblptname);

        //TextField for Patient Name
        tfptname = new JTextField();
        tfptname.setBounds(60, 110, 350, 25);
        tfptname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfptname);
		
		
        
        //Label for NIC
        JLabel lblnic = new JLabel("NIC");
        lblnic.setBounds(60, 140, 150, 25);
        lblnic.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lblnic);
        
        //Textfield for NIC
        tfnic = new JTextField();
        tfnic.setBounds(60, 170, 350, 25);
        tfnic.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfnic);
		
		
		
	
        //Label for EMAIL
        JLabel lblemail = new JLabel("E-Mail");
        lblemail.setBounds(60, 200, 150, 25);
        lblemail.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lblemail);
        
        //Textfield for EMAIL
        tfemail = new JTextField();
        tfemail.setBounds(60, 230, 350, 25);
        tfemail.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfemail);
		
		
		
		
        
        //Label for Date of appointment
        JLabel lbldoa = new JLabel(" Date of Appointment");
        lbldoa.setBounds(60, 260, 250, 25);
        lbldoa.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lbldoa);
        
        //Textfield for Date of appointment
        tfdoa = new JTextField();
        tfdoa.setBounds(60, 290, 350, 25);
        tfdoa.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfdoa);
		
		
		
        
        //Label for Time of appointment
        JLabel lbltoa = new JLabel("Time of Appointment");
        lbltoa.setBounds(60, 320, 250, 25);
        lbltoa.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lbltoa);
        
        //Textfield for Time of appointment
        tftoa = new JTextField();
        tftoa.setBounds(60, 350, 350, 25);
        tftoa.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tftoa);
		
		
		
        
        //Label for Doctor Name
        JLabel lbldoc = new JLabel("Doctor Name");
        lbldoc.setBounds(60, 380, 250, 25);
        lbldoc.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lbldoc);
        
        //Textfield for Doctor Name
        tfdoc = new JTextField();
        tfdoc.setBounds(60, 410, 350, 25);
        tfdoc.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfdoc);
        
		
		
		
        //Label for Specialization
        JLabel lbldocspc = new JLabel("Specialization");
        lbldocspc.setBounds(60, 440, 150, 25);
        lbldocspc.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lbldocspc);
        
        //Textfield for Specialization
        tfdocspc = new JTextField();
        tfdocspc.setBounds(60, 470, 350, 25);
        tfdocspc.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfdocspc);
		
	
		
		
		 //Label for purpose
        JLabel lblpurpose = new JLabel("Purpose of the appointment");
        lblpurpose.setBounds(60, 500, 350, 25);
        lblpurpose.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lblpurpose);
        
        //Textfield for  purpose
        tfpurpose = new JTextField();
        tfpurpose.setBounds(60, 530, 350, 25);
        tfpurpose.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpurpose);
		
		
		
		
		
        //Label for appointment fee
        JLabel lblappfee = new JLabel("Appointment Fee");
        lblappfee.setBounds(60, 560, 350, 25);
        lblappfee.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
        p1.add(lblappfee);
        
        //Textfield for  appointment fee
        tfappfee = new JTextField();
        tfappfee.setBounds(60, 590, 350, 25);
        tfappfee.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfappfee);
		
		
        
		
		
		
        
        //CREATE button
        create = new JButton("Confirm");
        create.setBounds(80, 650, 100, 30);
        create.setBackground(new Color(102,102,255));
        create.setForeground(Color.WHITE);
        create.setBorder(new LineBorder(new Color (102,102,255)));
        //create.addActionListener(this);
        p1.add(create);

        //Back Button
        back = new JButton("Back");
        back.setBounds(250, 650, 100, 30);
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
    new AddAppointment();
}
}
