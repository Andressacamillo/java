import java.util.Scanner;

public class exercicio1while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, genero, categoria, PB =0, PFM =0, PMH40 =0, PFSM30 =0;
		char resposta = 'S';
		
		
		while( resposta == 'S' ) {
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Categorias: ");
		System.out.println("--------------------- ");
		System.out.println("1\tBackend ");
		System.out.println("2\tFrontend ");
		System.out.println("3\tMobile ");
		System.out.println("4\tFullStack ");
		System.out.println("--------------------- ");
		System.out.println("Informe a categoria: ");
		categoria = leia.nextInt();
		
		
		System.out.println("---------------------- ");
		System.out.println("1(F)/ 2(M)/ 3(T)/ 4(NB)");
		System.out.println("Informe o genêro com o qual se identifica? ");
		genero = leia.nextInt();
		if (genero == 3);{
		System.out.println("Informe qual gênero? 1(F) e 2(M)");}
		genero = leia.nextInt();
		
		
			if (idade > 40 && categoria == 3 && genero == 2)
			PMH40 ++;
			if (idade < 30 && categoria == 4 && genero == 1)
				PFSM30 ++;
			if (categoria == 2 && genero == 1)
				PFM ++;
			if (categoria == 1)
				PB ++;
		
		System.out.println("Deseja prosseguir para leitura de outro colaboradore? ");
		resposta = leia.next().toUpperCase().charAt(0);
		
	
		

		}
		 
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + PMH40);
		System.out.println("Total de pessoas desenvolvedoras Backend: " + PB);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + PFSM30);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + PFM);

	}

}
