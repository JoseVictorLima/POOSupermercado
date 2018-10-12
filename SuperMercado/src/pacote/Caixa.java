package pacote;
import java.util.ArrayList;

public class Caixa {
	private int id;
	private float valorNoCaixa;
	private ArrayList<String> historico = new ArrayList();
	
	
	public void Entrar() {
		System.out.println("Entrar Caixa N" + this.id);
	}
	
	public void Sair() {
		System.out.println("Sair Caixa N" + this.id);
	}
}
