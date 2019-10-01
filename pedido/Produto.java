package pedido;

public class Produto {

	private int cod;
	private String descricao;
	private double valor;
	private int quantidade;
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	 public double totalItem() {
		 return valor * quantidade;
	 }
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [cod=");
		builder.append(cod);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append("]");
		return builder.toString();
	}
	
	
}
