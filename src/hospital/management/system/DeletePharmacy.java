
package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class DeletePharmacy extends JFrame{
    
    JTextField tfDrugId;
    JButton deleteButton, backButton;

    DeletePharmacy(String username) {
        // Window frame
        setSize(900, 500);
        setLocation(450, 150);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("DELETE DRUG");
        text.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
        text.setForeground(Color.BLUE);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setBounds(450, 20, 400, 45);
        text.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        add(text);

        // Panel for blue part
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 400, 500);
        p1.setBackground(new Color(131, 193, 233));
        p1.setLayout(null);
        add(p1);

        // Panel for drug deletion
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 481, 389);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images OOP/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(32, 60, 350, 350);
        p1.add(image);

        // Label for Drug ID
        JLabel lblDrugId = new JLabel("Drug ID");
        lblDrugId.setBounds(60, 90, 100, 25);
        lblDrugId.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        p2.add(lblDrugId);

        // TextField for Drug ID
        tfDrugId = new JTextField();
        tfDrugId.setBounds(60, 130, 300, 30);
        tfDrugId.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfDrugId);

        // Create the "Delete" button
        deleteButton = new JButton("Delete");
        deleteButton.setBounds(32, 350, 150, 30);
        p2.add(deleteButton);

        // Create the "Back to Homepage" button
        backButton = new JButton("Back to Homepage");
        backButton.setBounds(235, 350, 150, 30);
        p2.add(backButton);

        setVisible(true);
    }

    public static void main(String args[]) {
        new DeletePharmacy("adt");
    }
    
}
