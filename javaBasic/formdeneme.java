package javaNormal;

import javax.swing.*;

public class formdeneme {
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

}
