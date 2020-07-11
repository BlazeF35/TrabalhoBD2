package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Aeronave;
import utils.HibernateUtil;

public class AeronaveDAO {
	public void getAllAeronaves() {
		EntityManager em = HibernateUtil.getEntityManager();
		String ql = "select a from Aeronave a";
		TypedQuery<Aeronave> query = em.createQuery(ql, Aeronave.class);
		List<Aeronave> projects = query.getResultList();
		System.out.println("Aeronave: " + projects);

	}

	public void insertNewAeronave(Aeronave a) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		System.out.println("Valor gerado pelo insert na tabela Aeronave: " + a.getNome_aeronave());
	}

	public void updateAeronave(Aeronave a) {
		EntityManager em = HibernateUtil.getEntityManager();
		Aeronave aux = em.find(Aeronave.class, a.getId_aeronave());
		if (aux != null) {
			em.getTransaction().begin();
			em.merge(a);
			em.getTransaction().commit();
		} else {
			System.out.println("Aeronave " + a.getId_aeronave() + " não encontrado.");
		}
	}

	public void deleteAeronave(Integer id) {
		EntityManager em = HibernateUtil.getEntityManager();
		Aeronave aux = em.find(Aeronave.class, id);
		if (aux != null) {
			em.getTransaction().begin();
			em.remove(aux);
			em.getTransaction().commit();
		} else {
			System.out.println("Aeronave " + id + " não encontrado.");
		}
	}

}
