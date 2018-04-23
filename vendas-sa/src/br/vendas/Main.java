package br.vendas;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		
		Produto mouse = new Produto();
		mouse.setCodBarras("00001");
		mouse.setDescricao("Multilaser");
		mouse.setVlCompra(5f);
		mouse.setVlVenda(10);
		
		Produto teclado = new Produto();
		teclado.setCodBarras("00002");
		teclado.setDescricao("Logitec");
		teclado.setVlCompra(10);
		teclado.setVlVenda(20);
		
		System.out.println("Estoque Vazio");
		System.out.println(estoque);
		estoque.adicionarItemNoEstoque(mouse,10);
		estoque.adicionarItemNoEstoque(mouse,10);
		estoque.adicionarItemNoEstoque(teclado,10);
		System.out.println(estoque);
		/***
		 * Vendedor
		 */
		
		ItemEstoque ie = estoque.buscarProdutoPorCodigoDeBarras("00001");
		
		if (ie != null ) {
			System.out.println("Produto encontrado");
			System.out.println(ie.toString());
			
			Integer codPedidoRealizado = estoque.trasnferirItemDeEstoqueParaSeparado("00001", 5, "Roma");
			System.out.println(estoque);
			/**
			 * Estoquista
			 */
			
			estoque.transferirItemDeSeparadoParaVendido(codPedidoRealizado);
			System.out.println(estoque);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
