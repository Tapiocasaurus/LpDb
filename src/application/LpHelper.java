package application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import entities.LpEntry;

public class LpHelper {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("LpDbJPA");
	EntityManager em = emfactory.createEntityManager();
	
	
	public List<LpEntry> getAllItems(){
		em.getTransaction().begin();
		TypedQuery<LpEntry> allAlbumQuery = em.createQuery("SELECT e FROM LpEntry e", LpEntry.class);
		//allAlbumQuery.setParameter("allAlbums", allAlbums);
		
		List<LpEntry> results = allAlbumQuery.getResultList();
		
		for (LpEntry a : results){
			System.out.println(a.getAlbumName());
		}
		em.close();
		emfactory.close();
		return results;
	}
	
	public LpEntry getFromID(int id){
		em.getTransaction().begin();

		LpEntry getLp = em.find(LpEntry.class, id);
		

		em.close();
		emfactory.close();
		return getLp;
	}
	
	public void UpdateLp(int id, String aN, String aR, String gE, int yE, int tR, int lE ){
		em.getTransaction().begin();
		LpEntry toUpdate = em.find(LpEntry.class, id);
		System.out.println(toUpdate.toString());
		toUpdate.setAlbumName(aN);
		toUpdate.setArtist(aR);
		toUpdate.setGenre(gE);
		toUpdate.setYear(yE);
		toUpdate.setTracks(tR);
		toUpdate.setLength(lE);
		
		//em.persist(toUpdate);	
		em.getTransaction().commit();
		em.close();
		emfactory.close();
	}
	
	public void CreateLp(String aN, String aR, String gE, int yE, int tR, int lE ){
		em.getTransaction().begin();
		LpEntry toAdd = new LpEntry (aN, aR, gE, yE, tR, lE);
		System.out.println(toAdd.toString());
		toAdd.setAlbumName(aN);
		toAdd.setArtist(aR);
		toAdd.setGenre(gE);
		toAdd.setYear(yE);
		toAdd.setTracks(tR);
		toAdd.setLength(lE);
		
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
	}
	
	public void DeleteLp(int id){
		em.getTransaction().begin();
		LpEntry toRemove = em.find(LpEntry.class, id);
		
		em.remove(toRemove);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
	}
	}
	


