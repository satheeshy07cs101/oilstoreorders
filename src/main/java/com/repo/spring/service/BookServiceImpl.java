package com.repo.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.repo.spring.dao.BookDao;
import com.repo.spring.model.Book;

@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

  @Autowired
  private BookDao bookDao;

	@Override
	@Transactional
	public List<Book> list1() {
		// TODO Auto-generated method stub

		return bookDao.list();
	}

	@Transactional
	@Override
	public long save(Book book) {
		// TODO Auto-generated method stub
		return bookDao.save(book);
	}

	@Override
	public Book get(long id) {
		// TODO Auto-generated method stub
		return bookDao.get(id);
	}

	@Transactional
	@Override
	public void update(long id, Book book) {
		// TODO Auto-generated method stub
		bookDao.update(id, book);
		
	}

	@Transactional
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		bookDao.delete(id);
		
	}

}
