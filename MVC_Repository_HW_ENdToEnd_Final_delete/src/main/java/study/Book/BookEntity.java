package study.Book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book_Info")
public class BookEntity {

	@Id
	@Column(name="Book_Id")
	private int id;
	
	@Column(name="book_Name")
	private String name;
	
	@Column(name="Book_Auther")
	private String auther;
	
	@Column(name="Book_Cost")
	private int cost;
	
	
	public BookEntity()
	{
		
	}

	public BookEntity(int id, String name, String auther, int cost) {
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", name=" + name + ", auther=" + auther + ", cost=" + cost + "]";
	}
	
	
	
	
}
