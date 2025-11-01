package exibicao;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exibicao {
    public static void exibir(int[] vet){
        String vetorString = Arrays.toString(vet);

        JOptionPane.showMessageDialog(null, vetorString,
                "Exibição do Vetor",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
