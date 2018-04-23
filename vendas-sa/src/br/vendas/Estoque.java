package br.vendas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estoque {
	
	private List<ItemEstoque> itensNoEstoque;
	private List<ItemSeparado> itensSeparados;
	private List<ItemVendido> itensVendidos;
	private Integer numeroSequencial = 0;
	private Float saldoDeCaixa = 0f;
	
	public Estoque() {
		this.itensNoEstoque = new ArrayList<>();
		this.itensSeparados = new ArrayList<>();
		this.itensVendidos  = new ArrayList<>();
		
	}
	
	public void adicionarItemNoEstoque (Produto produto, Integer qde) {
		
		ItemEstoque itemBuscado = buscarProdutoPorCodigoDeBarras(produto.getCodBarras());
		
		if (itemBuscado == null) {
			ItemEstoque ie = new ItemEstoque();
			ie.setProduto(produto);
			ie.setQtdeProduto(qde);
			itensNoEstoque.add(ie);
		}else {
			
			for (ItemEstoque item : this.itensNoEstoque) {
				if (item.getProduto().getCodBarras().equals(produto.getCodBarras())) {
					item.setQtdeProduto(item.getQtdeProduto() + qde);
				}
			}
		}
		
	}
	
	public ItemEstoque buscarProdutoPorCodigoDeBarras(String codBarras) {
		
		for (ItemEstoque item : this.itensNoEstoque) {
			if (item.getProduto().getCodBarras().equals(codBarras)) {
				return item;
			}
		}
		
		return null;
	}
	
	public Integer trasnferirItemDeEstoqueParaSeparado (String codBarras, Integer qtd, String nomeCliente) {
		
		for (ItemEstoque item : this.itensNoEstoque) {
			if (item.getProduto().getCodBarras().equals(codBarras) && 
				item.getQtdeProduto() >= qtd) {
				
				ItemSeparado itemSeparado;
				itemSeparado = new ItemSeparado(nomeCliente, item.getProduto(), qtd , this.numeroSequencial);
				this.numeroSequencial++;
				this.itensSeparados.add(itemSeparado);
				item.setQtdeProduto(item.getQtdeProduto() - qtd);
				
				return itemSeparado.getCodigoPedido();
			}
		}
		
		return 0;
	}
	
	public Boolean transferirItemDeSeparadoParaVendido (Integer codigoPedido) {
		
		for (ItemSeparado it : this.itensSeparados) {
			if (codigoPedido.equals(it.getCodigoPedido())) {
				ItemVendido itemVendido = new ItemVendido(new Date(), it);
				this.itensVendidos.add(itemVendido);
				float vlPedido = itemVendido.getProduto().getVlVenda()*itemVendido.getQtde();
				this.saldoDeCaixa +=  vlPedido;
				
			}
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "Estoque [itensNoEstoque=" + itensNoEstoque + ", itensSeparados=" + itensSeparados + ", itensVendidos="
				+ itensVendidos + ", numeroSequencial=" + numeroSequencial + ", saldoDeCaixa=" + saldoDeCaixa + "]";
	}

	
}
