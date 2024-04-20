package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.*;



@Entity
@Table(name = "car")

public class CarEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String model;	
	private String color;	
	public CarEntity() {
		
	}
	public CarEntity(Long id,String model,String color) {
		this.id=id;
		this.model=model;
		this.color=color;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getColor() {
		return model;
	}
	public void setColor(String color) {
		this.color=color;
	}
}
