package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.*;



@Entity
@Table(name = "employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Long id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "emp_gender")
	private String gender;
	
	@Column(name = "emp_date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "emp_address")
	private String address;
	
	public EmployeeEntity() {
		
	}
	public EmployeeEntity(Long id,String name,String gender, Date dateOfBirth, String address) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.dateOfBirth=dateOfBirth;
		this.address=address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
}
