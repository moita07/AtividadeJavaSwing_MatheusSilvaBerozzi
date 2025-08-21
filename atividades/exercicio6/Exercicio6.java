import java.awt.*;
import javax.swing.*;

public class Exercicio6 extends JFrame {

    public Exercicio6() {
        super("Exemplo JSplitPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Painel esquerdo
        JPanel painelEsquerdo = new JPanel();
        painelEsquerdo.setBackground(Color.RED);
        painelEsquerdo.add(new JLabel("Esquerda"));

        JPanel painelDireito = new JPanel();
        painelDireito.setBackground(Color.BLUE);
        painelDireito.add(new JLabel("Direita"));

        // cria o JSplitPane horizontal (divide esquerda e direita)
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painelEsquerdo, painelDireito);

        // define a posição do divisor como 40%
        splitPane.setDividerLocation(0.4);

        // define o tamanho do divisor (faixa divisória) como 10 pixels
    splitPane.setDividerSize(10);

        // adiciona o JSplitPane à janela
        add(splitPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercicio6());
    }
}