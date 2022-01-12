package study.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import study.Book.BookEntity;

public interface MyBookRepository extends JpaRepository<BookEntity, Integer>{

	@Query(value="DELETE FROM BOOK_INFO P WHERE P.BOOK_AUTHER = :AUTHER" , nativeQuery = true)
    public void deletebook(@Param("AUTHER") String name);
	
	@Query(value="SELECT * FROM BOOK_INFO P WHERE P.BOOK_AUTHER= :AUTHER" , nativeQuery = true)
	public BookEntity findByBookName(@Param("AUTHER") String name);
	//public BookEntity findByName(String name);
	
}
