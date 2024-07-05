
package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ViewStaff extends JFrame implements ActionListener {
      JButton back;
     
   

    public ViewStaff(String username)    {
        
        
        setBounds(450, 180, 870, 625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

         
    
        
        
        //Label for id
        JLabel lblid = new JLabel("Staff Id");
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
        
        
          //Label for Field
        JLabel lblfield = new JLabel("Field");
        lblfield.setBounds(30, 170, 150, 25);
        add(lblfield);

        //Label for Field by system reads
        JLabel labelfield = new JLabel();
        labelfield.setBounds(220, 170, 150, 25);
        add(labelfield);

        
        
          //Label for Email
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30, 230, 150, 25);
        add(lblemail);

        //Label for Email by system reads
        JLabel labelemail = new JLabel();
        labelemail.setBounds(220, 230, 150, 25);
        add(labelemail);
        
        
         //Label for DOB
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(30, 290, 150, 25);
        add(lbldob);

        //Label for Phone by system reads
        JLabel labeldob= new JLabel();
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
                    labelfield.setText(rs.getString("Field"));
                    labelemail.setText(rs.getString("Email"));
                    labeldob.setText(rs.getString("Date of Birth"));
                    labeladdress.setText(rs.getString("Address"));
                    
                    
                   

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
        new ViewStaff("adt");
}       
   
}
