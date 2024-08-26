package Gui;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GoogleFrame extends JFrame {
	
	private ImageIcon googleIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\Chrome.png")
					.getImage().getScaledInstance(90, 60, Image.SCALE_DEFAULT));
	private ImageIcon googleIcon3 = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\Chrome.png")
					.getImage().getScaledInstance(35, 33, Image.SCALE_DEFAULT));
	
	// for icon website 
	private ImageIcon facebookIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\facebook.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	
	private ImageIcon instagramIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\instagram.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon chatgpt = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\chatgpt-icon.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon twitterIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\twitter.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon messengerIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\messenger.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	
	// for search bar design
	private ImageIcon leftIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\left-arrow.png")
					.getImage().getScaledInstance(30, 23, Image.SCALE_DEFAULT));
	private ImageIcon rigthIcons = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\right-arrow.png")
					.getImage().getScaledInstance(30, 23, Image.SCALE_DEFAULT));
	private ImageIcon refreshIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\refresh.png")
					.getImage().getScaledInstance(30, 23, Image.SCALE_DEFAULT));
	private ImageIcon downloadIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\download.png")
					.getImage().getScaledInstance(30, 23, Image.SCALE_DEFAULT));
	private ImageIcon musicIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\add-to-playlist.png")
					.getImage().getScaledInstance(30, 23, Image.SCALE_DEFAULT));
	private ImageIcon plusIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\plus.png")
					.getImage().getScaledInstance(35, 23, Image.SCALE_DEFAULT));
	private ImageIcon googleIcon2 = new ImageIcon(
			new ImageIcon( "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\Chrome.png")
					.getImage().getScaledInstance(35, 23, Image.SCALE_DEFAULT));
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	public static GoogleBodyFrame googlebodyframe;
	public static HistoryPanel historyPanel1;
	public static facebookPanel facebookPanel1;
	public static instagramPanel instagramPanel1;
	public static messengerPanel messengerPanel1;
	public static twitterPanel twitterPanel1;
	public static chatgptPanel chatgptPanel1;
	public static JPanel selectedPanel; // Declare a variable to hold the selected panel

	private JPanel backbuttonpanel;
	private JPanel hisotrypanel;
	private JPanel tabpanel;
	private JPanel panel;
	private JLabel webNameLbl;
	private JLabel webIconLbl;
	private JLabel label;
	private JLabel leftIconlbl;
	private JLabel rigthIconlbl;
	private JLabel refreshIconlbl;
	private JLabel musicIconlbl;
	private JLabel downloadIconLbl;
	private JLabel plusIconLbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoogleFrame frame = new GoogleFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GoogleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1187, 743);
		setTitle("Google");
		setIconImage(googleIcon.getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Create an instance PANEL CLASS 
		googlebodyframe = new GoogleBodyFrame();
		historyPanel1 = new HistoryPanel();
		facebookPanel1 = new facebookPanel();
		instagramPanel1 = new instagramPanel();
		messengerPanel1 = new messengerPanel();
		twitterPanel1 = new twitterPanel();
		chatgptPanel1 = new chatgptPanel();
		 // Add the panel class instance to the content pane of the Google Frame
		contentPane.add(googlebodyframe);
		contentPane.add(historyPanel1);
		contentPane.add(facebookPanel1);
		contentPane.add(instagramPanel1);
		contentPane.add(messengerPanel1);
		contentPane.add(twitterPanel1);
		contentPane.add(chatgptPanel1);
		
		//Call revalidate() and repaint() to update the frame
	    contentPane.revalidate();
	    contentPane.repaint();
	    
	 // set the bounds of the panels
	    googlebodyframe.setBounds(0, 82, 1173, 629);
	    historyPanel1.setBounds(0, 82, 1173, 629);
	    facebookPanel1.setBounds(0, 82, 1173, 629);
	    instagramPanel1.setBounds(0, 82, 1173, 629);
	    messengerPanel1.setBounds(0, 82, 1173, 629);
		twitterPanel1.setBounds(0, 82, 1173, 629);
		chatgptPanel1.setBounds(0, 82, 1173, 629);
		
		JPanel tabPanel = new JPanel();
		tabPanel.setBackground(new Color(240, 240, 240));
		tabPanel.setBounds(0, 0, 1173, 33);
		contentPane.add(tabPanel);
		tabPanel.setLayout(null);
		
		tabpanel = new JPanel();
		tabpanel.setBackground(new Color(240, 240, 240));
		tabpanel.setBounds(0, 0, 1173, 33);
		tabPanel.add(tabpanel);
		tabpanel.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(10, 0, 142, 33);
		tabpanel.add(panel);
		panel.setLayout(null);
		
		// Create a JLabel to display the user's input
		webNameLbl = new JLabel("Google");
		webNameLbl.setBounds(43, 10, 89, 13);
		panel.add(webNameLbl);
		
		// create a JLavel to Display the Icon's
		webIconLbl = new JLabel("");
		webIconLbl.setIcon(googleIcon2);
		webIconLbl.setBounds(0, 0, 35, 33);
		panel.add(webIconLbl);
		
		plusIconLbl = new JLabel("");
		plusIconLbl.setIcon(plusIcon);
		plusIconLbl.setBounds(154, 10, 35, 23);
		tabpanel.add(plusIconLbl);
		
		JPanel wholeSearchPanel = new JPanel();
		wholeSearchPanel.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		wholeSearchPanel.setBackground(new Color(255, 255, 255));
		wholeSearchPanel.setBounds(0, 33, 1173, 49);
		contentPane.add(wholeSearchPanel);
		wholeSearchPanel.setLayout(null);
		
		// Create a custom JTextField with rounded style
		RoundedTextField textField = new RoundedTextField();
		textField.setBounds(159, 10, 903, 28);
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
		// Add an ActionListener to respond to user input
		textField.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	
		        // Get the text from the JTextField
		        String userInput = textField.getText();
		        String webSiteName = textField.getText();

		        if (userInput != null && !userInput.isEmpty()) {
		            // Format the input
		            String formattedInput = "www." + userInput + ".com";
		            
		            // Update the JTextField with the formatted input
		            textField.setText(formattedInput);
		            
		            // Update the webNameLbl with user's input
		            webNameLbl.setText(webSiteName);

		            if (!userInput.equalsIgnoreCase("History")) {
		                // Save user's input to a text file
		                saveTextToFile(formattedInput);
		            }
		        }

		        if (userInput.equalsIgnoreCase("History")) {
		            // Handle 'History' input
		            menuClicked(historyPanel1);
		            historyPanel1.setVisible(true);
		            googlebodyframe.setVisible(false);
		            facebookPanel1.setVisible(false);
		            instagramPanel1.setVisible(false);
		            messengerPanel1.setVisible(false);
		            twitterPanel1.setVisible(false);
		            chatgptPanel1.setVisible(false);
		            
		            webIconLbl.setIcon(googleIcon3);
			        webNameLbl.setText("Google History");
		        } else if (userInput.equalsIgnoreCase("Facebook")) {
		            // Handle 'Facebook' input
		        	menuClicked(facebookPanel1);
		            historyPanel1.setVisible(false);
		            googlebodyframe.setVisible(false);
		            facebookPanel1.setVisible(true);
		            instagramPanel1.setVisible(false);
		            messengerPanel1.setVisible(false);
		            twitterPanel1.setVisible(false);
		            chatgptPanel1.setVisible(false);
		            
		            webIconLbl.setIcon(facebookIcon);
		        } else if (userInput.equalsIgnoreCase("Twitter")) {
		            // Handle 'Twitter' input
		        	menuClicked(twitterPanel1);
		            historyPanel1.setVisible(false);
		            googlebodyframe.setVisible(false);
		            facebookPanel1.setVisible(false);
		            instagramPanel1.setVisible(false);
		            messengerPanel1.setVisible(false);
		            twitterPanel1.setVisible(true);
		            chatgptPanel1.setVisible(false);
		            
		            webIconLbl.setIcon(twitterIcon);
		        } else if (userInput.equalsIgnoreCase("Instagram")) {
		            // Handle 'Instagram' input
		        	menuClicked(instagramPanel1);
		            historyPanel1.setVisible(false);
		            googlebodyframe.setVisible(false);
		            facebookPanel1.setVisible(false);
		            instagramPanel1.setVisible(true);
		            messengerPanel1.setVisible(false);
		            twitterPanel1.setVisible(false);
		            chatgptPanel1.setVisible(false);
		          
		            webIconLbl.setIcon(instagramIcon);
		        } else if (userInput.equalsIgnoreCase("Messenger")) {
		            // Handle 'Messenger' input
		            webIconLbl.setIcon(messengerIcon);
		            menuClicked(instagramPanel1);
		            historyPanel1.setVisible(false);
		            googlebodyframe.setVisible(false);
		            facebookPanel1.setVisible(false);
		            instagramPanel1.setVisible(false);
		            messengerPanel1.setVisible(true);
		            twitterPanel1.setVisible(false);
		            chatgptPanel1.setVisible(false);
		          
		            webIconLbl.setIcon(messengerIcon);
		        } else if (userInput.equalsIgnoreCase("Chatgpt")) {
		            // Handle 'Youtube' input
		        	menuClicked(instagramPanel1);
		            historyPanel1.setVisible(false);
		            googlebodyframe.setVisible(false);
		            facebookPanel1.setVisible(false);
		            instagramPanel1.setVisible(false);
		            messengerPanel1.setVisible(false);
		            twitterPanel1.setVisible(false);
		            chatgptPanel1.setVisible(true);
		            webIconLbl.setIcon(chatgpt);
		            
		        }else if (userInput.equalsIgnoreCase("Google")) {
		        	// Handle :"Google" input
		        	menuClicked(googlebodyframe);
		            historyPanel1.setVisible(false);
		            googlebodyframe.setVisible(true);
		            facebookPanel1.setVisible(false);
		            instagramPanel1.setVisible(false);
		            messengerPanel1.setVisible(false);
		            twitterPanel1.setVisible(false);
		            chatgptPanel1.setVisible(false);
		        	
		        }
		    }
		    
		    
		});

		// Add the JTextField to the wholeSearchPanel
		wholeSearchPanel.add(textField);
		textField.setColumns(10);
		
		backbuttonpanel = new JPanel();
		backbuttonpanel.setBackground(new Color(255, 255, 255));
		backbuttonpanel.setBounds(10, 10, 146, 28);
		wholeSearchPanel.add(backbuttonpanel);
		backbuttonpanel.setLayout(null);
		
		leftIconlbl = new JLabel("");
		leftIconlbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(googlebodyframe);
				
				// Reset the text in the RoundedTextField
		        textField.setText("Search Google or Type a URL");
		        webIconLbl.setIcon(googleIcon3);
		        webNameLbl.setText("Google");
		        
			}
		});
		leftIconlbl.setIcon(leftIcon);
		leftIconlbl.setBounds(10, 0, 30, 23);
		backbuttonpanel.add(leftIconlbl);
		
		rigthIconlbl = new JLabel("");
		rigthIconlbl.setIcon(rigthIcons);
		rigthIconlbl.setBounds(57, 0, 30, 23);
		backbuttonpanel.add(rigthIconlbl);
		
		refreshIconlbl = new JLabel("");
		refreshIconlbl.setIcon(refreshIcon);
		refreshIconlbl.setBounds(116, 0, 30, 23);
		backbuttonpanel.add(refreshIconlbl);
		
		hisotrypanel = new JPanel();
		hisotrypanel.setBackground(new Color(255, 255, 255));
		hisotrypanel.setBounds(1068, 10, 95, 28);
		wholeSearchPanel.add(hisotrypanel);
		hisotrypanel.setLayout(null);
		
		musicIconlbl = new JLabel("");
		musicIconlbl.setIcon(musicIcon);
		musicIconlbl.setBounds(10, 0, 30, 23);
		hisotrypanel.add(musicIconlbl);
		
		downloadIconLbl = new JLabel("");
		downloadIconLbl.setIcon(downloadIcon);
		downloadIconLbl.setBounds(50, 0, 30, 23);
		hisotrypanel.add(downloadIconLbl);
		
		label = new JLabel("New label");
		label.setBounds(10, 10, 45, 13);
		wholeSearchPanel.add(label);
		
		JPanel bodyPanel = new JPanel();
		bodyPanel.setBackground(new Color(255, 255, 255));
		bodyPanel.setBounds(0, 82, 1173, 629);
		contentPane.add(bodyPanel);
		bodyPanel.setLayout(null);
	}
	
	private void saveTextToFile(String text) {
		try {
            // Define the path to your text file
            String filePath = "C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Gui\\history.txt";

            // Create a FileWriter to append to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

            
            // Get the current time
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            String currentTime = dateFormat.format(new Date());
            
            // Write the formatted string
            writer.write(currentTime + "\t" + text + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void menuClicked(JPanel selectedPanel){
		googlebodyframe.setVisible(false);
		historyPanel1.setVisible(false);
		facebookPanel1.setVisible(false);
		instagramPanel1.setVisible(false);
		messengerPanel1.setVisible(false);
		twitterPanel1.setVisible(false);
		chatgptPanel1.setVisible(false);
	 
	    selectedPanel.setVisible(true);
	    
	    // Set the selected panel to the variable
	    this.selectedPanel = selectedPanel;
	}
}
