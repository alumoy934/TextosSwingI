import javax.swing.*;

public class Texto extends JFrame {

    public Texto(){
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        LaminaTexto milamina = new LaminaTexto();
        add(milamina);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Texto();
            }
        });
    }
}
