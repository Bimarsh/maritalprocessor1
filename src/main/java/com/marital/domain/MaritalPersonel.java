package com.marital.domain;

import java.time.LocalDateTime;
import java.util.List;

public class MaritalPersonel {
	
	String id;
	String firstName;
	String lastName;
	String personalId;
	String nationality;
	String gender;
	LocalDateTime localDateTime;
	int age;
	List<MaritalPersonel> listOfMatches;
	String personalDescription;
	List<String> hobbies;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPersonalId() {
		return personalId;
	}
	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<MaritalPersonel> getListOfMatches() {
		return listOfMatches;
	}
	public void setListOfMatches(List<MaritalPersonel> listOfMatches) {
		this.listOfMatches = listOfMatches;
	}
	public String getPersonalDescription() {
		return personalDescription;
	}
	public void setPersonalDescription(String personalDescription) {
		this.personalDescription = personalDescription;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

}
