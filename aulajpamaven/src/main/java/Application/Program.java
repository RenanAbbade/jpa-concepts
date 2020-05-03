package Application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");//O nome da persistenceUnity está no arquivo pom.xml
		
		EntityManager em = emf.createEntityManager();
		
		//Buscando uma pessoa pelo id
		
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
	
		
		em.close();
		
		emf.close();
	}

}
