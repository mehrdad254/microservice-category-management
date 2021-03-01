package com.mhr.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhr.category.model.Category;
import com.mhr.category.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category saveOneCategory(Category category) {
		return this.categoryRepository.save(category);
	}
	
	@Override
	public List<Category> findAllCategiry(){
		return this.categoryRepository.findAll();
	}
	
	@Override
	public Category findOneCategory(Long categoryId) {
		return this.categoryRepository.findById(categoryId).orElse(null);
	}
	
	@Override
	public void deleteOneCategory(Long categoryId) {
		this.categoryRepository.deleteById(categoryId);
	}
	
	@Override
	public void deleteAllCategory() {
		this.categoryRepository.deleteAll();
	}
}
