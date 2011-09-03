package br.com.home.cg.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tipo_lancamento")
public abstract class TipoLancamento {

	private Integer id;
	
	public abstract String getTipo();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
