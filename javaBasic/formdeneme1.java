package javaNormal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formdeneme1 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton BANABASButton;
    private JPanel panel1;
    private JCheckBox checkBox1;
    private JLabel hosgeldinlabel;

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                formdeneme1 f = new formdeneme1();
                f.setVisible(true);


            }
        });
    }
    public formdeneme1(){
        add(panel1);
        setSize(400,200);
        setTitle("DENEME");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        BANABASButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad, soyad;
                ad = textField1.getText();
                soyad = textField2.getText();
                System.out.println(ad + " " + soyad);
                hosgeldinlabel.setText("HOÞGELDÝN"+ " " + ad + " " + soyad );


            }
        });
        BANABASButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                BANABASButton.setBackground(Color.red);
            }
        });
        BANABASButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("langir lingir 31");

            }
        });
    } }

