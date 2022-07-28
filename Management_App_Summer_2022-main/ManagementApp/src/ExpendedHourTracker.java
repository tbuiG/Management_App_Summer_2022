
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.EmptyBorder;


public class ExpendedHourTracker extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_4_1;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_4_2;
	private JLabel lblNewLabel_3_2;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_4_3;
	private JLabel lblNewLabel_3_3;
	private JLabel lblNewLabel_2_4;
	private JLabel lblNewLabel_4_4;
	private JLabel lblNewLabel_3_4;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	
	ExpendedHourTracker() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500,700);
		this.setLayout(new FlowLayout());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Resource Tracker");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Total Expend Hours");
		lblNewLabel_1.setBounds(83, 5, 155, 20);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Requirements Analysis");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(93, 37, 148, 26);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Hour(s)");
		lblNewLabel_3.setBounds(265, 43, 61, 16);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(241, 43, 22, 16);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_2_1 = new JLabel("Designing");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(90, 75, 148, 26);
		panel.add(lblNewLabel_2_1);
		
		lblNewLabel_4_1 = new JLabel("0");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(241, 81, 22, 16);
		panel.add(lblNewLabel_4_1);
		
		lblNewLabel_3_1 = new JLabel("Hour(s)");
		lblNewLabel_3_1.setBounds(265, 81, 61, 16);
		panel.add(lblNewLabel_3_1);
		
		lblNewLabel_2_2 = new JLabel("Coding");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(90, 113, 148, 26);
		panel.add(lblNewLabel_2_2);
		
		lblNewLabel_4_2 = new JLabel("0");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(241, 119, 22, 16);
		panel.add(lblNewLabel_4_2);
		
		lblNewLabel_3_2 = new JLabel("Hour(s)");
		lblNewLabel_3_2.setBounds(265, 119, 61, 16);
		panel.add(lblNewLabel_3_2);
		
		lblNewLabel_2_3 = new JLabel("Testing");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_3.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_2_3.setBounds(90, 151, 148, 26);
		panel.add(lblNewLabel_2_3);
		
		lblNewLabel_4_3 = new JLabel("0");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setBounds(241, 157, 22, 16);
		panel.add(lblNewLabel_4_3);
		
		lblNewLabel_3_3 = new JLabel("Hour(s)");
		lblNewLabel_3_3.setBounds(265, 157, 61, 16);
		panel.add(lblNewLabel_3_3);
		
		lblNewLabel_2_4 = new JLabel("Project Management");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_4.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_2_4.setBounds(90, 189, 148, 26);
		panel.add(lblNewLabel_2_4);
		
		lblNewLabel_4_4 = new JLabel("0");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setBounds(241, 195, 22, 16);
		panel.add(lblNewLabel_4_4);
		
		lblNewLabel_3_4 = new JLabel("Hour(s)");
		lblNewLabel_3_4.setBounds(265, 195, 61, 16);
		panel.add(lblNewLabel_3_4);
		
		btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(183, 217, 117, 29);
		panel.add(btnNewButton);
		
		lblNewLabel_1_1 = new JLabel("0");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(247, 6, 16, 20);
		panel.add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("Hour(s)");
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(265, 6, 155, 20);
		panel.add(lblNewLabel_1_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}