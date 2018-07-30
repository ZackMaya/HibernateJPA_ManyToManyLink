package mx.edu.uacm.primerproyectohbm.domain;

import java.util.ArrayList;
import java.util.List;

import mx.edu.uacm.primerproyectohbm.domain.Address;
import mx.edu.uacm.primerproyectohbm.domain.PersonAddress;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NaturalId;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NaturalId
	private String registrationNumber;
	
	@OneToMany(mappedBy="address",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<PersonAdress> addresses = new ArrayList<>();

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String regNumber) {
		this.registrationNumber = regNumber;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the addresses
	 */
	public List<PersonAdress> getaddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setaddresses(List<PersonAdress> addresses) {
		this.addresses = addresses;
	}
	
	
	public void addAddress(Address address, String name) {
		PersonAdress personAddress = new PersonAdress(this, address, name);
		addresses.add(personAddress);
		//address.getOwners().add(personAddress);
	}

	/**
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @param registrationNumber the registrationNumber to set
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * @return the addresses
	 */
	public List<PersonAdress> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<PersonAdress> addresses) {
		this.addresses = addresses;
	}
	
	/*
	 * NaturalId textBox 17F
	 * clave candidata
	 * llave que nosotros deseamos
	 */
	
	public void removeAddress(Address address) {
		PersonAdress personAddress = new PersonAdress(this, address);
		address.getOwners().remove(personAddress);
		addresses.remove(personAddress);
	}
	
	
}
