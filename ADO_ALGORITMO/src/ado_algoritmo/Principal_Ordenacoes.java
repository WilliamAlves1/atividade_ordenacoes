package ado_algoritmo;

import comandos_gerais.escolherordena;
import exibicao.Exibicao;
import java.util.Random;
import javax.swing.JOptionPane;

public class Principal_Ordenacoes {

    public static void main(String[] args) throws NumberFormatException {

        int j = 1;
        Random gerador = new Random();
        int[] vet = null;

        do {
            String menuPrincipal = """
                                   Escolha o método desejado:
                                   1 - Método de Ordenação Bolha
                                   2 - Método de Ordenação Seleção
                                   3 - Método de Ordenação Inserção
                                   4 - Sair do Programa
                                   """;

            String inputEscolha = JOptionPane.showInputDialog(menuPrincipal);
            int escolha = Integer.parseInt(inputEscolha);

            if (escolha == 4) {
                JOptionPane.showMessageDialog(null, "Esperamos poder revê-lo logo!",
                        "Saindo", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            String menuVolume = """
                                Escolha o volume de dados desejado:
                                1 - Pequeno
                                2 - Médio
                                3 - Grande
                                """;

            String inputVol = JOptionPane.showInputDialog(menuVolume);
            int vol = Integer.parseInt(inputVol);

            vet = comandos_gerais.gerarei.gerador(vet, vol);

            JOptionPane.showMessageDialog(null, "O vetor desordenado será exibido a seguir.",
                    "Vetor Original", JOptionPane.INFORMATION_MESSAGE);

            exibicao.Exibicao.exibir(vet);


            escolherordena.ordenarei(vet, escolha);


            String menuContinuar = """
                                   Deseja continuar?
                                   1 - Sim
                                   2 - Não""";

            String inputJ = JOptionPane.showInputDialog(menuContinuar);
            j = Integer.parseInt(inputJ);

        } while (j == 1);

        JOptionPane.showMessageDialog(null, "Esperamos poder revê-lo logo!",
                "Saindo", JOptionPane.INFORMATION_MESSAGE);

    }
}