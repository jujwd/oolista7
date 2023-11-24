package exercicio1;

import java.util.List;

public class Programa {

	public static void main(String[] args) {

		Produto meiaNike = new Produto();
		meiaNike.setNome("Meias Nike");
		meiaNike.setDescricao("Marca Nike");
		meiaNike.setValor(10.00);

		Produto meiaLupo = new Produto();
		meiaLupo.setNome("Meias");
		meiaLupo.setDescricao("Meia Lupo");
		meiaLupo.setValor(20.00);

		Produto tenisNike = new Produto();
		tenisNike.setNome("Tenis");
		tenisNike.setDescricao("Tenis Nike");
		tenisNike.setValor(800.00);

		Produto camisetaNike = new Produto();
		camisetaNike.setNome("Camiseta");
		camisetaNike.setDescricao("Camiseta Nike");
		camisetaNike.setValor(50.00);

		Produto camisetaLacoste = new Produto();
		camisetaLacoste.setNome("Camiseta Lacoste");
		camisetaLacoste.setDescricao("Camiseta Lacoste");
		camisetaLacoste.setValor(40.00);

		Produto tenisAdidas = new Produto();
		tenisAdidas.setNome("Tenis");
		tenisAdidas.setDescricao("Tenis Adidas");
		tenisAdidas.setValor(500.00);
		// Criado a lista de produtos
		Produtos produtos = new Produtos();
		// Adicionado produtos na lista
		produtos.adicionarProduto(meiaNike);
		produtos.adicionarProduto(meiaLupo);
		produtos.adicionarProduto(tenisNike);
		produtos.adicionarProduto(camisetaNike);
		produtos.adicionarProduto(camisetaLacoste);
		produtos.adicionarProduto(tenisAdidas);

		for (Produto produto : produtos.getListaProdutos()) {
			// imprimir os produtos
			System.out.println("Nome: " + produto.getNome() + ", ");
			System.out.println("Descrição: " + produto.getDescricao() + ", ");
			System.out.println("Valor: " + produto.getValor() + "]");
		}
		
		List<Produto> filtrados = produtos.filtrarPorNome("meia");
		// chamando o filtro de produto por nome
		System.out.println();
		System.out.println("Imprimindo Lista Filtrada!");

		// imprimindo lista filtrada
		for (Produto produto : filtrados) {
			System.out.print("Nome = " + produto.getNome() + ", ");
			System.out.print("Descricao = " + produto.getDescricao() + ", ");
			System.out.println("Valor = " + produto.getValor() + "]");
		}

		// imprimindo quantidade por nome
		System.out.println();
		System.out.println(produtos.filtrarQuantidadePorNome("meia"));

	}

}
