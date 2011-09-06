package br.com.home.cg.service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.home.cg.dao.CGEntityManagerFactory;
import br.com.home.cg.modelo.PK;

@Service
@Scope(value="prototype")
public class GenericService<Model extends PK<? extends Object>> {

	
	private EntityManager entityManager;
	
	@Autowired
	private CGEntityManagerFactory factory;

	@PostConstruct
	public void init(){
		
		entityManager = factory.getEntityManager(); 
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void salvar(Model model){
		
		if(model.getId() != null) {
			entityManager.merge(model);
		}else{
			entityManager.persist(model);
		}
	}
}
