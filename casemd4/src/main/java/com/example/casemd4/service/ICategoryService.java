package com.example.casemd4.service;

import com.example.casemd4.model.Category;
import com.example.casemd4.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    public List<Category> findAll();
    public void save(Category category);
    public void delete(int id);
    public Optional<Category> findById(int id);
    public List<Category> findByName(String nameCategory);
}
