package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "LOCATIONS")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LOCATION_ID")
	private Long locationId;
	
	@Column(name = "STREET_ADDRESS")
	private String streetAddress;
	
	@Column(name = "POSTAL_CODE")
	private String postalCode;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STATE_PROVINCE")
	private String stateProvince;
	
//	@Column(name = "COUNTRY_ID")
//	private String countryId;
	
	@ManyToOne()
	@JoinColumn(name = "COUNTRY_ID")
	private Country country;
	

}
