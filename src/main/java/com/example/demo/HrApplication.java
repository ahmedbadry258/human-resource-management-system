package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.RegionRepository;
@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class HrApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RegionRepository regionRepository;
	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Hello World");
//		Region region= new Region();
//		region.setRegionId(5);
//		region.setRegionName("Egypt");
//		regionRepository.save(region);
//		System.out.println(regionRepository.findAll().size());
//		regionRepository.findAll().forEach(x->{
//				
//			System.out.println(x.getRegionId());
//			System.out.println(x.getRegionName());	
//		});
	}

}
