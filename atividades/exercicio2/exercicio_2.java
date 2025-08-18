import java.awt.*;
import javax.swing.*;

public class exercicio_2 extends JFrame {

    public exercicio_2() {
        super("TabbedPane (painel com guias)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // cria o JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // aba 1 "configurações"
        JPanel configuracoes = new JPanel();
        configuracoes.add(new JLabel("Bem-vindo às Configurações!"));
        tabbedPane.addTab("Configurações", configuracoes);

        // aba 2 "perfil"
        ImageIcon icone = new ImageIcon(getClass().getResource("./img/img.png")); // cria e chama a imagem icone

        // redimensionamento da imagem (utilizei ChatGPT, a aplicação estava bugando pois a imagem é grande)
        Image iconeRedimensionado = icone.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        ImageIcon iconeFinal = new ImageIcon(iconeRedimensionado);

        JPanel perfil = new JPanel();
        perfil.setBackground(Color.BLUE);
        perfil.add(new JTextField("Digite um nome", 15));
        tabbedPane.addTab("Perfil", iconeFinal, perfil);
        
        // aba 3 "ajuda"
        JPanel ajuda = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea("Digite suas dúvidas aqui.", 8, 20);
        ajuda.add(new JScrollPane(textArea), BorderLayout.CENTER);
        tabbedPane.addTab("Ajuda", ajuda);

        // adiciona o tabbedPane na janela
        add(tabbedPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new exercicio_2());
    }
}