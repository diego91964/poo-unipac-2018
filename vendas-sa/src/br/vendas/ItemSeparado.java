package br.vendas;

public class ItemSeparado {
	
	private String nomeCliente;
	private Produto produto;
	private Integer qtde;
	private Integer codigoPedido;
	
	public ItemSeparado(String nomeCliente, Produto produto, Integer qtde, Integer codigoPedido) {
		super();
		this.nomeCliente = nomeCliente;
		this.produto = produto;
		this.qtde = qtde;
		this.codigoPedido = codigoPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public Integer getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	
}
