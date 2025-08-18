import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class exercicio_4 extends JFrame {
    public exercicio_4() {
        super("Título");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.LIGHT_GRAY);
        setLocationRelativeTo(null);

        // cria o painel
        JPanel painel = new JPanel();

        // Define a cor de fundo do painel
        painel.setBackground(Color.LIGHT_GRAY);
        
        // define uma borda com título paa o painel
        Border borda = BorderFactory.createTitledBorder("Meu Painel");

        // cria um botao
        JButton botao = new JButton("Clique aqui");

        // adiciona o botao ao painel
        painel.add(botao);

        // adiciona o painel à janela
        add(painel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new exercicio_4());
    }
}