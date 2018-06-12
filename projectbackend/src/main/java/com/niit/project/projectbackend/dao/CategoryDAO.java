package com.niit.project.projectbackend.dao;

import java.util.List;

import com.niit.project.projectbackend.dto.Category;

public interface CategoryDAO {

	List<Category>list();
	Category get(int id);
}
