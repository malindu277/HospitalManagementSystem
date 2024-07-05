
package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class ViewAppointment  extends JFrame implements ActionListener {
    
     JButton back;
     
   

    public ViewAppointment(String username)    {
        
        
        setBounds(450, 180, 1000, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

         
    
        
        
        //Label for Appointment id
        JLabel lblappid = new JLabel("Appointment Id");
        lblappid.setBounds(30, 50, 150, 25);
        add(lblappid);

        //Label for id by system reads
        JLabel labelappid = new JLabel();
        labelappid.setBounds(220, 50, 150, 25);
        add(labelappid);
        
       

        //Label for Appointment name
        JLabel lblptname = new JLabel("Patient Name");
        lblptname.setBounds(30, 110, 150, 25);
        add(lblptname);

        //Label for Appointment name by system reads
        JLabel labelptname = new JLabel();
        labelptname.setBounds(220, 110, 150, 25);
        add(labelptname);
        
        
          //Label for NIC
        JLabel lblnic = new JLabel("NIC");
        lblnic.setBounds(30, 170, 150, 25);
        add(lblnic);

        //Label for NIC by system reads
        JLabel labelnic = new JLabel();
        labelnic.setBounds(220, 170, 150, 25);
        add(labelnic);

        
        
         //Label for E mail
        JLabel lblemail = new JLabel("E-mail");
        lblemail.setBounds(30, 230, 150, 25);
        add(lblemail);

        //Label for E mail by system reads
        JLabel labelemail = new JLabel();
        labelemail.setBounds(220, 230, 150, 25);
        add(labelemail);
        
        
         //Label for DOA
        JLabel lbldoa = new JLabel("Date of Appointment");
        lbldoa.setBounds(30, 290, 150, 25);
        add(lbldoa);

        //Label for DOA by system reads
        JLabel labeldoa = new JLabel();
        labeldoa.setBounds(220, 290, 150, 25);
        add(labeldoa);
        
        
        
        //Label for TOA
        JLabel lbltoa = new JLabel("Time of Appointment");
        lbltoa.setBounds(30, 350, 150, 25);
        add(lbltoa);

        //Label TOA by system reads
        JLabel labeltoa = new JLabel();
        labeltoa.setBounds(220, 350, 150, 25);
        add(labeltoa);
        
         
        //Label for Doctor
        JLabel lbldoc = new JLabel("Doctor");
        lbldoc.setBounds(30, 410, 150, 25);
        add(lbldoc);

        //Label Doctor by system reads
        JLabel labeldoc = new JLabel();
        labeldoc.setBounds(220, 410, 150, 25);
        add(labeldoc);
        
         
        //Label for Specialization
        JLabel lbldocspc = new JLabel("Specialization");
        lbldocspc.setBounds(30, 470, 150, 25);
        add(lbldocspc);

        //Label Specialization by system reads
        JLabel labeldocspc = new JLabel();
        labeldocspc.setBounds(220, 470, 150, 25);
        add(labeldocspc);
        
         
        //Label for Purpose
        JLabel lblpurpose = new JLabel("Purpose");
        lblpurpose.setBounds(30, 530, 150, 25);
        add(lblpurpose);

        //Label Purpose by system reads
        JLabel labelpurpose = new JLabel();
        labelpurpose.setBounds(220, 530, 150, 25);
        add(labelpurpose);
        
         
        //Label for Appointment fee
        JLabel lblappfee = new JLabel("Appointment fee");
        lblappfee.setBounds(30, 590, 150, 25);
        add(lblappfee);

        //Label Appointment fee by system reads
        JLabel labelappfee = new JLabel();
        labelappfee.setBounds(220, 590, 150, 25);
        add(labelappfee);
        
        
        
            

        //Add Back Button
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350, 650, 100, 25);
        back.addActionListener(this);
        add(back);
        
        


     
        
                try {
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"' ";
            ResultSet rs = c.s.executeQuery(query);

                while(rs.next())    {
                    labelappid.setText(rs.getString("Appointment Id"));
                    labelptname.setText(rs.getString("Patient Name"));
                    labelnic.setText(rs.getString("NIC"));
                    labelemail.setText(rs.getString("E-mail"));
                    labeldoa.setText(rs.getString("Date of Appointment"));
                    labeltoa.setText(rs.getString("Time of Appointment"));
                    labeldoc.setText(rs.getString("Doctor"));
                    labeldocspc.setText(rs.getString("Specialization"));
                    labelpurpose.setText(rs.getString("Purpose"));
                    labelappfee.setText(rs.getString("Appointment fee"));
                   

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
    new ViewAppointment("adt");
}

}
