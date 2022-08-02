package anotacoes;

public class Teste_Funcoes {

	public static void main(String[] args) {
		
		int limite = 10;
		int pares[] = new int[limite];
	
		limite++;
	
		pares = par(limite);
		
		imprimirVetor(pares);
		
	}
	
	public static void imprimirVetor(int[] vetor) { // essa funcao ira imprimir o conteudo de um vetor separado por um espaço em brancoF
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != 0) {
				System.out.print(vetor[i] + " ");	
			}	
		}

	}

	public static int[] par(int limite) { // essa funcao retornara numeros pares num limite especifico, nesse caso 5
		int numeros[] = new int[limite];
		int pos = 0;
		
		for (int i = 0; i< limite; i++) {
			if (i % 2 == 0) {
				numeros[pos] = i;
				pos++;
			}
		}
		
		return numeros;
	}
	
}
