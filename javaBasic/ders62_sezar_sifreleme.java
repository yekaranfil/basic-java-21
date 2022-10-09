package javaNormal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ders62_sezar_sifreleme extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	int kd = 0;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders62_sezar_sifreleme frame = new ders62_sezar_sifreleme();
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
	public ders62_sezar_sifreleme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u015Eifrelenecek metin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 136, 31);
		contentPane.add(lblNewLabel);

		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt1.setBounds(10, 51, 441, 36);
		contentPane.add(txt1);
		txt1.setColumns(10);

		JSlider slider = new JSlider();

		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(1);
		slider.setValue(0);
		slider.setPaintTicks(true);
		slider.setMaximum(29);
		slider.setBounds(10, 134, 441, 54);
		contentPane.add(slider);

		JLabel lblkay = new JLabel("Kayd\u0131rma miktar\u0131 = 0\r\n");
		lblkay.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblkay.setBounds(10, 97, 178, 31);
		contentPane.add(lblkay);

		JButton btnNewButton = new JButton("\u015E\u0130FRELE");

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(164, 209, 128, 41);
		contentPane.add(btnNewButton);

		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt2.setColumns(10);
		txt2.setBounds(10, 270, 441, 36);
		contentPane.add(txt2);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				kd = (int) slider.getValue();
				lblkay.setText("Kaydýrma miktarý = "+ Integer.toString(kd));
			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "abcçdefgðhýijklmnoöprsþtuüvyz";
				String dm = txt1.getText();
				int i,j;
				String sifrelenmis = "";

				for(i=0;i<dm.length();i++) {
					char harf = dm.charAt(i);
					int konum = 0;
					for(j=0;j<a.length();j++) {
						if(harf==a.charAt(j)) konum=j;
					}
					int yenikonum = (konum + kd) % a.length();
					sifrelenmis += a.charAt(yenikonum);					
				}

				txt2.setText(sifrelenmis);

			}
		});

	}
}
