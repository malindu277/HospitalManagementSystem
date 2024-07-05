
package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class AboutUs extends JFrame{
    
     AboutUs() {

        setBounds(200, 50, 900, 600);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        // Top panel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.BLACK);
        p1.setBounds(0, 0, 1200, 600);
        add(p1);

        // Header panel
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(100, 149, 237));
        p2.setBounds(0, 0, 1200, 80);
        p1.add(p2);

        JLabel label1 = new JLabel("WELCOME TO SPRINGEDGE HOSPITALS!");
        label1.setBounds(40, 20, 600, 45);
        label1.setFont(new Font("Algerian", Font.PLAIN, 30));
        label1.setForeground(Color.BLACK);
        p2.add(label1);

        JLabel label2 = new JLabel("About Us");
        label2.setBounds(700, 20, 220, 45);
        label2.setFont(new Font("Algerian", Font.PLAIN, 25));
        label2.setForeground(Color.BLACK);
        p2.add(label2);
        
        JLabel lbregno = new JLabel("Your Health, Our Priority");
        lbregno.setFont(new Font("Broadway", Font.BOLD, 30));
        lbregno.setForeground(Color.BLACK);
        lbregno.setBounds(120, 140, 600, 25);
        p1.add(lbregno);


      
        // Split the paragraph into multiple lines
        String line1 = "Welcome to SpringEdge Hospital, where compassionate care meets";
        String line2 = "cutting-edge medical expertise. Our dedicated team of healthcare"; 
        String line3 = "professionals is committed to providing exceptional and personalized";
        String line4 = "healthcare services, ensuring the well-being and comfort of";
        String line5 = "every patient who walks through our doors. With";
        String line6 = "state-of-the-art facilities and a";
        String line7 = "patient-centric approach, we strive to deliver the";
        String line8 = "highest quality healthcare, empowering individuals to lead healthy";
        String line9 = "and fulfilling lives.The Greatest Wealth is Health";
       
       
        
        // Create separate labels for each line
        JLabel lbline1 = new JLabel(line1);
        lbline1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbline1.setForeground(new Color(153,153,153));
        lbline1.setBounds(190, 180, 600, 25);
        p1.add(lbline1);

        JLabel lbline2 = new JLabel(line2);
        lbline2.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbline2.setForeground(new Color(153,153,153));
        lbline2.setBounds(190, 210, 600, 25);
        p1.add(lbline2);
        
        
        JLabel lbline3 = new JLabel(line3);
        lbline3.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbline3.setForeground(new Color(153,153,153));
        lbline3.setBounds(190, 240, 600, 25);
        p1.add(lbline3);

        JLabel lbline4 = new JLabel(line4);
        lbline4.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbline4.setForeground(new Color(153,153,153));
        lbline4.setBounds(190, 270, 600, 25);
        p1.add(lbline4);

       JLabel lbline5 = new JLabel(line5);
        lbline5.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbline5.setForeground(new Color(153,153,153));
        lbline5.setBounds(190, 300, 600, 25);
        p1.add(lbline5);
        
        JLabel lbline6 = new JLabel(line6);
        lbline6.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbline6.setForeground(new Color(153,153,153));
        lbline6.setBounds(190, 330, 600, 25);
        p1.add(lbline6);
        
        JLabel lbline7 = new JLabel(line7);
        lbline7.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbline7.setForeground(new Color(153,153,153));
        lbline7.setBounds(190, 360, 600, 25);
        p1.add(lbline7);
        
        JLabel lbline8 = new JLabel(line8);
        lbline8.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbline8.setForeground(new Color(153,153,153));
        lbline8.setBounds(190, 390, 600, 25);
        p1.add(lbline8);
        
        JLabel lbline9 = new JLabel(line9);
        lbline9.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbline9.setForeground(new Color(153,153,153));
        lbline9.setBounds(190, 420, 600, 25);
        p1.add(lbline9);
        
        JButton button = new JButton("Back");
        button.setBounds(10, 530, 140, 25);
        button.setFont(new Font("Algerian", Font.PLAIN, 18));
        button.setForeground(Color.BLACK);
        add(button);
        
        
     
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images OOP/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image4 = new JLabel(i3);
        image4.setBounds(0, 30, 900, 700);
        p1.add(image4);

        setVisible(true);
    }

public static void main(String args[]) {
    new AboutUs();
}

    
}
