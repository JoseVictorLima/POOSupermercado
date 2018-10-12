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
	
	public void Pagar(int opcaoDePagamento,Funcionario funcionario,Cliente cliente,Estoque estoque, ArrayList produtos, ArrayList quantidades) {
			if(opcaoDePagamento==1) {
				//Dinheiro
				float troco;
				for(int i=0; i<produtos.size();i++) {
					
					Produto prod= (Produto)produtos.get(i);
					int quant = (int)quantidades.get(i);
					troco = cliente.getDinheiro() - (prod.getPreco() * quant);
				}
				
				if(clinte.getDinheiro()>=troco) {
					
				cliente.setDinheiro(troco);
					for(int i=0; i<produtos.size();i++) {
					
						Produto prod = (Produto)produtos.get(i);
						int quant = (int)quantidades.get(i);
						estoque.Retirar(prod, quant);
						SalvarLog(funcionario,prod);
					
					}
				
				System.out.println("Troco: " + (int)troco +" reais e "+ (troco-(int)troco) + " centavos");
				
				}
				else {
					System.out.println("Cliente não possui dinheiro suficiente para pagar");
				}
			}else if(opcaoDePagamento==2) {
				//Cartão
				float resto;
				for(int i=0; i<produtos.size();i++) {
					
					Produto prod= (Produto)produtos.get(i);
					int quant = (int)quantidades.get(i);
					resto = cliente.getDinheiro() - (prod.getPreco() * quant);
				}
				if(clinte.getDinheiro()>=resto) {
					
				cliente.setDinheiro(resto);
					for(int i=0; i<produtos.size();i++) {
					
						Produto prod = (Produto)produtos.get(i);
						int quant = (int)quantidades.get(i);
						estoque.Retirar(prod, quant);
						SalvarLog(funcionario,prod);
					
					}
				}
				else {
					System.out.println("Cliente não possui dinheiro suficiente para pagar");
				}
			}else {
				System.out.println("Opção de pagamento invalida");
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
