import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class grid {
    private JSlider slider1;
    private JPanel panel1;
    private JButton button1;
    private JLabel temperatura;


    public grid() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("PRESSIONOU");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();             // gera frame para colar os elementos
        frame.setContentPane(new grid().panel1); // coloca o painel gerado (panell)
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cria o set default operation
        frame.pack(); // GERA UM QUADRO PARA POSICIONAR ELEMENTOS
        frame.setVisible(true); // TORNA-O VISIVEL

    }
}

