package pedido;

import java.util.List;
import java.util.ArrayList;

public class Pedido extends Operacao {

	private int cod;
	private boolean resultado;
	
	protected Vendedor vendedor;
	protected Cliente cliente;
	protected List<Produto> produtos;
	
	public Pedido() {
		cliente = new Cliente();
		vendedor = new Vendedor();
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public boolean verificaProdutoUnico(Produto produto) {
		
		for(int i=0; i<produtos.size(); i++){
			if (!(produtos.get(i).getDescricao()).equalsIgnoreCase(produto.getDescricao()))
					resultado = true;
			else 
				resultado = false;
		}
		return resultado;
	}
	public boolean addProduto(Produto produto) {
		if (verificaProdutoUnico(produto)) {
			produtos.add(produto);
			return true;
		}
		return false;
	}
	
	public double totalPedido() {
		double totalPedido = 0;
		for(int i=0; i<produtos.size(); i++){
		totalPedido = totalPedido + produtos.get(i).totalItem();
		}
		return totalPedido;
	}
	
	public double valorMedio() {
		double mediaPedido = 0;
		for(int i=0; i<produtos.size(); i++){
		mediaPedido = mediaPedido + produtos.get(i).totalItem();
		}
		return mediaPedido/produtos.size();
	}
	
	public List<Produto> quantidadeMaior(int quantidade){
		List<Produto> quantidadeM = new ArrayList<Produto>();
		for(int i=0; i<produtos.size(); i++){
			if (quantidade < produtos.get(i).getQuantidade())
				quantidadeM.add(produtos.get(i));
		}
		return quantidadeM;
	}
	
	 public String nomeVendedor() {
		 return vendedor.getNome();
	 }
	 
	 public String emailCliente() {
		 return cliente.getEmail();
	 }
	 
	 public List<Produto> buscaProdutoDescricao(String descricao){
		 List<Produto> buscaProduto = new ArrayList<Produto>(); 
		 for(int i=0; i<produtos.size(); i++){
			if(produtos.get(i).getDescricao().contains(descricao))
						buscaProduto.add(produtos.get(i));
				}
		 return buscaProduto;
		}
	 
	 	public int dias() {
	 		long secIn = getDtInicio().getTime();
			long secFi = getDtFim().getTime();
			int dif = ((int)(secFi - secIn) / 1000)/86400;
			return dif;
	 	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [cod=");
		builder.append(cod);
		builder.append(", vendedor=");
		builder.append(vendedor);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", produtos=");
		builder.append(produtos);
		builder.append("]");
		return builder.toString();
	}
	
	
}
	
	
