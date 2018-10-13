package pacote;
import java.util.ArrayList;
import pacote.Produto;

public class Estoque {
	private ArrayList<Produto> listProduto = new ArrayList();
	
	public Estoque() {
		
	}
	
	public void Adicionar(Produto prod) {
		this.listProduto.add(prod);
	}
	
	public void Retirar(Produto prod, int unid) {
		int indice=0;
		if(this.listProduto.contains(prod)) {
			indice = this.listProduto.indexOf(prod);
			prod.setQuantidade(unid);
			this.listProduto.set(indice,prod);
		}
	}
	public void Remover(Produto prod) {
		if(this.listProduto.contains(prod)) {
			this.listProduto.remove(this.listProduto.indexOf(prod));
		}
	}
	public void EstoqueGeral() {
		for(int i =0; i < this.listProduto.size();i++) {
			Produto prod;
			prod = this.listProduto.get(i);
			System.out.println("Nome: " + prod.getNome());
			System.out.println("Quantidade: " + prod.getQuantidade());
			System.out.println("Preço: " + prod.getPreco());
		}
	}
}
