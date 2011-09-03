package br.com.home.cg.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.LocalDateTime;

@Entity
@Table(name="lancamento")
public class Lancamento implements PK<LocalDateTime> {

	
	@Id
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dataLancamento;
	
	@Column(length=128)
	private String descricao;
	
	@Column(precision=8, scale=2)
	private BigDecimal valorLancamento;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private TipoLancamento tipoLancamento;

	
	@Override
	public LocalDateTime getId() {
		return dataLancamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDateTime dataLancamento) {
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
