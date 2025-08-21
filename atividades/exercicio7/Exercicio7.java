package exercicio7;

import java.awt.event.*;
import javax.swing.*;

public class Exercicio7 extends JFrame {
    public Exercicio7() {
        super("Seleção de País");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250,150);
        setLocationRelativeTo(null);

        // painel para organizar os componentes
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        // ComboBox com os países
        String[] paises = {"Brasil", "Argentina", "Chile"};
        JComboBox<String> comboBox = new JComboBox<>(paises);
        // define Argentina como padrão
        comboBox.setSelectedItem("Argentina");

        // label para exibir o item selecionado
        JLabel label = new JLabel("País selecionado: Argentina");

        // adiciona listener para atualizar o label quando a seleção mudar
        comboBox.addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label.setText("País selecionado: " + e.getItem());
                }
        });

        // adiciona os componentes ao painel
        painel.add(comboBox);
        painel.add(label);

        // adiciona o painel no JFrame
        add(painel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercicio7());
    }

}