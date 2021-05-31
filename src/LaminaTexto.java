import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaTexto extends JPanel {

    private JLabel resultado;

    public LaminaTexto(){

        setLayout(new BorderLayout());

        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new FlowLayout());

        resultado = new JLabel("", JLabel.CENTER);


        JLabel label = new JLabel("Introduce un texto");
        lamina2.add(label);

        JTextField campo1 = new JTextField(10);
        lamina2.add(campo1);

        JButton boton = new JButton("Presiona el botón");
        lamina2.add(boton);

        add(lamina2, BorderLayout.NORTH);
        add(resultado, BorderLayout.CENTER);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String email = campo1.getText().trim();
                int correcto = 0;

                for (int i = 0; i < email.length(); i++) {
                    if (email.charAt(i) == '@'){
                        correcto ++;
                    }
                }

                if (correcto !=1){
                   resultado.setText("Email incorrecto");
                }else {
                    resultado.setText("Email correcto");
                }

            }
        });
    }
}
