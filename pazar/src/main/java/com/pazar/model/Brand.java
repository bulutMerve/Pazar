package com.pazar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Brand {
	
	@Id
	@Column(nullable = false)
	private int brandId;
	
	@Column (nullable = false)
	private String brandName;
	
	@Column (nullable = false)
	private boolean active;

}
