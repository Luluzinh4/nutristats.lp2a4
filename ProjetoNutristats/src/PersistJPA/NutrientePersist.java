package PersistJPA;

import java.util.List;

import javax.persistence.EntityManager;

import Model.Nutriente;
import bancoDados.ConnectionFactory;

public class NutrientePersist {
	public List<Nutriente> findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Nutriente> nutrientes = null;
		try {
			nutrientes = em.createQuery("from Nutriente n").getResultList();
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
		return nutrientes;
		
	}
    public List<Nutriente> consultarNutrientePorTipoAlimento(String tipoAlimento) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		List<Nutriente> nutrientes = null;
		try {
			String consulta = "from nutriente n where tipoAlimento like '%"+tipoAlimento+"%'";
	
			nutrientes = em.createQuery(consulta).getResultList();
		} catch (Exception e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
		return nutrientes;
    }
}
