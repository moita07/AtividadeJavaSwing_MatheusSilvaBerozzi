import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class Exercicio4 extends JFrame {
    public Exercicio4() throws Exception {
        super("Campo de Data");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 120);
        setLocationRelativeTo(null);

        // painel para organizar os componentes
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        // label
        JLabel label = new JLabel("Data de Nascimento:");

        // campo de texto formatado
        JFormattedTextField campoData;
        try {
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('_');
            campoData = new JFormattedTextField(mascara);
            campoData.setColumns(8);
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        // adiciona os componentes no painel
        painel.add(label);
        painel.add(campoData);

        // adiciona o painel no JFrame
        add(painel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new Exercicio4();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}