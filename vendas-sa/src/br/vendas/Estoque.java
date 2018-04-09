package br.vendas;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private List<ItemEstoque> itensNoEstoque;
	private List<ItemSeparado> itensSeparados;
	private List<ItemVendido> itensVendidos;
	private Integer numeroSequencial = 0;
	
	public Estoque() {
		this.itensNoEstoque = new ArrayList<>();
		this.itensSeparados = new ArrayList<>();
		this.itensVendidos  = new ArrayList<>();
		
	}
	
	public ItemEstoque buscarProdutoPorCodigoDeBarras(String codBarras) {
		
		for (ItemEstoque item : this.itensNoEstoque) {
			if (item.getProduto().getCodBarras().equals(codBarras)) {
				return item;
			}
		}
		
		return null;
	}
	
	public Boolean trasnferirItemDeEstoqueParaSeparado (String codBarras, Integer qtd, String nomeCliente) {
		
		for (ItemEstoque item : this.itensNoEstoque) {
			if (item.getProduto().getCodBarras().equals(codBarras) && 
				item.getQtdeProduto() >= qtd) {
				
				ItemSeparado itemSeparado;
				itemSeparado = new ItemSeparado(nomeCliente, item.getProduto(), qtd , this.numeroSequencial);
				this.numeroSequencial++;
				this.itensSeparados.add(itemSeparado);
				item.setQtdeProduto(item.getQtdeProduto() - qtd);
				
				return true;
			}
		}
		
		return false;
	}
	
	public Boolean transferirItemDeSeparadoParaVendido (Integer codigoPedido) {
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
