package study.Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import study.Repository.MyBookRepository;

@Repository
public class BookDao {

	@Autowired
	MyBookRepository repo;

	public List<BookEntity> getallBooks()
	{
		return repo.findAll();
	}
	
	public void getBook(String name)
	{
		BookEntity entity = repo.findByBookName(name);
		System.out.println(entity);
		repo.delete(entity);
	}

	public void addbook(BookEntity bk) {
		repo.save(bk);
		System.out.println("Inserted Succesfully...!!!!");
		
	}
	
}
