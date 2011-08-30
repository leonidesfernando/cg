package br.com.home.cg.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.joda.time.LocalDateTime;

@Entity
@Table(name="lancamento")
public class Lancamento {

	private Long id;
	
	private String descricao;
	
	private LocalDateTime dataLancamento;
	
	private BigDecimal valorLancamento;
	
	private TipoLancamento tipoLancamento;
}
