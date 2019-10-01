package pedido;

public class Vendedor {

	private int cod;
	private String nome;
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vendedor [cod=");
		builder.append(cod);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
}
