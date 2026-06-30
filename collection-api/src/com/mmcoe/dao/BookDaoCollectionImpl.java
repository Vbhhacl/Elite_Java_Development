package com.mmcoe.dao;

import java.util.List;
import java.util.Optional;
import java.util.Vector;

import com.mmcoe.pojo.Book;

public class BookDaoCollectionImpl implements BookDao {

    private List<Book> books;

    public BookDaoCollectionImpl() {
        books = new Vector<Book>();
    }

    @Override
    public boolean save(Book b) {
        books.add(b);
        return true;
    }

    @Override
    public Optional<Book> find(int isbn) {
        //for (Book b : books) {
         //   if (b.getIsbn() == isbn) {
         //       return b;
         //   }
        //}
       // return null;
        	return books.stream().filter(b -> b.getIsbn()==isbn).findFirst();
        }
        
    
    @Override
    public List<Book> list() {
        return books;
    }

    @Override
    public boolean delete(int isbn) {
        //Book b = find(isbn);

        //if (b != null) {
        //    books.remove(b);
         //   return true;
        //}
        //return false;
    	 return books.removeIf(b->b.getIsbn()==isbn);
    }

    public List<Book> findByPrice(double min, double max) {
       // List<Book> matchingBooks = new Vector<Book>();
        
        //for (Book b : books) {
        //    if (b.getPrice() >= min && b.getPrice() <= max) {
         //       matchingBooks.add(b);
         //   }
       // }
       // return matchingBooks;
            return books.stream().filter(b -> b.getPrice() >= min && b.getPrice() <= max)
                    .collect(java.util.stream.Collectors.toCollection(Vector::new));
        }
    }