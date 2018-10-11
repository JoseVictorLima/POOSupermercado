package SPM;
import java.lang.String; 
public class Produto {
	String Codigo;
	String Nome;
	double Preço;
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
	public double getPreço() {
		return Preço;
	}
	public void setPreço(double preço) {
		Preço = preço;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	

}
