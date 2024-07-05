
package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ViewPatient extends JFrame implements ActionListener {
    
      JButton back;
     
   

    public ViewPatient(String username)    {
        
        
        setBounds(450, 180, 870, 625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

         
    
        
        
        //Label for id
        JLabel lblid = new JLabel("User Id");
        lblid.setBounds(30, 50, 150, 25);
        add(lblid);

        //Label for id by system reads
        JLabel labelid = new JLabel();
        labelid.setBounds(220, 50, 150, 25);
        add(labelid);
        
       

        //Label for name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 110, 150, 25);
        add(lblname);

        //Label for name by system reads
        JLabel labelname = new JLabel();
        labelname.setBounds(220, 110, 150, 25);
        add(labelname);
        
        
          //Label for Gender
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 170, 150, 25);
        add(lblgender);

        //Label for Gender by system reads
        JLabel labelgender = new JLabel();
        labelgender.setBounds(220, 170, 150, 25);
        add(labelgender);

        
        
          //Label for NIC
        JLabel lblnic = new JLabel("NIC");
        lblnic.setBounds(30, 230, 150, 25);
        add(lblnic);

        //Label for NIC by system reads
        JLabel labelnic = new JLabel();
        labelnic.setBounds(220, 230, 150, 25);
        add(labelnic);
        
        
         //Label for DOB
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(30, 290, 150, 25);
        add(lbldob);

        //Label for DOB by system reads
        JLabel labeldob = new JLabel();
        labeldob.setBounds(220, 290, 150, 25);
        add(labeldob);
        
        
        
            //Label for Address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30, 350, 150, 25);
        add(lbladdress);

        //Label for Addreess by system reads
        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(220, 350, 150, 25);
        add(labeladdress);
        
        
        
       

        


      


       


    


        //Label for Phone
        JLabel lblphone = new JLabel("Telephone");
        lblphone.setBounds(30, 410, 150, 25);
        add(lblphone);

        //Label for Phone by system reads
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220, 410, 150, 25);
        add(labelphone);


        //Label for username
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 470, 150, 25);
        add(lblusername);

        //Label for E-mail by system reads
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 470, 150, 25);
        add(labelusername);


        //Add Back Button
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350, 530, 100, 25);
        back.addActionListener(this);
        add(back);
        
        


     
        
                try {
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"' ";
            ResultSet rs = c.s.executeQuery(query);

                while(rs.next())    {
                    labelid.setText(rs.getString("id"));
                    labelname.setText(rs.getString("Name"));
                    labelgender.setText(rs.getString("Gender"));
                    labelnic.setText(rs.getString("NIC"));
                    labeldob.setText(rs.getString("Date of Birth"));
                    labeladdress.setText(rs.getString("Address"));
                    labelphone.setText(rs.getString("Telephone"));
                    labelusername.setText(rs.getString("Username"));
                   

                }


        } catch (Exception e)   {
            e.printStackTrace();
        }



        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    public static void main(String args[])  {
        new ViewPatient("adt");
}       
   
          
}
