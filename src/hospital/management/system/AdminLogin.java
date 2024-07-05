
package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class AdminLogin extends JFrame {
    
    JTextField  tfadname,tfadpassword ;
    JButton login, password ;
            
    AdminLogin()    {
        setSize(900, 500);
        setLocation(450, 150);
       
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
        
        // JLabel for "Admin Login"
        // JLabel for "Admin Login"
        JLabel text = new JLabel("Admin Login");
        text.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
        text.setForeground(Color.BLUE);
        text.setHorizontalAlignment(JLabel.CENTER); // Center the text horizontally
        text.setBounds(450, 20, 400, 45); // Adjust the position
        text.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK)); // Adjust the border
        add(text);



        //panel for login image & blue part
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 400, 500);
        p1.setBackground(new Color(131, 193, 233));
        p1.setLayout(null);
        add(p1);
        
        
            //Add image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images OOP/logo.png"));
        Image i2 = i1.getImage().getScaledInstance (450,450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(32, 60, 350, 350);
        p1.add(image);
        
        
          //panel for USERNAME  & PASSWORD
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 481, 390);
        
        add(p2);
        
        
        
        //Label for Admin username
        JLabel lbladname = new JLabel("User Name");
        lbladname.setBounds(60, 80, 100, 25);
        lbladname.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lbladname);

        //TextField for  Admin username
        tfadname = new JTextField();
        tfadname.setBounds(60, 130, 300, 30);
        tfadname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfadname);
        
		
		
		
        //Label for Password
        JLabel lbladpassword = new JLabel("Password"); 
        lbladpassword.setBounds(60, 170, 100, 25);
        lbladpassword.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lbladpassword);

        //TextField for Password
        tfadpassword = new JTextField();
        tfadpassword.setBounds(60, 220, 300, 30);
        tfadpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfadpassword);
		
				
        
        //Login Button
         login = new JButton("Login");
        login.setBounds(160, 300, 130, 30);
        login.setBackground(new Color(102,102,255));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color (102,102,255)));
        p2.add(login);

    
         
        
        setVisible(true);
        
       
    }
    
    
    
public static void main(String[] args) {
   new AdminLogin();
}

       
    
}
