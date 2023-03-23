package aula01;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int estoque =50;
		
		if(estoque >=100) {
			System.out.println("Produto suficiente");
		}else if(estoque <100 && estoque > 50 ) {
			System.out.println("Alerta: avaliar possibilidade de novo pedido");
		}else{
		System.out.println("Atenção: faça um novo pedido");
	}
	}
}
