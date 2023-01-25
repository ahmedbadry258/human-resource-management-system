package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Country;

import com.example.demo.repositories.CountryRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/countries")
public class CountryController {
	@Autowired
	private CountryRepository countryRepository;

	
	@GetMapping
	public List<Country> findAll(){
		return countryRepository.findAll();
	}
	@GetMapping("/{id}")
	public Country findCountryById(@PathVariable ("id") String id){
		return countryRepository.findById(id).get();
	}
	@PostMapping
	public Country saveCountry(@RequestBody Country country){
		countryRepository.save(country);
		return country;
	}
	@PutMapping("/{id}")
	public Country editCountry(@PathVariable ("id") String id,@RequestBody Country country){
		Country c=countryRepository.findById(id).get();
		c.setCountryName(country.getCountryName());
		//c.setRegionId(country.getRegionId());
		countryRepository.save(c);
		return c;
	}
	@DeleteMapping("/{id}")
	public String deleteCountry(@PathVariable ("id") String id){
		countryRepository.deleteById(id);
		return "Country has been deleted";
	}

}
