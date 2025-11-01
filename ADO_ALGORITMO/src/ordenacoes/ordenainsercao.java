package ordenacoes;

public class ordenainsercao {
    public static int[] insercao(int vet[]) {
        int i, j, aux;
        int trocas = 0;
        int passadas = 0;
        int comparacoes = 0;
        
                for (i = 1; i < vet.length; i++) {
                    passadas++;
                    aux = vet[i];
                    j = i - 1;
                    while (j >= 0 && vet[j] > aux) {
                        comparacoes++;
                        vet[j + 1] = vet[j];
                        trocas++;
                        j--;                       
		}
		vet[j + 1] = aux;
        }
                return new int[] {trocas,passadas, comparacoes};
    }
    }

