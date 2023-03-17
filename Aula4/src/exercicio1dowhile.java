import java.util.Scanner;

public class exercicio1dowhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, soma =0, contador =0 ;
		float media;
		
		do {
		System.out.println("Informe um número (0 para sair) ");
		numero = leia.nextInt();
			if (numero != 0 && numero %3 == 0) {
			
				soma += numero;
				contador++;
				
			}
			
		}
		while (numero != 0);
	
			media = (float) soma / contador;
			System.out.println("A média dos números multiplicos de 3 informados é: " + media);
		

	}

}
