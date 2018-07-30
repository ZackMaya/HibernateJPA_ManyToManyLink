package mx.edu.uacm.primerproyectohbm.test.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import mx.edu.uacm.primerproyectohbm.HibernateJpaManyToManyLinkApplication;
import mx.edu.uacm.primerproyectohbm.domain.Address;
import mx.edu.uacm.primerproyectohbm.domain.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HibernateJpaManyToManyLinkApplication.class)
public class PersonTest {

	@PersistenceContext
	protected EntityManager entityManager;

	@Test
	@Transactional
	@Rollback(false)
	public void testGuardarPersona() {

		// Vamos a crear dos direcciones
		// Vamos a crear a dos personas
		// La persona1 tendra 2 direcciones
		// La persona2 tendra 1 direccion

		Person persona1 = new Person("11-003-0444");
		Person persona2 = new Person("11-003-0326");

		entityManager.persist(persona1);
		entityManager.persist(persona2);

		Address address1 = new Address("STL", "0800");
		Address address2 = new Address("Av. del Arbol", "0700");

		entityManager.persist(address1);
		entityManager.persist(address2);

		// Añadimos a la primera persona las primeras dos direcciones

		persona1.addAddress(address1, "Escuela");
		persona1.addAddress(address2, "Casa");

		// Añadir a la segunda persona uina direccion

		persona2.addAddress(address1, "Escuela");

		
		entityManager.flush();
		
		persona1.removeAddress(address1);
		
		
	}

}
