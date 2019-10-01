package pedido;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainPedido {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 21);
		calendario.set(Calendar.MONTH, 11);
		calendario.set(Calendar.YEAR, 2000);
		calendario.set(Calendar.HOUR_OF_DAY, 9);
		calendario.set(Calendar.MINUTE, 59);
		calendario.set(Calendar.SECOND,30);
		Date dtInicio = calendario.getTime();
		
		Calendar calendario1 = Calendar.getInstance();
		calendario1.set(Calendar.DAY_OF_MONTH, 22);
		calendario1.set(Calendar.MONTH, 11);
		calendario1.set(Calendar.YEAR, 2000);
		calendario1.set(Calendar.HOUR_OF_DAY, 10);
		calendario1.set(Calendar.MINUTE, 15);
		calendario1.set(Calendar.SECOND,30);
		Date dtFim = calendario1.getTime();
		
		
		Cliente c = new Cliente ();
		c.setCod(1);
		c.setEmail("email@hotmail.com");
		c.setNome("Vinicius");
		
		Vendedor v = new Vendedor();
		v.setCod(1);
		v.setNome("Caio");
		
		List<Produto> produtos = new ArrayList<Produto>();
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		Produto p4 = new Produto();
		Produto p5 = new Produto();
		
		p1.setCod(1);
		p1.setDescricao("Refri");
		p1.setQuantidade(2);
		p1.setValor(2.5);
		produtos.add(p1);
		
		p2.setCod(2);
		p2.setDescricao("Batata Frita");
		p2.setQuantidade(2);
		p2.setValor(4.5);
		produtos.add(p2);
		
		p3.setCod(3);
		p3.setDescricao("X-Bacon");
		p3.setQuantidade(2);
		p3.setValor(18);
		produtos.add(p3);
		
		p4.setCod(4);
		p4.setDescricao("Refri");
		p4.setQuantidade(2);
		p4.setValor(2.5);
		
		p5.setCod(4);
		p5.setDescricao("X-Salada");
		p5.setQuantidade(1);
		p5.setValor(2.5);
		
		Pedido p = new Pedido();
		p.setCliente(c);
		p.setCod(1);
		p.setProdutos(produtos);
		p.setVendedor(v);
		p.setDtInicio(dtInicio);
		p.setDtFim(dtFim);

		System.out.println(p);
		System.out.println(p.verificaProdutoUnico(p4));
		System.out.println(p.addProduto(p5));
		System.out.println(p);
		System.out.println("Total Item: " + p5.totalItem());
		System.out.println("Total Pedido: " +p.totalPedido());
		System.out.println("Valor Médio: "+p.valorMedio());
		System.out.println(p.quantidadeMaior(1));
		System.out.println(p.emailCliente());
		System.out.println(p.nomeVendedor());
		System.out.println(p.buscaProdutoDescricao("X-"));
		System.out.println(p.dias());
		
		
		
	}

}
