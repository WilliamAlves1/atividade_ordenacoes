package ordenacoes;

public class ordenabolha {
    public static int[] bolha(int vet[]) {
        int trocas = 0;
        int temp = 0;
        int passadas = 0;
        int comparacoes = 0;
        
            for (int i = 0; i < vet.length -1; i ++) { 
                passadas ++;
                for (int j = 0; j < vet.length - (i+1); j ++) {
                    comparacoes++;
                    if (vet[j] > vet[j + 1]) {
			temp = vet[j];
			vet [j] = vet[j + 1];
			vet [j + 1] = temp;
                        trocas ++;
    }                   
}
            }
            return new int[] {trocas, passadas, comparacoes};
    }
}
