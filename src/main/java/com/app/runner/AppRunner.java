package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.IProductRepository;

@Component
public class AppRunner implements CommandLineRunner{

	@Autowired
	private IProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		/*
		 * repo.saveAll(Arrays.asList( new Product(101,"AA",100.90), new
		 * Product(202,"BB",200.90), new Product(303,"CC",300.90), new
		 * Product(404,"DD",400.90), new Product(505,"EE",500.90) ));
		 */
	//repo.findByProdCode("BB").forEach(System.out::println);
		
    //repo.findByProdCodeIsNotNull().forEach(System.out::println);;
		//repo.findByProdCodeIsNull().forEach(System.out::println);
		
		//repo.findByProdCodeIn(Arrays.asList("AA","CC")).forEach(System.out::println);
		
		repo.findByProdCostBetween(102.0,404.0).forEach(System.out::println);
	}

}
