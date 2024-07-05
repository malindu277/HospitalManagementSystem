package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;

public class PatientLogin extends JFrame implements ActionListener{

        JButton login, signup, password ;
        JTextField tfusername, tfpassword;
        JLabel facebook;

        PatientLogin() {
        setSize(900, 500);
        setLocation(450, 150);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("CREATE ACCOUNT");
        text.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
        text.setForeground(Color.BLUE);
        text.setHorizontalAlignment(JLabel.CENTER); // Center the text horizontally
        text.setBounds(450, 20, 400, 45); // Adjust the position
        text.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK)); // Adjust the border
        add(text);

        //panel for login image & blue part
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 400, 500);
        p1.setLayout(null);
        add(p1);

        
        
        //Add image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images OOP/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(32, 60, 350, 350);
        p1.add(image);

        //panel for USERNAME  & PASSWORD
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 481, 390);
        add(p2);

        //Label for USERNAME
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 50, 100, 25);
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p2.add(lblusername);

        //TextField for USERNAME
        tfusername = new JTextField();
        tfusername.setBounds(60, 90, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);

        //Label for PASSWORD
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 130, 100, 25);
        lblpassword.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p2.add(lblpassword);

        //TextField for PASSWORD
        tfpassword = new JTextField();
        tfpassword.setBounds(60, 170, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);

        //Login Button
        login = new JButton("Login");
        login.setBounds(60, 230, 130, 30);
        login.setBackground(new Color(102,102,255));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color (102,102,255)));
        login.addActionListener(this);
        p2.add(login);

        //Signup Button
        signup = new JButton("Signup");
        signup.setBounds(230, 230, 130, 30);
        signup.setBackground(new Color(102,102,255));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color (102,102,255)));
        //signup.addActionListener(this);
        p2.add(signup);
        
        JLabel SocialMedia = new JLabel("Or");
        SocialMedia.setBounds(200, 270, 280, 35);
        SocialMedia.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p2.add(SocialMedia);

        
        
        
        //Add Facebook Login
        ImageIcon facebook = new ImageIcon(ClassLoader.getSystemResource("Images OOP/facebook2.png"));
        Image facebook1 = facebook.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
        JLabel facebookLabel = new JLabel(facebook);
        facebookLabel.setBounds(50, 320, 50, 50);
        p2.add(facebookLabel);
        
        
        ImageIcon google = new ImageIcon(ClassLoader.getSystemResource("Images OOP/google2.png"));
        Image google1 = google.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
        JLabel googleLabel = new JLabel(google);
        googleLabel.setBounds(200, 320, 50, 50);
        p2.add(googleLabel);
        
        
        
        ImageIcon twitter = new ImageIcon(ClassLoader.getSystemResource("Images OOP/twitter2.png"));
        Image twitter1 = twitter.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
        JLabel twitterLabel = new JLabel(twitter);
        twitterLabel.setBounds(350, 320, 50, 50);
        p2.add(twitterLabel);
        
        
        
        
        




        setVisible(true);

        }
//backend action part
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == login)    {
            try {
                String username = tfusername.getText();
                String pass = tfpassword.getText();

                String query = "select * from login where username = '"+username+"' AND password = '"+pass+"' ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);

                if(rs.next() )  {
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Successfull!");
                    //new Loading(username);

                } else  {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }

            } catch (Exception e)   {
                e.printStackTrace();
            }
 


            } else if (ae.getSource() == signup)    {
                setVisible(false);
                //new Signup();
            } else  {
                setVisible(false);
                //new ForgetPassword();
            }
        }
    public static void main(String[] args)  {
            new PatientLogin();
        }
}
    
       

