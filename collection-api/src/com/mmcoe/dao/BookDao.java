package com.mmcoe.dao;

import com.mmcoe.pojo.Book;
import java.util.List;
import java.util.Optional;

public interface BookDao {
	boolean save(Book b);
	Optional<Book> find (int isbn);
	List<Book> list();
	boolean delete(int isbn);
	List<Book> findByPrice (double min, double max);
	
}
