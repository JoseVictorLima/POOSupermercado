package pacote;
import java.util.ArrayList;
import java.util.Date;
import java.util.*;

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
	
	public void AtualizarEstoque() {
		
	}
	
    
	
	public Caixa(int id, float valorNoCaixa) {
		super();
		this.id = id;
		this.valorNoCaixa = valorNoCaixa;
	}

	public void Pagar(int opcaoDePagamento,Funcionario funcionario,Cliente cliente,Produto produto,int quant,Estoque estoque) {
		if(cliente.getDinheiro()>=produto.getPreco()) {
			if(opcaoDePagamento==1) {
				//Dinheiro
				float troco;
				troco = cliente.getDinheiro() - (produto.getPreco() * quant);
				cliente.setDinheiro(troco);
				estoque.Retirar(produto, quant);
				System.out.println("Troco: " + (int)troco +" reais e "+ (troco-(int)troco) + " centavos");
				SalvarLog(funcionario,produto);
			}else if(opcaoDePagamento==2) {
				//Cartão
				float resto;
				resto = cliente.getDinheiro() - (produto.getPreco() * quant);
				cliente.setDinheiro(resto);
				estoque.Retirar(produto, quant);
				SalvarLog(funcionario,produto);
			}else {
				System.out.println("Opção de pagamento invalida");
			}
		}
		else {
			System.out.println("Cliente não possui dinheiro suficiente para pagar");
		}
	}
	
	//Metodo para Salvar Logs
	
	public void SalvarLog(Funcionario funcionario, Produto produto) {
		String log;
		Date data = new Date();
		log = "Caixa: " + this.id + " - Funcionario: " + funcionario.getId() + " - Porduto: "+ produto.getCodigo() + " - Data: " + data;
		this.historico.add(log);
	}
}
