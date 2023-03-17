import java.util.Scanner;

public class lacocondicionalif {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int nA, nB, nC, soma;

        System.out.println("Escreva o Numero de A:");
        nA = leia.nextInt();
        System.out.println("Escreva o Numero de B:");
        nB = leia.nextInt();
        System.out.println("Escreva o Numero de C:");
        nC = leia.nextInt();
        if ((nA + nB) > nC) {
            System.out.println("A soma do A + B é maior que C ");
        }
        if ((nA + nB) < nC) {
            System.out.println("A soma do A + B é menor que C ");
    }

    if ((nA + nB) == nC) {
        System.out.println("A soma do A + B é igual C ");
    }
    
	}
}