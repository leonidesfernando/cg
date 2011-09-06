package br.com.home.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CGEntityManagerFactory {

	@Autowired
	private EntityManagerFactory emFactory;
	
	
	public EntityManager getEntityManager(){
		return emFactory.createEntityManager();
	}
}
