
package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class AddPharmacy extends JFrame {
    
     JTextField tfDrugId, tfDrugName, tfCategory, tfDosage, tfPrice, tfStock;
    JButton create, back;

    AddPharmacy() {
        setSize(1000, 800);
        setLocation(380, 25);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("ADD PHAMACY");
        text.setBounds(560, 20, 400, 45);
        text.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
        text.setForeground(Color.BLUE); // To change the text color to blue (you can choose any color)
        text.setHorizontalAlignment(JLabel.CENTER); // To center the text horizontally
        text.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK)); // To add an underline effect
        add(text);

        // Create a panel for the form elements
        JPanel panel = new JPanel();
        panel.setBackground(new Color(131, 193, 233));
        panel.setBounds(500, 0, 500, 800);
        panel.setLayout(null);
        add(panel);

        // Label for Drug ID
        JLabel lblDrugId = new JLabel("Drug ID");
        lblDrugId.setBounds(60, 90, 150, 25);
        lblDrugId.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        panel.add(lblDrugId);

        // TextField for Drug ID
        tfDrugId = new JTextField();
        tfDrugId.setBounds(60, 120, 300, 30);
        tfDrugId.setBorder(BorderFactory.createEmptyBorder());
        panel.add(tfDrugId);

        // Label for Drug Name
        JLabel lblDrugName = new JLabel("Drug Name");
        lblDrugName.setBounds(60, 150, 150, 25);
        lblDrugName.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        panel.add(lblDrugName);

        // TextField for Drug Name
        tfDrugName = new JTextField();
        tfDrugName.setBounds(60, 180, 300, 30);
        tfDrugName.setBorder(BorderFactory.createEmptyBorder());
        panel.add(tfDrugName);

        // Label for Category
        JLabel lblCategory = new JLabel("Category");
        lblCategory.setBounds(60, 210, 150, 25);
        lblCategory.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        panel.add(lblCategory);

        // TextField for Category
        tfCategory = new JTextField();
        tfCategory.setBounds(60, 240, 300, 30);
        tfCategory.setBorder(BorderFactory.createEmptyBorder());
        panel.add(tfCategory);

        // Label for Dosage
        JLabel lblDosage = new JLabel("Dosage");
        lblDosage.setBounds(60, 270, 150, 25);
        lblDosage.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        panel.add(lblDosage);

        // TextField for Dosage
        tfDosage = new JTextField();
        tfDosage.setBounds(60, 300, 300, 30);
        tfDosage.setBorder(BorderFactory.createEmptyBorder());
        panel.add(tfDosage);

        // Label for Price
        JLabel lblPrice = new JLabel("Price");
        lblPrice.setBounds(60, 330, 150, 25);
        lblPrice.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        panel.add(lblPrice);

        // TextField for Price
        tfPrice = new JTextField();
        tfPrice.setBounds(60, 360, 300, 30);
        tfPrice.setBorder(BorderFactory.createEmptyBorder());
        panel.add(tfPrice);

        // Label for Stock
        JLabel lblStock = new JLabel("Stock");
        lblStock.setBounds(60, 390, 150, 25);
        lblStock.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        panel.add(lblStock);

        // TextField for Stock
        tfStock = new JTextField();
        tfStock.setBounds(60, 420, 300, 30);
        tfStock.setBorder(BorderFactory.createEmptyBorder());
        panel.add(tfStock);

        // Insert button
        create = new JButton("Create");
        create.setBounds(80, 480, 100, 30);
        create.setBackground(new Color(102, 102, 255));
        create.setForeground(Color.WHITE);
        panel.add(create);

        // Back Button
        back = new JButton("Back");
        back.setBounds(250, 480, 100, 30);
        back.setBackground(new Color(102, 102, 255));
        back.setForeground(Color.WHITE);
        panel.add(back);
        
        
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
    new AddPharmacy();
}
}
