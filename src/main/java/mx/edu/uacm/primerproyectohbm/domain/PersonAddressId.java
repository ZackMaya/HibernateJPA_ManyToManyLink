package mx.edu.uacm.primerproyectohbm.domain;

import java.io.Serializable;

public class PersonAddressId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long person;
	private Long address;

	/**
	 * @return the person
	 */
	public Long getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Long person) {
		this.person = person;
	}

	/**
	 * @return the address
	 */
	public Long getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Long address) {
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonAddressId other = (PersonAddressId) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}
	
	

	
}
