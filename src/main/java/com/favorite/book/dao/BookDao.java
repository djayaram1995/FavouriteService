package com.favorite.book.dao;

import org.springframework.data.repository.CrudRepository;

import com.favorite.book.model.BookDetails;


public interface BookDao extends CrudRepository<BookDetails, Integer> {
	BookDetails findByUrl(String url);
}
