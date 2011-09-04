package br.com.home.cg.modelo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="lancamento")
public class Lancamento implements PK<Date> {

	
	@Id
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataLancamento;
	
	@Column(length=128)
	private String descricao;
	
	@Column(precision=8, scale=2)
	private BigDecimal valorLancamento;
	
	@Column
	@Enumerated
	private TipoLancamento tipoLancamento;

	
	@Override
	public Date getId() {
		return dataLancamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public BigDecimal getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(BigDecimal valorLancamento) {
		this.valorLancamento = valorLancamento;
	}

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}
	
}
