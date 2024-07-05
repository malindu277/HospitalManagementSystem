package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class UpdatePharmacy extends JFrame {
    
    JTextField tfDrugId, tfDrugName, tfCategory, tfDosage, tfPrice, tfStock;
    JButton updateButton, backButton;

    UpdatePharmacy(String username) {
        // Window frame
        setSize(1000, 800);
        setLocation(380, 25);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("UPDATE DRUG DETAILS");
        text.setBounds(560, 20, 400, 45);
        text.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
        text.setForeground(Color.BLUE);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        add(text);

        // Panel for login image & blue part
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(500, 0, 500, 800);
        p1.setLayout(null);
        add(p1);

        // Panel for drug update
        /*JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 481, 389);
        add(p2);*/

        // Label for Drug ID
        JLabel lblDrugId = new JLabel("Drug ID");
        lblDrugId.setBounds(60, 90, 100, 25);
        lblDrugId.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p1.add(lblDrugId);

        // TextField for Drug ID
        tfDrugId = new JTextField();
        tfDrugId.setBounds(60, 130, 300, 30);
        tfDrugId.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfDrugId);

        // Label for Drug Name
        JLabel lblDrugName = new JLabel("Drug Name");
        lblDrugName.setBounds(60, 170, 100, 25);
        lblDrugName.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p1.add(lblDrugName);

        // TextField for Drug Name
        tfDrugName = new JTextField();
        tfDrugName.setBounds(60, 210, 300, 30);
        tfDrugName.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfDrugName);

        // Label for Category
        JLabel lblCategory = new JLabel("Category");
        lblCategory.setBounds(60, 250, 100, 25);
        lblCategory.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p1.add(lblCategory);

        // TextField for Category
        tfCategory = new JTextField();
        tfCategory.setBounds(60, 290, 300, 30);
        tfCategory.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfCategory);

        // Label for Dosage
        JLabel lblDosage = new JLabel("Dosage");
        lblDosage.setBounds(60, 330, 100, 25);
        lblDosage.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p1.add(lblDosage);

        // TextField for Dosage
        tfDosage = new JTextField();
        tfDosage.setBounds(60, 370, 300, 30);
        tfDosage.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfDosage);

        // Label for Price
        JLabel lblPrice = new JLabel("Price");
        lblPrice.setBounds(60, 410, 100, 25);
        lblPrice.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p1.add(lblPrice);

        // TextField for Price
        tfPrice = new JTextField();
        tfPrice.setBounds(60, 450, 300, 30);
        tfPrice.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfPrice);

        // Label for Stock
        JLabel lblStock = new JLabel("Stock");
        lblStock.setBounds(60, 490, 100, 25);
        lblStock.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p1.add(lblStock);

        // TextField for Stock
        tfStock = new JTextField();
        tfStock.setBounds(60, 530, 300, 30);
        tfStock.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfStock);

        // Update button
        updateButton = new JButton("Update");
        updateButton.setBackground(Color.BLACK);
        updateButton.setForeground(Color.WHITE);
        updateButton.setBounds(80, 590, 100, 30);
        p1.add(updateButton);

        // Back Button
        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(250, 590, 100, 30);
        p1.add(backButton);

        // Add image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images OOP/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(600,600, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(30, 100, 450, 450);
            add(image);

        setVisible(true);
    }

    public static void main(String args[]) {
        new UpdatePharmacy("adt");
    }
    
}
