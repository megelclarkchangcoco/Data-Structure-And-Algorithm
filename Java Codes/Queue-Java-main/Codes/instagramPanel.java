package Gui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;

public class instagramPanel extends JPanel {
	
	private ImageIcon instagramPhoneicon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\instagramPhone.png")
					.getImage().getScaledInstance(427, 595, Image.SCALE_DEFAULT));
	private ImageIcon instagramLogo = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\instagramlogoname.png")
					.getImage().getScaledInstance(258, 45, Image.SCALE_DEFAULT));
	private ImageIcon facebookIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\facebook.png")
					.getImage().getScaledInstance(37, 36, Image.SCALE_DEFAULT));
	private ImageIcon microsoft = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\micro.png")
					.getImage().getScaledInstance(105, 52, Image.SCALE_DEFAULT));
	private ImageIcon play = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\play.png")
					.getImage().getScaledInstance(143, 52, Image.SCALE_DEFAULT));

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public instagramPanel() {
		setBackground(new Color(255, 255, 255));
        setBounds(0, 82, 1173, 629);
        setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 0, 1173, 711);
        add(panel);
        panel.setLayout(null);
        
        JLabel phonelogoLbl = new JLabel("");
        phonelogoLbl.setIcon(instagramPhoneicon);
        phonelogoLbl.setBounds(184, 29, 427, 595);
        panel.add(phonelogoLbl);
        
        JPanel panel_1 = new JPanel();
        panel_1.setForeground(new Color(128, 128, 128));
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBorder(new LineBorder(new Color(240, 240, 240), 2));
        panel_1.setBounds(666, 31, 427, 408);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel instagramLogolbl = new JLabel("");
        instagramLogolbl.setIcon(instagramLogo);
        instagramLogolbl.setBounds(90, 10, 258, 45);
        panel_1.add(instagramLogolbl);
        
        textField = new JTextField();
        textField.setBackground(new Color(255, 255, 255));
        textField.setBounds(72, 81, 291, 36);
        panel_1.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(72, 127, 291, 36);
        panel_1.add(textField_1);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(96, 175, 255));
        panel_3.setBounds(72, 191, 291, 36);
        panel_1.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Log in");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(103, 0, 131, 36);
        panel_3.add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("OR");
        lblNewLabel.setForeground(new Color(128, 128, 128));
        lblNewLabel.setBackground(new Color(192, 192, 192));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel.setBounds(207, 248, 32, 26);
        panel_1.add(lblNewLabel);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(72, 259, 114, 2);
        panel_1.add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(249, 259, 114, 2);
        panel_1.add(separator_1);
        
        JLabel facebookIconLbl = new JLabel("");
        facebookIconLbl.setIcon(facebookIcon);
        facebookIconLbl.setBounds(102, 286, 37, 36);
        panel_1.add(facebookIconLbl);
        
        JLabel lblNewLabel_1_1 = new JLabel("Log in with Facebook ");
        lblNewLabel_1_1.setForeground(new Color(96, 175, 255));
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1_1.setBounds(149, 284, 199, 36);
        panel_1.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Forgot Password?");
        lblNewLabel_1_1_1.setForeground(new Color(96, 175, 255));
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_1_1.setBounds(172, 332, 139, 36);
        panel_1.add(lblNewLabel_1_1_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setForeground(new Color(128, 128, 128));
        panel_2.setBorder(new LineBorder(new Color(240, 240, 240), 2));
        panel_2.setBackground(new Color(255, 255, 255));
        panel_2.setBounds(666, 449, 419, 52);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1_1_2 = new JLabel("Don't have an account?");
        lblNewLabel_1_1_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1_1_2.setBounds(74, 10, 184, 36);
        panel_2.add(lblNewLabel_1_1_2);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("Sign Up");
        lblNewLabel_1_1_1_1.setForeground(new Color(96, 175, 255));
        lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1_1_1_1.setBounds(257, 10, 130, 36);
        panel_2.add(lblNewLabel_1_1_1_1);
        
        JLabel lblNewLabel_1_1_1_2 = new JLabel("Get the app");
        lblNewLabel_1_1_1_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_1_1_2.setBounds(828, 511, 117, 36);
        panel.add(lblNewLabel_1_1_1_2);
        
        JLabel googleplayLbl = new JLabel("");
        googleplayLbl.setIcon(play);
        googleplayLbl.setBounds(718, 557, 143, 52);
        panel.add(googleplayLbl);
        
        JLabel microsoftLbl = new JLabel("");
        microsoftLbl.setIcon(microsoft);
        microsoftLbl.setBounds(861, 557, 105, 52);
        panel.add(microsoftLbl);

	}

}
