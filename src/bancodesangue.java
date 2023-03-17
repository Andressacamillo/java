import java.util.Scanner;

public class bancodesangue {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);

	        String nome;
	        int idade;
	        boolean sangue =  true;

	        System.out.println("Digite nome: ");
	        nome = leia.next();

	        System.out.println("Digite sua idade: ");
	        idade = leia.nextInt();

	        System.out.println("Primeira doação: ");
	        sangue = leia.hasNext();

	        if (idade >= 18 && idade <= 69 != true)
	            System.out.println("Não Apto");
	        else if 
	           (idade >= 18 && idade <= 69 == true)
	            System.out.println("Apto");



	    
     

	}

}
