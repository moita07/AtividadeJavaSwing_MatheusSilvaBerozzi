import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exercicio_5 extends JFrame {
    public exercicio_5() {
        super("Seleção de gênero");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.LIGHT_GRAY);
        setLocationRelativeTo(null);

        // cria as opções de gênero "JRadioButton"
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");
        JRadioButton outro = new JRadioButton("Outro");

        // adiciona num grupo "ButtonGroup"
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(masculino);
        grupo.add(feminino);
        grupo.add(outro);

        // cria o painel
        JPanel painel = new JPanel("Gênero");
        painel.add(masculino);
        painel.add(feminino);
        painel.add(outro);

        JButton botao = new JButton("Selecionar");
        botao.addActionListener((e) -> {
            boolean selecao = null;

            if (masculino = true) {
                JLabel("Selecionou: Masculino");
            } else if (feminino = true) {
                JLabel("Selecionou: Feminino");
            } else (outro = true) {
                JLabel("Selecionou: outro")
            }
        });

        setVisible(true);
    }
}