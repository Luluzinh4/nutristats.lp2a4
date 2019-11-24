package PersistJPA;

import java.util.List;

import javax.persistence.EntityManager;

import Model.Dieta;
import Model.Usuario;
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
	public List<Dieta> pesquisarDietaPorUsuario(int id) {
		EntityManager em = new ConnectionFactory().getConnection();

		List<Dieta> dietas = null;
		try {
			String Consulta = "from Dieta d where usuario_id = "+id+"";
			System.out.println("ENTROU AQUIIIIIIII"+ Consulta);
			
			dietas = em.createQuery(Consulta).getResultList();
			
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA"+dietas.size());
			
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
		return dietas;
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
