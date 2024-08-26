package Gui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class facebookPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public facebookPanel() {
		setBackground(new Color(255, 255, 255));
        setBounds(0, 82, 1173, 629);
        setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(245, 245, 245));
        panel.setBounds(0, 0, 1173, 711);
        add(panel);
        panel.setLayout(null);
        
        JLabel facebookLbl = new JLabel("facebook");
        facebookLbl.setForeground(new Color(0, 128, 255));
        facebookLbl.setBackground(new Color(0, 128, 255));
        facebookLbl.setFont(new Font("Constantia", Font.BOLD, 60));
        facebookLbl.setBounds(84, 121, 287, 75);
        panel.add(facebookLbl);
        
        JLabel lblNewLabel = new JLabel("Connect with friends and the world");
        lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 30));
        lblNewLabel.setBounds(84, 181, 566, 38);
        panel.add(lblNewLabel);
        
        JLabel lblAroundYouOn = new JLabel("around you on Facebook.");
        lblAroundYouOn.setFont(new Font("Constantia", Font.BOLD, 30));
        lblAroundYouOn.setBounds(84, 217, 566, 30);
        panel.add(lblAroundYouOn);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(665, 101, 470, 372);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 15));
        textField.setForeground(new Color(211, 211, 211));
        textField.setBounds(33, 25, 401, 53);
        textField.setText("Email or phone number ");
        textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().equals("")) {
					textField.setForeground(new Color(96, 96, 96));
					textField.setText("Email or phone number");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (textField.getText().equals("Email or phone number")) {
					textField.setForeground(Color.BLACK);
					textField.setText("");
				}
			}
		});
        panel_1.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        textField_1.setForeground(new Color(211, 211, 211));
        textField_1.setText("Password");
        textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textField_1.getText().equals("")) {
					textField_1.setForeground(new Color(96, 96, 96));
					textField_1.setText("Password");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (textField_1.getText().equals("Password")) {
					textField_1.setForeground(Color.BLACK);
					textField_1.setText("");
				}
			}
		});
        textField_1.setColumns(10);
        textField_1.setBounds(33, 99, 401, 53);
        panel_1.add(textField_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(0, 128, 255));
        panel_2.setBounds(33, 188, 401, 53);
        panel_1.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_4 = new JLabel("Log In");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNewLabel_4.setBounds(158, 10, 120, 33);
        panel_2.add(lblNewLabel_4);
        
        JLabel lblNewLabel_1 = new JLabel("Forgot Password?");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setForeground(new Color(0, 128, 255));
        lblNewLabel_1.setBounds(185, 262, 124, 24);
        panel_1.add(lblNewLabel_1);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(48, 302, 386, 2);
        panel_1.add(separator);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 255, 0));
        panel_3.setBounds(132, 314, 227, 42);
        panel_1.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel_4_1 = new JLabel("Create new account.");
        lblNewLabel_4_1.setForeground(Color.WHITE);
        lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_4_1.setBounds(25, 10, 176, 22);
        panel_3.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_2 = new JLabel("Create a Page");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_2.setBounds(721, 501, 145, 30);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("for a celebrity, brand or business.");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_3.setBounds(865, 509, 298, 20);
        panel.add(lblNewLabel_3);

	}
}
