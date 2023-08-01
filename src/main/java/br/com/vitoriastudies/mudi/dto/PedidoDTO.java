package br.com.vitoriastudies.mudi.dto;

import java.io.Serializable;

import br.com.vitoriastudies.mudi.model.Pedido;
import br.com.vitoriastudies.mudi.model.enums.StatusPedido;

public class PedidoDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nomeProduto;

	private String urlProduto;

	private String urlImagem;

	private String descricao;
	

	public PedidoDTO() {
		super();
	}

	public PedidoDTO(String nomeProduto, String urlProduto, String urlImagem, String descricao) {
		super();
		this.nomeProduto = nomeProduto;
		this.urlProduto = urlProduto;
		this.urlImagem = urlImagem;
		this.descricao = descricao;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlPorduto) {
		this.urlProduto = urlPorduto;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(urlProduto);
		pedido.setDescricao(descricao);
		pedido.setStatusPedido(StatusPedido.AGUARDANDO);
		return pedido;
	}
	
	
	
}
