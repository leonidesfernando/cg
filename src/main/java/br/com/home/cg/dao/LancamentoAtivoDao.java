package br.com.home.cg.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.home.cg.modelo.LancamentoAtivo;

@Repository
public class LancamentoAtivoDao {

	private EntityManager em;
	
	@Autowired
	private CGEntityManagerFactory factory;

	@PostConstruct
	public void init(){
		
		em = factory.getEntityManager(); 
	}
	
	
	public void salva(LancamentoAtivo lancamento){
		
		if (lancamento.getId() == null) {
			em.persist(lancamento);
		}else{
			em.merge(lancamento);
		}
	}
}
