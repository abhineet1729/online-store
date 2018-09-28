package abhineet1729.storebackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import abhineet1729.storebackend.dao.CategoryDAO;
import abhineet1729.storebackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("abhineet1729.storebackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	
/*	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Bread, Cereal, Rice and Pasta");
		category.setDescription("This section corresponds with the grocery store aisles containing breads, pastas, cereals and rice products. It includes dinner rolls, tortillas, pitas, hamburger and hot dog buns. This category may also include bakery items such as pastries.");
		category.setImageURL("https://img.hunkercdn.com/640/photos.demandstudios.com/getty/article/176/12/FFO_029.jpg");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
	}
*/	
/*	
	@Test
	public void testGetCategory() {
		
		category = categoryDAO.get(3);
		
		
		assertEquals("Successfully fetched a single category from the table!","Bread, Cereal, Rice and Pasta",category.getName());
		
		
	}
*/
	
/*	
	@Test
	public void testUpdateCategory() {
		
		category = categoryDAO.get(3);
		
		category.setName("Bakery");
		
		assertEquals("Successfully updated a single category in the table!",true,categoryDAO.update(category));
		
		
	}
*/
/*
	@Test
	public void testDeleteCategory() {
		
		category = categoryDAO.get(3);		
		assertEquals("Successfully deleted a single category in the table!",true,categoryDAO.delete(category));
		
		
	}
*/
/*	
	@Test
	public void testListCategory() {
					
		assertEquals("Successfully fetched the list of categories from the table!",2,categoryDAO.list().size());
		
		
	}
*/	

	
	@Test
	public void testCRUDCategory() {
		
		// add operation
		category = new Category();
		
		category.setName("Dairy");
		category.setDescription("Milk, creams, sour cream and yogurt are all part of the dairy section of the grocery store. Other items that should be categorized as dairy products are cheeses, eggs and egg substitutes");
		category.setImageURL("https://img.hunkercdn.com/640/photos.demandstudios.com/getty/article/187/225/85007202.jpg");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
		category = new Category();
		
		category.setName("Bread, Cereal, Rice and Pasta");
		category.setDescription("This section corresponds with the grocery store aisles containing breads, pastas, cereals and rice products. It includes dinner rolls, tortillas, pitas, hamburger and hot dog buns. This category may also include bakery items such as pastries.");
		category.setImageURL("https://img.hunkercdn.com/640/photos.demandstudios.com/getty/article/176/12/FFO_029.jpg");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));

		
		// fetching and updating the category
		category = categoryDAO.get(2);
		
		category.setName("Bakery");
		
		assertEquals("Successfully updated a single category in the table!",true,categoryDAO.update(category));
		
		
		// delete the category
		assertEquals("Successfully deleted a single category in the table!",true,categoryDAO.delete(category));
		
		
		//fetching the list
		assertEquals("Successfully fetched the list of categories from the table!",1,categoryDAO.list().size());		
				
		
	}
	
	
}