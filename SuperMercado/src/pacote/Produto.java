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
	public void setPreco(double preço) {
		Preco = preço;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public String toString() {
		return this.Codigo + this.Nome + this.Preco;
		}
	

}
