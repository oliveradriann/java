import javax.swing.*;

public class Tela {
    public static void main(String[] args) {
        JFrame tela =new JFrame();
        tela.setSize(300,200); // tamanho da tela
        tela.setLocation(500,300);   // local onde a tela aparece
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha e termina
                // estrutura para fundo da tela

        JPanel jp=new JPanel(); // construo painel para colar etiquetas
        JLabel texto =new JLabel("LOGIN"); // COLOCO TEXTO NA JANELA E POSSO DEFINIR
        jp.add(texto);
        JTextField caixa = new JTextField(10); // onde 10 é o tamanho da caixa
        jp.add(caixa);

        JButton botao =new JButton("OK");

        jp.add(botao);









        tela.add(jp); // coloco o painel
        tela.setVisible(true); // torno visivel

    }
}
