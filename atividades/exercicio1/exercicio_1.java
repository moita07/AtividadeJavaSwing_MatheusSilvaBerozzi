import java.awt.*;
import javax.swing.*;

public class exercicio_1 extends JFrame {

    public exercicio_1() {
        super("Exemplo JPanel");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // cria o painel
        JPanel painel = new JPanel();

        // define a cor de fundo do painel
        painel.setBackground(Color.GREEN);

        // define uma borda com titulo para o painel
        painel.setBorder(BorderFactory.createTitledBorder("Painel de Controle"));

        // cria um botão
        JButton button = new JButton("Clique Aqui");

        // define a cor de fundo do botão
        button.setBackground(Color.YELLOW);

        // adiciona o botão no painel
        painel.add(button);

        // adiciona o painel na janela
        add(painel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new exercicio_1());
    }
}