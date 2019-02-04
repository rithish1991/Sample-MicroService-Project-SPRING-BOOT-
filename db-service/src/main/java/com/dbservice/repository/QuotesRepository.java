package com.dbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbservice.model.Quote;

public interface QuotesRepository extends JpaRepository<Quote,Integer> {
	
	
	List<Quote> findByUserName(String userName);

}
