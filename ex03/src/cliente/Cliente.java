package cliente;

import java.util.Scanner;
import cliente.model.Clientes;

public class Cliente {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		String nome, cpf, cep;
		int idade, estadoCivil;
		

		Clientes c1 = new Clientes ("Maria", 30, "123.456.789-00", "01234-566", 1);
		Clientes c2 = new Clientes ("Joao", 18, "987.654.321-00", "09876-543", 2);
		Clientes c3 = new Clientes ("Ana", 69, "895.632.145-00", "78532-160", 3);
						
		c1.visualizar();
		c2.visualizar();
		c3.visualizar();
		
		
		

	}

}


