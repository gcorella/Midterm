
package com.cisc181.core;

public class PersonException extends Exception{
	private Person aperson;
	public PersonException(Person aperson){

		this.aperson = aperson;
	}

	public Person getAperson() {

		return aperson;

	}
}
 