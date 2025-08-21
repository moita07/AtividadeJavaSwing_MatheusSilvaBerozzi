import javax.swing.*;

public class Exercicio5 extends JFrame {
    public Exercicio5() {
        super("Seleção de gênero");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        // cria as opções de gênero "JRadioButton"
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");
        JRadioButton outro = new JRadioButton("Outro");

        // adiciona num grupo "ButtonGroup"
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(masculino);
        grupo.add(feminino);
        grupo.add(outro);

        JLabel resultado = new JLabel("Selecione um gênero:");

        JButton botao = new JButton("Selecionar");
        botao.addActionListener((e) -> {
            if (masculino.isSelected()) {
                resultado.setText("Selecionou: Masculino");
            } else if (feminino.isSelected()) {
                resultado.setText("Selecionou: Feminino");
            } else if (outro.isSelected()) {
                outro.setText("Selecionou: Outro");
            } else {
                resultado.setText("Nenhuma opção selecionada.");
            }
        });

        // adiciona os componentes ao painel
        painel.add(masculino);
        painel.add(feminino);
        painel.add(outro);
        painel.add(botao);
        painel.add(resultado);

        add(painel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercicio5());
    }
}