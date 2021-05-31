package net.javaguides.springboot.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class UserBB {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotBlank(message = "Name is mandatory")
	@Column(name = "name")
	private String name;

	@NotBlank(message = "Age is mandatory")
	@Column(name = "Age")
	private String Age;
	
	@NotBlank(message = "Blood group is mandatory")
	@Column(name = "Blood_group")
	private String Blood_group;
	
	@Column(name = "phone_no")
	private long phoneNo;
	
	@NotBlank(message = "type is mandatory")
	@Column(name = "type")
	private String type;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getBlood_group() {
		return Blood_group;
	}

	public void setBlood_group(String blood_group) {
		Blood_group = blood_group;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

}
