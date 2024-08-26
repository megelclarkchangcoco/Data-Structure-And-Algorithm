package Gui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Font;
import java.util.Locale;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class HistoryPanel extends JPanel {
	
	 private ImageIcon googleIcon = new ImageIcon(
		        new ImageIcon("C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\chrome.png")
		            .getImage().getScaledInstance(57, 52, Image.SCALE_DEFAULT));
	 
	 private ImageIcon historyIcon = new ImageIcon(
		        new ImageIcon("C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\clock.png")
		            .getImage().getScaledInstance(35, 23, Image.SCALE_DEFAULT));
	 private ImageIcon tabIcon = new ImageIcon(
		        new ImageIcon("C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\gadget.png")
		            .getImage().getScaledInstance(35, 23, Image.SCALE_DEFAULT));
	 private ImageIcon trashIcon = new ImageIcon(
		        new ImageIcon("C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\trash-bin.png")
		            .getImage().getScaledInstance(35, 23, Image.SCALE_DEFAULT));
	 
	 private ImageIcon listIcon = new ImageIcon(
		        new ImageIcon("C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\list.png")
		            .getImage().getScaledInstance(33, 31, Image.SCALE_DEFAULT));
	 private ImageIcon groupIcon = new ImageIcon(
		        new ImageIcon("C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Imga\\usb-cable.png")
		            .getImage().getScaledInstance(33, 31, Image.SCALE_DEFAULT));

    private static final long serialVersionUID = 1L;
    private JTable table;
    private DefaultTableModel tableModel;
    private JLabel date;
    private JButton deleteBtn;

    // Store the data in a data structure (e.g., ArrayList)
    private Queue<String> historyData = new LinkedList<>();

 // Create a date formatter with the desired date, month, and time format
    SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd MMMM HH:mm:ss", new Locale("en", "US"));

    // Get the current date and time
    Date currentDateTime = new Date();

    // Format the current date and time as a string
    String formattedDateTime = dateTimeFormat.format(currentDateTime);
    private JTextField textField;
    
    /**
     * Create the panel.
     */
    public HistoryPanel() {
        setBackground(new Color(255, 255, 255));
        setBounds(0, 82, 1173, 629);
        setLayout(null);

        JPanel historyBodyPanel = new JPanel();
        historyBodyPanel.setBackground(new Color(255, 255, 255));
        historyBodyPanel.setBounds(0, 10, 1173, 701);
        add(historyBodyPanel);
        historyBodyPanel.setLayout(null);

        JPanel historytab1lbl = new JPanel();
        historytab1lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadHistoryDataIntoTable();
                historytab1lbl.setBackground(new Color(137, 207, 240));
            }
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		historytab1lbl.setBackground(new Color(211, 211, 211));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		historytab1lbl.setBackground(new Color(255, 255, 255));
        		
        	}
        });
        historytab1lbl.setBackground(new Color(255, 255, 255));
        historytab1lbl.setBounds(0, 118, 215, 43);
        historyBodyPanel.add(historytab1lbl);
        historytab1lbl.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(historyIcon);
        lblNewLabel.setBounds(10, 10, 35, 23);
        historytab1lbl.add(lblNewLabel);
        
        JLabel lblNewLabel_3 = new JLabel("Chrome history");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(68, 15, 105, 18);
        historytab1lbl.add(lblNewLabel_3);

        JPanel Historypanel = new JPanel();
        Historypanel.setBackground(new Color(255, 255, 255));
        Historypanel.setBounds(296, 128, 855, 563);
        historyBodyPanel.add(Historypanel);
        Historypanel.setLayout(null);

        

     // Create a JTable and DefaultTableModel
        tableModel = new DefaultTableModel(new Object[][] {}, new String[] { "Time", "Browser" });
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 50, 835, 481);
        Historypanel.add(scrollPane);

        deleteBtn = new JButton("Delete");
        deleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteSelectedRows();
            }
        });
        deleteBtn.setBounds(760, 10, 85, 21);
        Historypanel.add(deleteBtn);
        
        JLabel today1lbl = new JLabel("Today -");
        today1lbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
        today1lbl.setBounds(25, 14, 61, 26);
        Historypanel.add(today1lbl);
        
     // Create the label with the formatted date and time
        JLabel today1lbl_1 = new JLabel(formattedDateTime);
        today1lbl_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        today1lbl_1.setBounds(83, 14, 200, 26); // Adjust the width to accommodate the formatted date and time
        Historypanel.add(today1lbl_1);
        
        JLabel googleIconlbl = new JLabel("");
        googleIconlbl.setIcon(googleIcon);
        googleIconlbl.setBounds(10, 10, 57, 52);
        historyBodyPanel.add(googleIconlbl);
        
        JLabel historylbl = new JLabel("History");
        historylbl.setFont(new Font("Tahoma", Font.BOLD, 17));
        historylbl.setBounds(90, 30, 82, 32);
        historyBodyPanel.add(historylbl);
        
        JPanel historytab2lbl = new JPanel();
        historytab2lbl.setBackground(new Color(255, 255, 255));
        historytab2lbl.setBounds(0, 159, 215, 43);
        historyBodyPanel.add(historytab2lbl);
        historytab2lbl.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(tabIcon);
        lblNewLabel_1.setBounds(10, 10, 35, 23);
        historytab2lbl.add(lblNewLabel_1);
        
        JLabel lblNewLabel_3_1 = new JLabel("Tabs from other devices");
        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_3_1.setBounds(55, 15, 150, 18);
        historytab2lbl.add(lblNewLabel_3_1);
        
        JPanel historytab3lbl = new JPanel();
        historytab3lbl.setBackground(new Color(255, 255, 255));
        historytab3lbl.setBounds(0, 200, 215, 43);
        historyBodyPanel.add(historytab3lbl);
        historytab3lbl.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(trashIcon);
        lblNewLabel_2.setBounds(10, 10, 35, 23);
        historytab3lbl.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3_2 = new JLabel("Clear browsing data");
        lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_3_2.setBounds(68, 15, 122, 18);
        historytab3lbl.add(lblNewLabel_3_2);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(296, 110, 855, 8);
        historyBodyPanel.add(separator);
        
        JLabel listlbl = new JLabel("");
        listlbl.setIcon(listIcon);
        listlbl.setBounds(299, 79, 33, 31);
        historyBodyPanel.add(listlbl);
        
        JLabel lblNewLabel_5 = new JLabel("By date");
        lblNewLabel_5.setBounds(336, 88, 57, 19);
        historyBodyPanel.add(lblNewLabel_5);
        
        JLabel grouplbl = new JLabel("");
        grouplbl.setIcon(groupIcon);
        grouplbl.setBounds(407, 79, 33, 31);
        historyBodyPanel.add(grouplbl);
        
        JLabel lblNewLabel_5_1 = new JLabel("By group");
        lblNewLabel_5_1.setBounds(444, 88, 57, 19);
        historyBodyPanel.add(lblNewLabel_5_1);
        
     // Create a custom JTextField with rounded style
     	RoundedTextField textField = new RoundedTextField();
     	textField.setText("Search History");
        textField.setBounds(338, 30, 592, 32);
        textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().equals("")) {
					textField.setForeground(new Color(96, 96, 96));
					textField.setText("Search History");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (textField.getText().equals("Search History")) {
					textField.setForeground(Color.BLACK);
					textField.setText("");
				}
			}
		});
        historyBodyPanel.add(textField);
        textField.setColumns(10);
    }

    // Method to load history data from the text file into the table and the data structure
    private void loadHistoryDataIntoTable() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Gui\\history.txt"));
            String line;
            historyData.clear(); // Clear existing data
            tableModel.setRowCount(0); // Clear existing table data

            while ((line = reader.readLine()) != null) {
                String[] dataParts = line.split("\t");
                if (dataParts.length == 2) {
                    String time = dataParts[0];
                    String browser = dataParts[1];
                    historyData.offer(time + "\t" + browser); // Add data to the historyData queue
                    tableModel.addRow(new Object[]{time, browser}); // Add data to the table model
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteSelectedRows() {
        int[] selectedRows = table.getSelectedRows();

        // Load history data from the file
        loadHistoryDataIntoTable();

        for (int i = selectedRows.length - 1; i >= 0; i--) {
            int modelRow = table.convertRowIndexToModel(selectedRows[i]);
            String rowData = (String) tableModel.getValueAt(modelRow, 1);
            tableModel.removeRow(modelRow);

            // Remove the deleted data from the historyData queue
            historyData.remove();
        }

        // Save the updated data to the text file
        try {
            FileWriter writer = new FileWriter("C:\\Users\\MOMSIE BETSKIE\\eclipse-workspace\\WebBrowser\\src\\Gui\\history.txt");
            for (String data : historyData) {
                writer.write(data + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
