package com.pazar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private int companyId;
	
	@Column (nullable = false)
	private String companyName;
	
	@Column (nullable = false)
	private String companyAddress;
	
	@Column (nullable = false)
	private String companyPhoneNumber;
	
	@Column (nullable = true)
	private String taxNumber;
	
	@Column (nullable = false)
	private boolean active;

}
