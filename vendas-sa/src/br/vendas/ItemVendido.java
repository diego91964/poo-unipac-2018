package br.vendas;

import java.util.Date;

public class ItemVendido extends ItemSeparado{
	
	private Date dataVenda;

	
	public ItemVendido(Date dataVenda, ItemSeparado itemSeparado) {
		super.setNomeCliente(itemSeparado.getNomeCliente());
		super.setProduto(itemSeparado.getProduto());
		super.setQtde(itemSeparado.getQtde());
		this.dataVenda = dataVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
}
