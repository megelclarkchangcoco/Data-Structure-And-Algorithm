package Gui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class twitterPanel extends JPanel {
	
	private ImageIcon xIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\twitter (1).png")
					.getImage().getScaledInstance(452, 328, Image.SCALE_DEFAULT));
	private ImageIcon google = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\Chrome.png")
					.getImage().getScaledInstance(45, 32, Image.SCALE_DEFAULT));
	private ImageIcon apple = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\apple-logo.png")
					.getImage().getScaledInstance(45, 32, Image.SCALE_DEFAULT));

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public twitterPanel() {
		setBackground(new Color(255, 255, 255));
        setBounds(0, 82, 1173, 629);
        setLayout(null);
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(255, 255, 255));
        panel1.setBounds(0, 0, 1173, 711);
        add(panel1);
        panel1.setLayout(null);
        
        JLabel xLbl = new JLabel("");
        xLbl.setBounds(72, 134, 452, 358);
        xLbl.setIcon(xIcon);
        panel1.add(xLbl);
        
        JLabel lblNewLabel = new JLabel("Happening now");
        lblNewLabel.setBounds(681, 37, 452, 83);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 55));
        panel1.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Join today.");
        lblNewLabel_1.setBounds(681, 167, 218, 51);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
        panel1.add(lblNewLabel_1);
        
        JPanel panel = new JPanel();
        panel.setBounds(703, 279, 320, 51);
        panel.setBackground(new Color(255, 255, 255));
        panel1.add(panel);
        panel.setLayout(null);
        
        JLabel g1lbl = new JLabel("");
        g1lbl.setIcon(google);
        g1lbl.setBounds(38, 10, 45, 32);
        panel.add(g1lbl);
        
        JLabel gtextlbl = new JLabel("Sign up with google");
        gtextlbl.setBounds(93, 10, 174, 32);
        panel.add(gtextlbl);
        gtextlbl.setForeground(new Color(192, 192, 192));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(703, 340, 320, 51);
        panel_1.setBackground(new Color(255, 255, 255));
        panel1.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel a1lbl = new JLabel("");
        a1lbl.setIcon(apple);
        a1lbl.setBounds(29, 10, 45, 32);
        panel_1.add(a1lbl);
        
        JLabel atextlbl = new JLabel("Sign up with Apple");
        atextlbl.setBounds(97, 10, 161, 32);
        panel_1.add(atextlbl);
        
        RoundedTextField panel_2 = new RoundedTextField();
        panel_2.setBackground(new Color(96, 175, 255));
        panel_2.setBounds(703, 419, 320, 41);
        panel1.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Create Account");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2.setBounds(95, 10, 170, 21);
        panel_2.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Already have an account?");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_3.setBounds(703, 527, 265, 26);
        panel1.add(lblNewLabel_3);
        
        RoundedTextField panel_3 = new RoundedTextField();
        panel_3.setBackground(new Color(255, 255, 255));
        panel_3.setBounds(703, 581, 331, 41);
        panel1.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel_4 = new JLabel("Sign in");
        lblNewLabel_4.setForeground(new Color(96, 175, 255));
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_4.setBounds(129, 10, 109, 21);
        panel_3.add(lblNewLabel_4);

	}
}
