/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ViewPharmacy  extends JFrame implements ActionListener{
    JButton back;
     
   

    public ViewPharmacy(String username)    {
        
        
        setBounds(450, 180, 1000, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

         
    
        
        
        //Label for Drug id
        JLabel lblDrugId = new JLabel("Drug Id");
        lblDrugId.setBounds(30, 50, 150, 25);
        add(lblDrugId);

        //Label for Drug id by system reads
        JLabel labelDrugId = new JLabel();
        labelDrugId.setBounds(220, 50, 150, 25);
        add(labelDrugId);
        
       

        //Label for Drug name
        JLabel lblDrugName = new JLabel("Drug Name");
        lblDrugName.setBounds(30, 110, 150, 25);
        add(lblDrugName);

        //Label for Drug name by system reads
        JLabel labelDrugName = new JLabel();
        labelDrugName.setBounds(220, 110, 150, 25);
        add(labelDrugName);
        
        
          //Label for Category
        JLabel lblCategory = new JLabel("Category");
        lblCategory.setBounds(30, 170, 150, 25);
        add(lblCategory);

        //Label for Category by system reads
        JLabel labelCategory = new JLabel();
        labelCategory.setBounds(220, 170, 150, 25);
        add(labelCategory);

        
        
         //Label for Dosage
        JLabel lblDosage = new JLabel("Dosage");
        lblDosage.setBounds(30, 230, 150, 25);
        add(lblDosage);

        //Label for Dosage by system reads
        JLabel labelDosage = new JLabel();
        labelDosage.setBounds(220, 230, 150, 25);
        add(labelDosage);
        
        
         //Label for Price
        JLabel lblPrice = new JLabel("Price");
        lblPrice.setBounds(30, 290, 150, 25);
        add(lblPrice);

        //Label for Price by system reads
        JLabel labelPrice = new JLabel();
        labelPrice.setBounds(220, 290, 150, 25);
        add(labelPrice);
        
        
        
        //Label for Stock
        JLabel lblStock = new JLabel("Stock");
        lblStock.setBounds(30, 350, 150, 25);
        add(lblStock);

        //Label Stock by system reads
        JLabel labelStock = new JLabel();
        labelStock.setBounds(220, 350, 150, 25);
        add(labelStock);
        
         
                
        
            

        //Add Back Button
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350, 500, 100, 25);
        back.addActionListener(this);
        add(back);
        
        


     
        
                try {
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"' ";
            ResultSet rs = c.s.executeQuery(query);

                while(rs.next())    {
                    labelDrugId.setText(rs.getString("Drug Id"));
                    labelDrugName.setText(rs.getString("Drug Name"));
                    labelCategory.setText(rs.getString("Category"));
                    labelDosage.setText(rs.getString("Dosage"));
                    labelPrice.setText(rs.getString("Price"));
                    labelStock.setText(rs.getString("Stock"));
                    

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
        new ViewPharmacy("adt");
}
}
