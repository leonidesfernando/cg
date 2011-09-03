package br.com.home.cg.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="lancamento_ativo")
public class LancamentoAtivo implements PK<Integer> {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LANCAMENTO_ATIVO")
	private Integer id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value=org.hibernate.annotations.CascadeType.ALL)
	private Lancamento lancamento;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private TipoLancamentoAtivo tipo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public TipoLancamentoAtivo getTipo() {
		return tipo;
	}

	public void setTipo(TipoLancamentoAtivo tipo) {
		this.tipo = tipo;
	}
}
