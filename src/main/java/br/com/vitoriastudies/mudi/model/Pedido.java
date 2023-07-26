package br.com.vitoriastudies.mudi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_pedido")
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome_produto")
	private String nomeProduto;
	
	@Column(name="valor_negociado")
	private BigDecimal valorNegociado;
	
	@Column(name="data_entrega")
	private LocalDate dataDaEntrega;
	
	@Column(name="url_produto",length=900)
	private String urlPorduto;
	
	@Column(name="url_imagem",length=900)
	private String urlImagem;
	
	@Column(name="descricao",length=1500)
	private String descricao;
	
	
	public Pedido() {
		
	}
	
	
	public Pedido(Long id,String nomeProduto, BigDecimal valorNegociado, LocalDate dataDaEntrega, String urlPorduto,
			String urlImagem, String descricao) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.valorNegociado = valorNegociado;
		this.dataDaEntrega = dataDaEntrega;
		this.urlPorduto = urlPorduto;
		this.urlImagem = urlImagem;
		this.descricao = descricao;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}


	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}


	public LocalDate getDataDaEntrega() {
		return dataDaEntrega;
	}


	public void setDataDaEntrega(LocalDate dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}


	public String getUrlPorduto() {
		return urlPorduto;
	}


	public void setUrlPorduto(String urlPorduto) {
		this.urlPorduto = urlPorduto;
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


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
