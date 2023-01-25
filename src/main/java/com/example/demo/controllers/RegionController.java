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

import com.example.demo.entities.Region;
import com.example.demo.repositories.RegionRepository;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/regions")
public class RegionController {
	@Autowired
	private RegionRepository regionRepository;

	
	@GetMapping
	public List<Region> findAll(){
		return regionRepository.findAll();
	}
	@GetMapping("/{id}")
	public Region findRegionById(@PathVariable ("id") Long id){
		return regionRepository.findById(id).get();
	}
	@PostMapping
	public Region saveRegion(@RequestBody Region region){
		regionRepository.save(region);
		return region;
	}
	@PutMapping("/{id}")
	public Region editRegion(@PathVariable ("id") Long id,@RequestBody Region region){
		Region r=regionRepository.findById(id).get();
		r.setRegionName(region.getRegionName());
		regionRepository.save(r);
		return r;
	}
	@DeleteMapping("/{id}")
	public String deleteRegion(@PathVariable ("id") Long id){
		regionRepository.deleteById(id);
		return "Region has been deleted";
	}

}
