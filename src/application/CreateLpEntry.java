package application;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import entities.LpEntry;

public class CreateLpEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Album Name:");
		String albumName = in.nextLine();
		System.out.print("Artist:");
		String artist = in.nextLine();
		System.out.print("Genre:");
		String genre = in.nextLine();
		System.out.print("Year Released:");
		int year = in.nextInt();
		System.out.print("# of Tracks:");
		int tracks = in.nextInt();
		System.out.print("Length (in Minutes):");
		int length = in.nextInt();
		
		
		
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("LpDbJPA");
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			//working with the object to do whatever needs to be done
			LpEntry toAdd = new LpEntry (albumName, artist, genre, year, tracks, length);
			
			
			em.persist(toAdd);
			em.getTransaction().commit();
			em.close();
			emfactory.close();
	}

}
