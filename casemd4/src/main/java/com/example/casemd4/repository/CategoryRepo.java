package com.example.casemd4.repository;

import com.example.casemd4.model.Category;
import com.example.casemd4.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoryRepo extends PagingAndSortingRepository<Category, Integer> {
    List<Category> findAllByNameCategoryContaining(String nameCategory);
}
