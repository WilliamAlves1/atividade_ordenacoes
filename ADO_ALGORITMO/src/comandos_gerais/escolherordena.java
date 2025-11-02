package comandos_gerais;

import javax.swing.JOptionPane;
import ordenacoes.ordenabolha;
import ordenacoes.ordenainsercao;
import ordenacoes.ordenaselecao;

public class escolherordena {
    public static int ordenarei(int vet[], int opc){
        if (vet == null) {
            return 0;
        }

        int trocas = 0;
        int passadas= 0;
        int compara = 0;
        String estab = "";
        String metodoNome = "";

        long tempoDeExecucao = 0;

        switch (opc) {
            case 1:
                metodoNome = "Método Bolha:";
                estab = "Estável";

                long inicioBolha = System.currentTimeMillis();
                int[] resultadobolha = ordenabolha.bolha(vet);
                long fimBolha = System.currentTimeMillis();
                tempoDeExecucao = fimBolha - inicioBolha;

                trocas = resultadobolha[0];
                passadas = resultadobolha[1];
                compara = resultadobolha[2];
                break;

            case 2:
                metodoNome = "Método de Seleção:";
                estab = "Instável";

                long inicioSelecao = System.currentTimeMillis();
                int[] resultadoselecao = ordenaselecao.selecao(vet);
                long fimSelecao = System.currentTimeMillis();
                tempoDeExecucao = fimSelecao - inicioSelecao;

                trocas = resultadoselecao[0];
                passadas = resultadoselecao[1];
                compara = resultadoselecao[2];
                break;

            case 3:
                metodoNome = "Método de Inserção:";
                estab = "Estável";

                long inicioInsercao = System.currentTimeMillis();
                int[] resultadoinsercao = ordenainsercao.insercao(vet);
                long fimInsercao = System.currentTimeMillis();
                tempoDeExecucao = fimInsercao - inicioInsercao;

                trocas = resultadoinsercao[0];
                passadas = resultadoinsercao[1];
                compara = resultadoinsercao[2];
                break;
        }

        String mensagemResultado = "Detalhes de seu vetor ordenado:\n\n";
        mensagemResultado += metodoNome + "\n";
        mensagemResultado += "Estabilidade: " + estab + "\n";
        mensagemResultado += "Passadas: " + passadas + "\n";
        mensagemResultado += "Trocas (Movimentações): " + trocas + "\n";
        mensagemResultado += "Comparações: " + compara + "\n\n";
        mensagemResultado += "Tempo de execução: " + tempoDeExecucao + " ms";

        JOptionPane.showMessageDialog(null, mensagemResultado,
                "Resultado da Ordenação", JOptionPane.INFORMATION_MESSAGE);

        exibicao.Exibicao.exibir(vet);
        return trocas;
    }
}