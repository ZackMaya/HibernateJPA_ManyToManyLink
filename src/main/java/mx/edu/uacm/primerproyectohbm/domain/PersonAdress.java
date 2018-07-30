package mx.edu.uacm.primerproyectohbm.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mx.edu.uacm.primerproyectohbm.domain.Address;

@Entity
//@IdClass   /*pendiente*/
public class PersonAdress {
	@Id
	@ManyToOne
	@JoinColumn(name="person_id",insertable=false,updatable=false)
	private Person person;
	
	@Id
	@ManyToOne
	@JoinColumn(name="adress_id",insertable=false,updatable=false)
	private Address address;
	
	
	//atributo extra
	private String nameOfAddress;

	public PersonAdress() {
		
	}
	
public PersonAdress(Person person, Address address) {
		this.person = person;
		this.address=address;
	}
	
	public PersonAdress(Person person, Address address, String nameOfAddress) {
		this.person = person;
		this.address = address;
		this.nameOfAddress = nameOfAddress;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public Address getAdress() {
		return address;
	}


	public void setAdress(Address adress) {
		this.address = adress;
	}


	public String getNameOfAddress() {
		return nameOfAddress;
	}


	public void setNameOfAddress(String nameOfAddress) {
		this.nameOfAddress = nameOfAddress;
	}
	
	

}
