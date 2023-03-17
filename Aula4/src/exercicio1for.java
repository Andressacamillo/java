import java.util.Scanner;

public class exercicio1for {

	public static void main(String[] args) {
        
	

	        Scanner leia = new Scanner(System.in);

	        int numeroInicial, numeroFinal;

	        System.out.println("Informe o intervalo inicial: ");
	        numeroInicial = leia.nextInt();

	        System.out.println("Informe o intervalo final: ");
	        numeroFinal = leia.nextInt();

	        if(numeroInicial > numeroFinal) {
	            System.out.println("Intervalo inválido!");
	            System.exit(0);
	        }


	        for(int contador = numeroInicial; contador <= numeroFinal; contador ++) {

	            if(contador%3 == 0 && contador%5 == 0)
	                System.out.println(contador + " é múltiplo de 5 e 3.");

	        }
	}
}
		

	


