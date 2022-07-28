import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class project_requirements extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton prjmngbttn1;
	
	project_requirements() {
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(650,700);
		this.setLayout(new FlowLayout());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProjectRequirements = new JLabel("PROJECT REQUIREMENTS");
		lblProjectRequirements.setHorizontalAlignment(SwingConstants.CENTER);
		lblProjectRequirements.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblProjectRequirements.setBounds(0, 11, 634, 36);
		contentPane.add(lblProjectRequirements);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1.setBounds(49, 79, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Description");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(240, 76, 104, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hours");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(405, 76, 104, 21);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Resolved");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(524, 75, 76, 22);
		contentPane.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setBounds(10, 113, 155, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(175, 113, 210, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(400, 113, 127, 20);
		contentPane.add(textField_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(546, 110, 32, 23);
		contentPane.add(chckbxNewCheckBox);
	
		
		prjmngbttn1 = new JButton("Submit");
		prjmngbttn1.setFont(new Font("Segoe UI", Font.BOLD, 24));
		prjmngbttn1.setBounds(120, 522, 383, 59);
		contentPane.add(prjmngbttn1);
		prjmngbttn1.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
