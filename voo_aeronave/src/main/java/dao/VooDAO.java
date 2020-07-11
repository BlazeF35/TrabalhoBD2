package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Voo;
import utils.HibernateUtil;

public class VooDAO {

	public void getAllVoos() {
		EntityManager em = HibernateUtil.getEntityManager();
		String ql = "select v from voo v";
		TypedQuery<Voo> query = em.createQuery(ql, Voo.class);
		List<Voo> voo = query.getResultList();
		System.out.println("voos: " + voo);
	}
	
	public void insertNewVoo(Voo v) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();
		System.out.println("Valor gerado pelo insert na tabela aeronave: " + v.getRota());
	}
	
	public void updateVoo(Voo v) {
		EntityManager em = HibernateUtil.getEntityManager();

		Voo voo = em.find(Voo.class, v.getId_voo());
		if (voo != null) {
			em.getTransaction().begin();
			em.merge(v);
			em.getTransaction().commit();
		} else {
			System.out.println("Voo " + v.getId_voo() + " não encontrado.");
		}
	}
	public void deleteVoo(Integer id) {
		EntityManager em = HibernateUtil.getEntityManager();
		Voo voo = em.find(Voo.class, id);
		if (voo != null) {
			em.getTransaction().begin();
			em.remove(voo);
			em.getTransaction().commit();
		} else {
			System.out.println("Voo " + id + " não encontrado.");
		}
	}

}
