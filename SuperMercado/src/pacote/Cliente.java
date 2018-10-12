package pacote;


import java.util.ArrayList;

public class Cliente {
	private ArrayList<Produto> Carrinho = new ArrayList();
	public String Nome;
	private double Dinheiro;
		
	public Cliente(String Nome, double Dinheiro) {
		super();
		this.Nome = Nome;
		this.Dinheiro = Dinheiro;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}


	public double getDinheiro() {
		return Dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.Dinheiro = Dinheiro;
	}
	
	public descricaoProduto(String codigo)
	{
		//CHAMA FUNÇÃO DO ESTOQUE PARA BUSCAR NO ARRAY LIST
	}
	public void adicionarProduto(String codigo)
	{
		int quantidade=0;
		double quantidade=0;
		Scanner cin = new Scanner();
		//Buscar no arraylist de estoque
		//se for um protudo N_perecivel
		System.out.println("Digite a Quantidade que Deseja adicionar no Carrinho");
		quantidade = cin.nextInt();
		//adiciona no carrinho um objeto do tipo especificado;
		
		
	}
	
	public void removerProduto(ArrayList<Produto> carrinho)
	
	
	{
		//IMPLEMENTAR
		
		
	}
	
	
	
}
