import java.util.Scanner;

public class exercicio2while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int idade, contador = 0, maiores18 = 0;
        char continua = 'S';

        System.out.println("Digite a sua idade: "); 
        idade = leia.nextInt();

            while(continua == 'S') {
                System.out.println("Digite a sua idade: ");
                idade = leia.nextInt();

                contador ++;

                if(idade <= 21 || idade >= 50)
                    maiores18 ++;

                System.out.println("Deseja continua (S/N)? ");
                continua = leia.next().toUpperCase().charAt(0);

            }

            System.out.println("Total de pessoas menores de 21 anos: "+ contador);
            System.out.println("Total de pessoas maiores de 50 anos: "+ contador);
    

	}

}
