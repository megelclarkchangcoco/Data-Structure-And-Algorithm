package Gui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class messengerPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private ImageIcon messlogo = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\messLogo.png")
					.getImage().getScaledInstance(60, 45, Image.SCALE_DEFAULT));
	private ImageIcon messSlogan = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\messSlogan.png")
					.getImage().getScaledInstance(403, 301, Image.SCALE_DEFAULT));
	private ImageIcon messChat = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\messChat.png")
					.getImage().getScaledInstance(403, 431, Image.SCALE_DEFAULT));

	/**
	 * Create the panel.
	 */
	public messengerPanel() {
		setBackground(new Color(255, 255, 255));
        setBounds(0, 82, 1173, 629);
        setLayout(null);
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(255, 255, 255));
        panel1.setBounds(0, 0, 1173, 711);
        add(panel1);
        panel1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Features");
        lblNewLabel.setBounds(653, 22, 376, 29);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel1.add(lblNewLabel);
        
        JLabel lblDesktopApp = new JLabel("Desktop app");
        lblDesktopApp.setBounds(764, 22, 265, 29);
        lblDesktopApp.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel1.add(lblDesktopApp);
        
        JLabel lblPrivacySafety = new JLabel("Privacy & Safety");
        lblPrivacySafety.setBounds(892, 22, 137, 29);
        lblPrivacySafety.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel1.add(lblPrivacySafety);
        
        JLabel lblForDeveloper = new JLabel("For Developer");
        lblForDeveloper.setBounds(1039, 22, 124, 29);
        lblForDeveloper.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel1.add(lblForDeveloper);
        
        JLabel messlogolbl = new JLabel("");
        messlogolbl.setBounds(21, 22, 60, 45);
        messlogolbl.setIcon(messlogo);
        panel1.add(messlogolbl);
        
        JLabel sloganlbl = new JLabel("");
        sloganlbl.setIcon(messSlogan);
        sloganlbl.setBounds(21, 117, 403, 301);
        panel1.add(sloganlbl);
        
        JLabel chatlbl = new JLabel("");
        chatlbl.setIcon(messChat);
        chatlbl.setBounds(688, 156, 403, 431);
        panel1.add(chatlbl);
        
        JLabel lblNewLabel_1 = new JLabel("Messenger makes it easy and fun to stay close to your");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setBounds(36, 425, 422, 29);
        panel1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("favorite people.");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1_1.setBounds(36, 452, 303, 29);
        panel1.add(lblNewLabel_1_1);
        
        RoundedTextField panel = new RoundedTextField();
        panel.setBackground(new Color(96, 175, 255));
        panel.setBounds(51, 515, 331, 45);
        panel1.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Contine as NU Bulldogs");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2.setBounds(63, 10, 247, 25);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Switch Account");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_3.setForeground(new Color(96, 175, 255));
        lblNewLabel_3.setBounds(50, 574, 104, 13);
        panel1.add(lblNewLabel_3);
        
	}

}
