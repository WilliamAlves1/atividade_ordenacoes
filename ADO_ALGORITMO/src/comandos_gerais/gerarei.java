package comandos_gerais;

import java.util.Random;
import javax.swing.JOptionPane;

public class gerarei {
    public static int[] gerador(int vet[], int opc) {
        Random gerador = new Random();

        switch (opc) {
            case 1:
                vet = new int[10];
                for (int i = 0; i < vet.length; i++) {
                    String inputValor = JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor do vetor:");
                    int valor = Integer.parseInt(inputValor);
                    vet[i] = valor;
                }
                break;
            case 2:
                vet = new int[1050];
                for (int i = 0; i < vet.length; i++) {
                    vet[i] = gerador.nextInt(5000) + 1;
                }
                break;
            case 3:
                vet = new int[10000];
                for (int i = 0; i < vet.length; i++) {
                    vet[i] = gerador.nextInt(10000) + 1;

                }
                break;
        }
        return vet;
    }
}