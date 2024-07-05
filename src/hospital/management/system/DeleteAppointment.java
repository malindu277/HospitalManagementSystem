
package hospital.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class DeleteAppointment extends JFrame {
    
    
        JTextField tfptname;
        JButton delete, back;

       DeleteAppointment(String sname)   {
            //Window frame
            setSize(900, 500);
            setLocation(450, 150);
            setLayout(null);

            getContentPane().setBackground(Color.WHITE);
            
        JLabel text = new JLabel("DELETE Appointment");
        text.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
        text.setForeground(Color.BLUE);
        text.setHorizontalAlignment(JLabel.CENTER); // Center the text horizontally
        text.setBounds(450, 20, 400, 45); // Adjust the position
        text.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK)); // Adjust the border
        add(text);


        // panel for login image & blue part
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 400, 500);
        p1.setBackground(new Color(131, 193, 233));
        p1.setLayout(null);
        add(p1);
        
           //panel for USERNAME  & PASSWORD
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 481, 389);
        add(p2);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images OOP/logo.png"));
        Image i2 = i1.getImage().getScaledInstance (450,450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(32, 60, 350, 350);
        p1.add(image);
            
       //Label for Staff Member Name
        JLabel lblsname = new JLabel("Appointment Name"); 
        lblsname.setBounds(60, 140, 250, 25);
        lblsname.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p2.add(lblsname);

        //TextField for Staff Member Name
        tfptname = new JTextField();
        tfptname.setBounds(60, 180, 300, 30);
        tfptname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfptname);
		
       

            // Create the "Delete" button
JButton deleteButton = new JButton("Delete");
deleteButton.setBounds(32, 350, 150, 30); // Adjust the position and size as needed
p2.add(deleteButton);

// Create the "Back to Homepage" button
JButton backButton = new JButton("Back to Homepage");
backButton.setBounds(235, 350, 150, 30); // Adjust the position and size as needed
p2.add(backButton);

            
            
           
            
             setVisible(true);
             
        }
           
        public static void main(String args[])  {
            new DeleteAppointment("adt");


        }  
}
