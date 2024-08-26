package Gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class GoogleBodyFrame extends JPanel {
    
    private ImageIcon googleIcon = new ImageIcon(
        new ImageIcon("C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\googleName1.png")
            .getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT));
    private ImageIcon header = new ImageIcon(
            new ImageIcon("C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\profile.png")
                .getImage().getScaledInstance(48, 40, Image.SCALE_DEFAULT));
    
    private static final long serialVersionUID = 1L;
    private JTextField textField;
    
    /**
     * Create the panel.
     */
    public GoogleBodyFrame() {
        setBackground(new Color(255, 255, 255));
        setBounds(0, 82, 1173, 629);
        setLayout(null);
        
        JPanel googleBodyPanel = new JPanel();
        googleBodyPanel.setBackground(new Color(255, 255, 255));
        googleBodyPanel.setBounds(0, 10, 1173, 701);
        add(googleBodyPanel);
        googleBodyPanel.setLayout(null);
        
        JLabel googleiconLbl = new JLabel("");
        googleiconLbl.setIcon(googleIcon);
        googleiconLbl.setBounds(297, 117, 579, 181);
        googleBodyPanel.add(googleiconLbl);
        
        textField = new RoundedTextField();
        textField.setText("Search Google or Type a URL");
        textField.setText("Search Google or Type a URL");
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().equals("")) {
					textField.setForeground(new Color(96, 96, 96));
					textField.setText("Search Google or Type a URL");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (textField.getText().equals("Search Google or Type a URL")) {
					textField.setForeground(Color.BLACK);
					textField.setText("");
				}
			}
		});
        textField.setBounds(264, 271, 671, 40);
        googleBodyPanel.add(textField);
        textField.setColumns(10);
        
        JLabel gmailtextlbl = new JLabel("Gmail");
        gmailtextlbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
        gmailtextlbl.setBounds(957, 25, 49, 20);
        googleBodyPanel.add(gmailtextlbl);
        
        JLabel mgalarawantextlbl = new JLabel("Mga Larawan");
        mgalarawantextlbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
        mgalarawantextlbl.setBounds(1027, 25, 78, 20);
        googleBodyPanel.add(mgalarawantextlbl);
        
        JLabel iconLbl = new JLabel("");
        iconLbl.setIcon(header);
        iconLbl.setBounds(1115, 15, 48, 40);
        googleBodyPanel.add(iconLbl);
        
        JLabel googleofferedlbl = new JLabel("Google offered in :");
        googleofferedlbl.setBounds(467, 321, 111, 13);
        googleBodyPanel.add(googleofferedlbl);
        
        JLabel lblEnglishTagalog = new JLabel("English Tagalog");
        lblEnglishTagalog.setForeground(new Color(0, 0, 255));
        lblEnglishTagalog.setBackground(new Color(0, 0, 255));
        lblEnglishTagalog.setBounds(574, 321, 92, 13);
        googleBodyPanel.add(lblEnglishTagalog);
        
        JLabel lblNewLabel = new JLabel("Philippines");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setBounds(10, 555, 128, 28);
        googleBodyPanel.add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 582, 1173, 34);
        googleBodyPanel.add(panel);
        panel.setLayout(null);
        
        JLabel lblAboutThis = new JLabel("About this");
        lblAboutThis.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblAboutThis.setBounds(10, 0, 128, 28);
        panel.add(lblAboutThis);
        
        JLabel lblAdvertising = new JLabel("Advertising");
        lblAdvertising.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblAdvertising.setBounds(90, 0, 128, 28);
        panel.add(lblAdvertising);
        
        JLabel lblBusiness = new JLabel("Business");
        lblBusiness.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblBusiness.setBounds(176, 0, 128, 28);
        panel.add(lblBusiness);
        
        JLabel lblHowSearchWorl = new JLabel("How Search Works");
        lblHowSearchWorl.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblHowSearchWorl.setBounds(253, 0, 128, 28);
        panel.add(lblHowSearchWorl);
        
        JLabel lblPrivacy = new JLabel("Privacy");
        lblPrivacy.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblPrivacy.setBounds(939, 0, 128, 28);
        panel.add(lblPrivacy);
        
        JLabel lblTerms = new JLabel("Terms");
        lblTerms.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTerms.setBounds(1013, 0, 128, 28);
        panel.add(lblTerms);
        
        JLabel lblSettings = new JLabel("Settings");
        lblSettings.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblSettings.setBounds(1093, 0, 128, 28);
        panel.add(lblSettings);
        
        // Add a KeyAdapter to the JTextField to listen for Enter key press
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                    // Get the text from the JTextField
                    String userInput = textField.getText();
                    if (!userInput.isEmpty()) {
                        // Save the text to a file
                        saveTextToFile(userInput);
                    }
                }
            }
        });
    }
    
    private void saveTextToFile(String text) {
        try {
            // Define the path to your text file
            String filePath = "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\path_to_your_text_file.txt";
            
            // Create a FileWriter to write to the file
            FileWriter writer = new FileWriter(filePath);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
