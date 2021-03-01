package com.mhr.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhr.category.model.Category;
import com.mhr.category.service.CategoryService;

@RestController
@CrossOrigin
@RequestMapping(value = "/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/add")
	public ResponseEntity<Category> save(@RequestBody Category category){
		category.setId((long) 0);
		return new ResponseEntity<Category>( this.categoryService.saveOneCategory(category) , HttpStatus.CREATED );
	}
	
	@GetMapping("/shows")
	public ResponseEntity<List<Category>> findAll(){
		return new ResponseEntity<List<Category>>( this.categoryService.findAllCategiry() , HttpStatus.OK);
	}
	
	@GetMapping("/show/{categoryId}")
	public ResponseEntity<Category> findOne(@PathVariable("categoryId") Long categoryId){
		return new ResponseEntity<Category>(this.categoryService.findOneCategory(categoryId),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{categoryId}")
	public ResponseEntity<?> deleteOnCategory(@PathVariable("categoryId") Long categoryId) {
		this.categoryService.deleteOneCategory(categoryId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/deletes")
	public ResponseEntity<?> deleteAllCategory(){
		this.categoryService.deleteAllCategory();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category){
		return new ResponseEntity<Category>(this.categoryService.saveOneCategory(category),HttpStatus.OK);
	}
	
}
