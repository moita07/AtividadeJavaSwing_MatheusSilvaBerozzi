import java.awt.*;
import javax.swing.*;

public class Exercicio3 extends JFrame {
    public Exercicio3() {
        super("Exemplo JScroolPane");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // texto longo
        String texto = "Java Swing é uma biblioteca para construção de interfaces gráficas em Java. Ela faz parte do pacote javax.swing. Com Swing, é possível criar janelas, botões, menus e diversos componentes visuais. Swing oferece uma grande variedade de controles personalizáveis. É independente da plataforma, funcionando em diferentes sistemas operacionais. Swing usa o modelo de eventos para interação com o usuário. A biblioteca permite a criação de layouts flexíveis para organizar componentes. Possui suporte a temas e estilos para melhorar a aparência. Swing facilita a criação de aplicações desktop profissionais. É amplamente utilizada para desenvolver softwares com interface gráfica em Java.";

        // cria o JTextArea com 10 linhas e 30 colunas
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setText(texto);
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setFont(new Font("Arial", Font.PLAIN, 12));

        // permite a quebra de linha automatica e a quebra por palavra
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // adiciona o JTextArea dentro do JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);

        // adicona o JScrollPane na janela
        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercicio3());
    }
}