/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhotelan;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author samsi
 */
public class QueryHotel {

    public void Add (Object object){
        
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("perhotelanPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        try {
                em.persist(object);
                em.getTransaction().commit();
        } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
        } finally {
                em.close();
        }
    }
    
    public void update(long id,String nama_tamu,String alamat_tamu){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("perhotelanPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        em.createQuery("UPDATE Tamu e SET e.Nama_Tamu=?1,e.Alamat_Tamu=?2 WHERE e.id=?3",Tamu.class)
                .setParameter(1, nama_tamu)
                .setParameter(2, alamat_tamu)
                .setParameter(3,id)
                .executeUpdate();       
        em.getTransaction().commit();
  }
    
    
public void hapus(long id){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("perhotelanPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        int hapusyu=em.createQuery("DELETE FROM Tamu e WHERE e.id=:par").setParameter("par", id).executeUpdate();
        em.getTransaction().commit();
}
  public void Show() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("perhotelanPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM Tamu e");
        List<Tamu> result = query.getResultList();
        for (Tamu e : result) {
                 System.out.println("ID tamu :"+ e.getId() + "\n NAMA :" + e.getNama_Tamu()+"\n Alamat :"+ e.getAlamat_Tamu());   
        }
  }
}
