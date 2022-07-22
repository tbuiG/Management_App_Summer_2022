import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;

public class risk extends JFrame {
	
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	
	
	risk() {
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		setBounds(100, 100, 650, 700);
//		contentPane = new JPanel();
//		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(650,700);
		this.setLayout(new FlowLayout());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("RISK");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(5, 5, 619, 36);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new LineBorder(new Color(0, 0, 0))));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Multilingual Support", "Certain", "Minor", "Active"},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table.setBounds(5, 93, 606, 48);
		contentPane.add(table);
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1.setBounds(28, 69, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("Likelihood");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(181, 68, 104, 14);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("Severity");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(338, 65, 76, 22);
		contentPane.add(lblNewLabel_1_2);
		
		lblNewLabel_1_3 = new JLabel("Status");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(494, 65, 76, 22);
		contentPane.add(lblNewLabel_1_3);
	}
}
