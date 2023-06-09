package ex03;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class produto {

	private int id;
	private String nome;
	private int versao;
	private String produtora;
	private LocalDate dataLancamento;
	private float preco;
	
	public produto(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco) {
		this.id = id;
		this.nome = nome;
		this.versao = versao;
		this.produtora = produtora;
		this.dataLancamento = dataLancamento;
		this.preco = preco;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar( ) {
		
		NumberFormat nfMoeda =
		NumberFormat.getCurrencyInstance()
;
		System.out.println("\n*********************************************");
		System.out.println("Dados do produto");
		System.out.println("\n**********************************************");
		System.out.println("\nId: " + this.id);
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nVersão: " + this.versao);
		System.out.println("\nProdutora: " + this.produtora);
		System.out.println("\nData de Lançamento: " + this.dataLancamento.format(DateTimeFormatter.ofPattern("17/11/1995")));
		System.out.println("\nPreço: " + nfMoeda.format(this.preco));
		
		
	}
}
