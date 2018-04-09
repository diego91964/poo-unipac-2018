package br.vendas;

public class Produto {
	
	private String descricao;
	private String codBarras;
	private float vlCompra;
	private float vlVenda;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	public float getVlCompra() {
		return vlCompra;
	}
	public void setVlCompra(float vlCompra) {
		this.vlCompra = vlCompra;
	}
	public float getVlVenda() {
		return vlVenda;
	}
	public void setVlVenda(float vlVenda) {
		this.vlVenda = vlVenda;
	}
	
}
