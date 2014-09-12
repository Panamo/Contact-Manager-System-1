package contactList;


import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.util.ArrayList;

public class NewContactFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNumber;
	private JTextField txtNumberLabel;
	private JTextField txtNumber;
	private JTextField txtNumberLabel2;
	private JTextField txtNumber2;
	private JTextField txtLabel_3;
	private JTextField txtLabel_4;
	private JTextField txtEmail;
	private JTextField txtEmail_1;
	private JLabel lblOtherDatas;
	private JTextField txtLabel_6;
	private JTextField txtData;
	private JTextField txtLabel_7;
	private JTextField txtData_1;
	private JTextField txtLabel_2;
	private JTextField txtNumber_2;
	private JButton btnSubmit;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewContactFrame frame = new NewContactFrame();
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
	public NewContactFrame() {
		
		ArrayList<JTextField> labels = new ArrayList<>();
		ArrayList<JTextField> numbers = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 769, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First name:");
		lblNewLabel.setBounds(10, 11, 71, 32);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(91, 17, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Family:");
		lblNewLabel_1.setBounds(187, 11, 45, 32);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 17, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNumber = new JLabel("Numbers:");
		lblNumber.setBounds(10, 55, 58, 32);
		contentPane.add(lblNumber);
		
		txtNumberLabel = new JTextField();
		txtNumberLabel.setText("Label");
		txtNumberLabel.setBounds(10, 98, 58, 20);
		contentPane.add(txtNumberLabel);
		txtNumberLabel.setColumns(10);
		labels.add(txtNumberLabel);
		
		txtNumber = new JTextField();
		txtNumber.setText("Number");
		txtNumber.setBounds(106, 98, 102, 20);
		contentPane.add(txtNumber);
		txtNumber.setColumns(10);
		numbers.add(txtNumber);
		
		txtNumberLabel2 = new JTextField();
		txtNumberLabel2.setText("Label");
		txtNumberLabel2.setBounds(10, 129, 58, 20);
		contentPane.add(txtNumberLabel2);
		txtNumberLabel2.setColumns(10);
		labels.add(txtNumberLabel2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setText("Number");
		txtNumber2.setBounds(106, 129, 102, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		numbers.add(txtNumber2);
		JLabel lblEmails = new JLabel("Emails:");
		lblEmails.setBounds(233, 55, 76, 32);
		contentPane.add(lblEmails);
		
		txtLabel_3 = new JTextField();
		txtLabel_3.setText("Label");
		txtLabel_3.setBounds(233, 98, 58, 20);
		contentPane.add(txtLabel_3);
		txtLabel_3.setColumns(10);
		
		txtLabel_4 = new JTextField();
		txtLabel_4.setText("Label");
		txtLabel_4.setBounds(233, 129, 58, 20);
		contentPane.add(txtLabel_4);
		txtLabel_4.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(309, 98, 115, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtEmail_1 = new JTextField();
		txtEmail_1.setText("Email");
		txtEmail_1.setBounds(309, 129, 115, 20);
		contentPane.add(txtEmail_1);
		txtEmail_1.setColumns(10);
		
		lblOtherDatas = new JLabel("Other Datas:");
		lblOtherDatas.setBounds(452, 52, 76, 38);
		contentPane.add(lblOtherDatas);
		
		txtLabel_6 = new JTextField();
		txtLabel_6.setText("Label");
		txtLabel_6.setBounds(452, 98, 86, 20);
		contentPane.add(txtLabel_6);
		txtLabel_6.setColumns(10);
		
		txtData = new JTextField();
		txtData.setText("Data");
		txtData.setBounds(558, 98, 184, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		txtLabel_7 = new JTextField();
		txtLabel_7.setText("Label");
		txtLabel_7.setBounds(452, 129, 86, 20);
		contentPane.add(txtLabel_7);
		txtLabel_7.setColumns(10);
		
		txtData_1 = new JTextField();
		txtData_1.setText("Data");
		txtData_1.setBounds(558, 129, 184, 20);
		contentPane.add(txtData_1);
		txtData_1.setColumns(10);
		
		JButton btnNewNumber = new JButton("+");
		btnNewNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labels.add(new JTextField("Label"));
				int lastIndex = labels.size() - 1;
				labels.get(lastIndex).setBounds(10,labels.get(lastIndex-1).getBounds().y + 31, 58, 20);
				contentPane.add(labels.get(lastIndex));
				labels.get(lastIndex).setColumns(10);
				
				numbers.add(new JTextField("Number"));
				numbers.get(lastIndex).setBounds(106,numbers.get(lastIndex-1).getBounds().y + 31, 102, 20);
				contentPane.add(numbers.get(lastIndex));
				numbers.get(lastIndex).setColumns(10);
				
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btnNewNumber.setBounds(106, 60, 89, 23);
		contentPane.add(btnNewNumber);
		
		JButton btnNewEmail = new JButton("+");
		btnNewEmail.setBounds(309, 60, 89, 23);
		contentPane.add(btnNewEmail);
		
		JButton btnNewOther = new JButton("+");
		btnNewOther.setBounds(558, 60, 89, 23);
		contentPane.add(btnNewOther);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(647, 16, 95, 32);
		contentPane.add(btnSubmit);
		
		contentPane.getRootPane().setDefaultButton(btnSubmit);
	}
}
