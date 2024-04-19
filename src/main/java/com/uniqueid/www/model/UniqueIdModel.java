package com.uniqueid.www.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class UniqueIdModel 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uniqueId;
	
	private String fullName;
	
	private String userName;
	
	private String email;
	
	private String password;
	
}
