package mx.edu.uacm.primerproyectohbm.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(PersonAddressId.class)
public class PersonAddress {

	@Id
	@ManyToOne
	@JoinColumn(name="person_id", insertable=false, updatable=false)
	private Person person;
	
	@Id
	@ManyToOne
	@JoinColumn(name="address_id", insertable=false, updatable=false)
	private Address address;
	
	//Atributo extra
	private String nameOfAddress;
	
	public PersonAddress() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the nameOfAddress
	 */
	public String getNameOfAddress() {
		return nameOfAddress;
	}

	/**
	 * @param nameOfAddress the nameOfAddress to set
	 */
	public void setNameOfAddress(String nameOfAddress) {
		this.nameOfAddress = nameOfAddress;
	}

	public PersonAddress(Person person, Address address, String name) {
		/*this.person = person;
		this.address = address;
		*/
		this(person,address);
		this.nameOfAddress = name;
		
	}

	public PersonAddress(Person person, Address address) {
		this.person = person;
		this.address = address;
	}
	
	/*
	 * Para generar una llave compuesta mediante la idclass hibernate implementa una serie de reglas
	 * hay que implementar serializxable, 
	 * getter y setter, 
	 * redefinir los metodos equals y hashcode
	 */

}
