package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface IProductRepository extends JpaRepository<Product,Integer>{

	//where pcode=?
	List<Product> findByProdCode(String prodCode);
	
	
	//where pcost<? or pcost>=?
	List<Product> findByProdCostLessThan(Double prodCost);
	
	//where pcode is not null
	List<Product> findByProdCodeIsNotNull();
	List<Product> findByProdCodeIsNull();
	
	//where pcode in clause...
	List<Product> findByProdCodeIn(List<String> prodCode);
	
	//where pcost between clause...
	List<Product> findByProdCostBetween(Double prodCost1,Double prodCost2);
}
