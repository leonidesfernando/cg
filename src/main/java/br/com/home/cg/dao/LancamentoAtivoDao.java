package br.com.home.cg.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.home.cg.modelo.LancamentoAtivo;

@Repository
public class LancamentoAtivoDao {

	@Autowired
	private EntityManager em;
	
	
	public void salva(LancamentoAtivo lancamento){
		
		if (lancamento.getId() == null) {
			em.persist(lancamento);
		}else{
			em.merge(lancamento);
		}
	}
}
