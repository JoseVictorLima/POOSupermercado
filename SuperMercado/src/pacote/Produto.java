package pacote;
import java.lang.String; 
public class Produto {
	String Codigo;
	String Nome;
	double Preco;
	int Quantidade;
	
	
	
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getPreco() {
		return Preco;
	}
	public void setPreco(double pre�o) {
		Preco = pre�o;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
			}
	
	public Produto(String codigo, String nome, double preco, int quantidade) {
		super();
		Codigo = codigo;
		Nome = nome;
		Preco = preco;
		Quantidade = quantidade;
	
	}

	String Str = String.valueOf(Preco);
	
	
	public String toString() {
		return this.Codigo +" " + this.Nome +" "+ Str;
		}
	

}
