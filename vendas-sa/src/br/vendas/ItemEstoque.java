package br.vendas;

public class ItemEstoque {
	
	private Produto produto;
	private Integer qtdeProduto = 0;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQtdeProduto() {
		return qtdeProduto;
	}
	public void setQtdeProduto(Integer qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
	}
	
	
		
}
