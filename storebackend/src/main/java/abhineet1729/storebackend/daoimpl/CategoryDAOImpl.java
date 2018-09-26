package abhineet1729.storebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import abhineet1729.storebackend.dao.CategoryDAO;
import abhineet1729.storebackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	public static List<Category> categories= new ArrayList<>();
	static 
	{
		Category category= new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is Description For Television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		
		//second category
		category= new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is Description For Mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//third category
		
		category= new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is Description For Laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}
	@Override
	public List<Category> list() 
	{
		// TODO Auto-generated method stub
		return categories;
	}

}
