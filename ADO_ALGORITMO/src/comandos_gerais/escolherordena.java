package comandos_gerais;

import javax.swing.JOptionPane;

public class escolherordena {
    public static int ordenarei(int vet[], int opc){
        int trocas = 0;
        int passadas= 0;
        int compara = 0;
        String estab = "";

        String metodoNome = "";

        switch (opc) {
            case 1:
                metodoNome = "Método Bolha:";
                estab = "Estável";
                int[] resultadobolha = ordenacoes.ordenabolha.bolha(vet);
                trocas = resultadobolha[0];
                passadas = resultadobolha[1];
                compara = resultadobolha[2];
                break;

            case 2:
                metodoNome = "Método de Seleção:";
                estab = "Instável";
                int[] resultadoselecao = ordenacoes.ordenaselecao.selecao(vet);
                trocas = resultadoselecao[0];
                passadas = resultadoselecao[1];
                compara = resultadoselecao[2];
                break;

            case 3:
                metodoNome = "Método de Inserção:";
                estab = "Estável";
                int[] resultadoinsercao = ordenacoes.ordenainsercao.insercao(vet);
                trocas = resultadoinsercao[0];
                passadas = resultadoinsercao[1];
                compara = resultadoinsercao[2];
                break;
        }

        String mensagemResultado = "Detalhes de seu vetor ordenado:\n\n";
        mensagemResultado += metodoNome + "\n";
        mensagemResultado += "Estabilidade: " + estab + "\n";
        mensagemResultado += "Passadas: " + passadas + "\n";
        mensagemResultado += "Trocas: " + trocas + "\n";
        mensagemResultado += "Comparações: " + compara + "\n\n";
        mensagemResultado += "O vetor ordenado será exibido no console.";

        JOptionPane.showMessageDialog(null, mensagemResultado,
                "Resultado da Ordenação", JOptionPane.INFORMATION_MESSAGE);

        exibicao.Exibicao.exibir(vet);
        return trocas;
    }
}