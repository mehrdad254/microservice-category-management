package com.mhr.category.service;

import java.util.List;

import com.mhr.category.model.Category;

public interface CategoryService {
	
	Category saveOneCategory(Category category);

	List<Category> findAllCategiry();

	Category findOneCategory(Long categoryId);

	void deleteOneCategory(Long categoryId);

	void deleteAllCategory();

}
