package PersistJPA;

import java.util.List;

import javax.persistence.EntityManager;

import Model.Dieta;
import bancoDados.ConnectionFactory;

public class DietaPersist {

	public Dieta save(Dieta Dieta) {
		EntityManager em = new ConnectionFactory().getConnection();
		try {
			em.getTransaction().begin();
			if(Dieta.getId() ==null) {
				em.persist(Dieta);
			}else {
				em.merge(Dieta);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		return Dieta;
	}
	
	public Dieta findById(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		Dieta u =null;
		try {
			u = em.find(Dieta.class, id);
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
		return u;
	}
	
	public List<Dieta> findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Dieta> Dietas = null;
		try {
			Dietas = em.createQuery("from Dieta d").getResultList();
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
		return Dietas;
		
	}
	
	public Dieta remove(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Dieta u =null;
		try {
			u = em.find(Dieta.class, id);
			em.getTransaction().begin();
			em.remove(u);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return u;
	}



}
