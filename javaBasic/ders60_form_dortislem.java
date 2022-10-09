package javaNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ders60_form_dortislem extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders60_form_dortislem frame = new ders60_form_dortislem();
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
	public ders60_form_dortislem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0130lk say\u0131y\u0131 giriniz:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 132, 29);
		contentPane.add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt1.setBounds(175, 12, 96, 26);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblIkinciSayyGiriniz = new JLabel("\u0130kinci say\u0131y\u0131 giriniz:");
		lblIkinciSayyGiriniz.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIkinciSayyGiriniz.setBounds(10, 49, 155, 29);
		contentPane.add(lblIkinciSayyGiriniz);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt2.setColumns(10);
		txt2.setBounds(175, 46, 96, 26);
		contentPane.add(txt2);
		
		JButton btntopla = new JButton("+");
		
		btntopla.setBackground(new Color(30, 144, 255));
		btntopla.setFont(new Font("Tahoma", Font.BOLD, 20));
		btntopla.setBounds(10, 98, 50, 50);
		contentPane.add(btntopla);
		
		JButton btncikar = new JButton("-");
		
		btncikar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btncikar.setBackground(new Color(255, 69, 0));
		btncikar.setBounds(82, 98, 50, 50);
		contentPane.add(btncikar);
		
		JButton btncarp = new JButton("*");
		
		btncarp.setFont(new Font("Tahoma", Font.BOLD, 20));
		btncarp.setBackground(new Color(50, 205, 50));
		btncarp.setBounds(159, 98, 50, 50);
		contentPane.add(btncarp);
		
		JButton btnbol = new JButton("/");
		
		btnbol.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnbol.setBackground(new Color(255, 255, 0));
		btnbol.setBounds(231, 98, 50, 50);
		contentPane.add(btnbol);
		
		JLabel lblsonuc = new JLabel("SONU\u00C7");
		lblsonuc.setHorizontalAlignment(SwingConstants.CENTER);
		lblsonuc.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblsonuc.setBounds(46, 171, 204, 67);
		contentPane.add(lblsonuc);
		
		btntopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1,s2;
				s1 = Integer.parseInt(txt1.getText());
				s2 = Integer.parseInt(txt2.getText());
				
				int sonuc = s1 + s2;
						
				lblsonuc.setText(Integer.toString(sonuc));		
			}
		});
		
		btncikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1,s2;
				s1 = Integer.parseInt(txt1.getText());
				s2 = Integer.parseInt(txt2.getText());
				
				int sonuc = s1 - s2;
						
				lblsonuc.setText(Integer.toString(sonuc));
			}
		});
		
		
		btncarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1,s2;
				s1 = Integer.parseInt(txt1.getText());
				s2 = Integer.parseInt(txt2.getText());
				
				int sonuc = s1 * s2;
						
				lblsonuc.setText(Integer.toString(sonuc));
			}
		});
		
		btnbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1,s2;
				s1 = Integer.parseInt(txt1.getText());
				s2 = Integer.parseInt(txt2.getText());
				
				float sonuc = (float)s1 / s2;
						
				lblsonuc.setText(Float.toString(sonuc));
			}
		});
		
	}

}
