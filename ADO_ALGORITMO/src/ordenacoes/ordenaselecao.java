package ordenacoes;

public class ordenaselecao {
    public static int[] selecao(int vet[]) {
            int min;
            int k;
            int trocas = 0;
            int passadas = 0;
            int comparacoes = 0;

            for (int i = 0; i < vet.length - 1; i++) {
                passadas ++;
                min = i;
                    for (int j = (i + 1); j < vet.length; j++) {
                        comparacoes++;
                        if (vet[j] < vet[min]) {
                            min = j;
		}
	}
            if (i != min) {
		k = vet[i];
		vet[i] = vet[min];
		vet[min] = k;
                trocas++;
	
        }
    }
            return new int[] {trocas, passadas, comparacoes};
}
}
