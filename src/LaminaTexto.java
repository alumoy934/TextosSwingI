import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaTexto extends JPanel {

    public LaminaTexto(){
        JLabel label = new JLabel("Introduce un texto");
        add(label);

        JTextField campo1 = new JTextField(10);
        add(campo1);

        System.out.println(campo1.getText());

        JButton boton = new JButton("Presiona el botón");
        add(boton);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Texto introducido: " + campo1.getText());
            }
        });
    }
}
