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
	private JTextField txtName;
	private JLabel lblNewLabel_1;
	private JTextField txtFamily;
	private JLabel lblNumber;
	private JTextField txtNumberLabel;
	private JTextField txtNumber;
	private JTextField txtNumberLabel2;
	private JTextField txtNumber2;
	private JTextField txtMailLabel;
	private JTextField txtMailLabel2;
	private JTextField txtEmail;
	private JTextField txtEmail2;
	private JLabel lblOtherDatas;
	private JTextField txtOtherLabel;
	private JTextField txtOther;
	private JTextField txtOtherLabel2;
	private JTextField txtOther2;
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

		ArrayList<JTextField> numbersLabels = new ArrayList<>();
		ArrayList<JTextField> numbers = new ArrayList<>();

		ArrayList<JTextField> mailsLabels = new ArrayList<>();
		ArrayList<JTextField> mails = new ArrayList<>();

		ArrayList<JTextField> othersLabels = new ArrayList<>();
		ArrayList<JTextField> others = new ArrayList<>();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 769, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("First name:");
		lblNewLabel.setBounds(10, 11, 58, 32);
		contentPane.add(lblNewLabel);

		txtName = new JTextField();
		txtName.setBounds(78, 17, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);

		lblNewLabel_1 = new JLabel("Family:");
		lblNewLabel_1.setBounds(174, 11, 58, 32);
		contentPane.add(lblNewLabel_1);

		txtFamily = new JTextField();
		txtFamily.setBounds(223, 17, 86, 20);
		contentPane.add(txtFamily);
		txtFamily.setColumns(10);

		lblNumber = new JLabel("Numbers:");
		lblNumber.setBounds(10, 55, 58, 32);
		contentPane.add(lblNumber);

		txtNumberLabel = new JTextField();
		txtNumberLabel.setText("Label");
		txtNumberLabel.setBounds(10, 98, 58, 20);
		contentPane.add(txtNumberLabel);
		txtNumberLabel.setColumns(10);
		numbersLabels.add(txtNumberLabel);

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
		numbersLabels.add(txtNumberLabel2);

		txtNumber2 = new JTextField();
		txtNumber2.setText("Number");
		txtNumber2.setBounds(106, 129, 102, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		numbers.add(txtNumber2);
		JLabel lblEmails = new JLabel("Emails:");
		lblEmails.setBounds(233, 55, 76, 32);
		contentPane.add(lblEmails);

		txtMailLabel = new JTextField();
		txtMailLabel.setText("Label");
		txtMailLabel.setBounds(233, 98, 58, 20);
		contentPane.add(txtMailLabel);
		txtMailLabel.setColumns(10);
		mailsLabels.add(txtMailLabel);

		txtMailLabel2 = new JTextField();
		txtMailLabel2.setText("Label");
		txtMailLabel2.setBounds(233, 129, 58, 20);
		contentPane.add(txtMailLabel2);
		txtMailLabel2.setColumns(10);
		mailsLabels.add(txtMailLabel2);

		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(309, 98, 115, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		mails.add(txtEmail);

		txtEmail2 = new JTextField();
		txtEmail2.setText("Email");
		txtEmail2.setBounds(309, 129, 115, 20);
		contentPane.add(txtEmail2);
		txtEmail2.setColumns(10);
		mails.add(txtEmail2);

		lblOtherDatas = new JLabel("Other Datas:");
		lblOtherDatas.setBounds(452, 52, 76, 38);
		contentPane.add(lblOtherDatas);

		txtOtherLabel = new JTextField();
		txtOtherLabel.setText("Label");
		txtOtherLabel.setBounds(452, 98, 86, 20);
		contentPane.add(txtOtherLabel);
		txtOtherLabel.setColumns(10);
		othersLabels.add(txtOtherLabel);

		txtOther = new JTextField();
		txtOther.setText("Data");
		txtOther.setBounds(558, 98, 184, 20);
		contentPane.add(txtOther);
		txtOther.setColumns(10);
		others.add(txtOther);

		txtOtherLabel2 = new JTextField();
		txtOtherLabel2.setText("Label");
		txtOtherLabel2.setBounds(452, 129, 86, 20);
		contentPane.add(txtOtherLabel2);
		txtOtherLabel2.setColumns(10);
		othersLabels.add(txtOtherLabel2);

		txtOther2 = new JTextField();
		txtOther2.setText("Data");
		txtOther2.setBounds(558, 129, 184, 20);
		contentPane.add(txtOther2);
		txtOther2.setColumns(10);
		others.add(txtOther2);

		JButton btnNewNumber = new JButton("+");
		btnNewNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numbersLabels.add(new JTextField("Label"));
				int lastIndex = numbersLabels.size() - 1;
				numbersLabels.get(lastIndex).setBounds(10,
						numbersLabels.get(lastIndex - 1).getBounds().y + 31,
						58, 20);
				contentPane.add(numbersLabels.get(lastIndex));
				numbersLabels.get(lastIndex).setColumns(10);

				numbers.add(new JTextField("Number"));
				numbers.get(lastIndex).setBounds(106,
						numbers.get(lastIndex - 1).getBounds().y + 31, 102, 20);
				contentPane.add(numbers.get(lastIndex));
				numbers.get(lastIndex).setColumns(10);

				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btnNewNumber.setBounds(106, 60, 89, 23);
		contentPane.add(btnNewNumber);

		JButton btnNewEmail = new JButton("+");
		btnNewEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mailsLabels.add(new JTextField("Label"));
				int lastIndex = mailsLabels.size() - 1;
				mailsLabels.get(lastIndex).setBounds(233,
						mailsLabels.get(lastIndex - 1).getBounds().y + 31, 58,
						20);
				contentPane.add(mailsLabels.get(lastIndex));
				mailsLabels.get(lastIndex).setColumns(10);

				mails.add(new JTextField("Email"));
				mails.get(lastIndex).setBounds(309,
						mails.get(lastIndex - 1).getBounds().y + 31, 115, 20);
				contentPane.add(mails.get(lastIndex));
				mails.get(lastIndex).setColumns(10);

				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		btnNewEmail.setBounds(309, 60, 89, 23);
		contentPane.add(btnNewEmail);

		JButton btnNewOther = new JButton("+");
		btnNewOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				othersLabels.add(new JTextField("Label"));
				int lastIndex = othersLabels.size() - 1;
				othersLabels.get(lastIndex).setBounds(452,
						othersLabels.get(lastIndex - 1).getBounds().y + 31, 86,
						20);
				contentPane.add(othersLabels.get(lastIndex));
				othersLabels.get(lastIndex).setColumns(10);

				others.add(new JTextField("Data"));
				others.get(lastIndex).setBounds(558,
						others.get(lastIndex - 1).getBounds().y + 31, 184, 20);
				contentPane.add(others.get(lastIndex));
				others.get(lastIndex).setColumns(10);

				contentPane.revalidate();
				contentPane.repaint();

			}
		});
		btnNewOther.setBounds(558, 60, 89, 23);
		contentPane.add(btnNewOther);

		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact newContact = new Contact(txtName.getText(), txtFamily
						.getText());
				ContactList contactList = new ContactList();
				for (int i = 0; i < numbersLabels.size(); i++) {
					if (!(numbersLabels.get(i).getText().equals("Label"))
							&& !(numbers.get(i).getText().equals("Number"))) {
						newContact.addToNumbers(new Number(numbersLabels.get(i)
								.getText(), numbers.get(i).getText()));
					}
				}
				for (int i = 0; i < mailsLabels.size(); i++) {
					if (!(mailsLabels.get(i).getText().equals("Label"))
							&& !(mails.get(i).getText().equals("Email"))) {
						newContact.addToMails(new Mail(mailsLabels.get(i)
								.getText(), mails.get(i).getText()));
					}
				}
				for (int i = 0; i < othersLabels.size(); i++) {
					if (!(othersLabels.get(i).getText().equals("Label"))
							&& !(others.get(i).getText().equals("Data"))) {
						newContact.addToOthers(new OtherData(othersLabels
								.get(i).getText(), others.get(i).getText()));
					}
				}

				contactList.addToContacts(newContact);
				contactList.write();

				dispose();
			}
		});
		btnSubmit.setBounds(647, 16, 95, 32);
		contentPane.add(btnSubmit);

	}
}
