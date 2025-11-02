package exibicao;

import java.awt.Dimension;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Exibicao {

    public static void exibir(int[] vet) {
        if (vet == null) {
            JOptionPane.showMessageDialog(null,
                    "Vetor está nulo. Não é possível exibir.",
                    "Erro de Exibição",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String vetorString = Arrays.toString(vet);

        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText(vetorString);

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setCaretPosition(0);

        JScrollPane scrollPane = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(null,
                scrollPane,
                "Exibição do Vetor (Tamanho: " + vet.length + ")",
                JOptionPane.PLAIN_MESSAGE);
    }
}