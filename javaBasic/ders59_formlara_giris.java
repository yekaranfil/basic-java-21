package javaNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ders59_formlara_giris extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders59_formlara_giris frame = new ders59_formlara_giris();
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
	public ders59_formlara_giris() {
		setTitle("\u0130lk form uygulamam\u0131z");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("\u0130sminizi giriniz:");
		lbl1.setOpaque(true);
		lbl1.setForeground(new Color(255, 255, 0));
		lbl1.setBackground(new Color(0, 0, 205));
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl1.setBounds(29, 31, 122, 28);
		contentPane.add(lbl1);
		
		textField = new JTextField();
		textField.setForeground(new Color(148, 0, 211));
		textField.setBackground(new Color(224, 255, 255));
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(161, 33, 155, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ho\u015Fgeldin");
		
		
		btnNewButton.setBackground(Color.green);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(122, 81, 172, 56);
		contentPane.add(btnNewButton);
		
		JLabel lbl2 = new JLabel("Ho\u015Fgeldin");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl2.setBounds(72, 178, 300, 62);
		contentPane.add(lbl2);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				lbl2.setText("Hoþgeldin " + s);
			}
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(Color.blue);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.green);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setBackground(Color.red);
			}
		});
	}
}
