package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import study.Book.BookDao;
import study.Book.BookEntity;

@Controller  
public class BookController {
	
	@Autowired
	BookDao dao ;
	
	@GetMapping(path="/remove")
	public String allbook(Model model)
	{
		model.addAttribute("books" , dao.getallBooks());
		return "showbook";
	}
	
	
	@GetMapping(path="/delete")
	public String  deletebook(@RequestParam String book)
	{
	     dao.getBook(book);
	     return "deletebook";
	}
	
	@GetMapping(path="/add")
	public String  add(@RequestParam String name , @RequestParam int id , @RequestParam int cost,  @RequestParam String auther)
	{
		 BookEntity bk = new BookEntity(id , name , auther , cost); 
		dao.addbook(bk);
		return "insert";
	}
	
	@GetMapping(path="/addProd")
	public String gotoadd()
	{
		return "addProduct";
	}
}
