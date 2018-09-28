package abhineet1729.storebackend.dao;

import java.util.List;

import abhineet1729.storebackend.dto.Category;

public interface CategoryDAO {

	
	
	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
	
}