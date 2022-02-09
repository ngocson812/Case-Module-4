package com.example.casemd4.repository;

import com.example.casemd4.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface MovieRepo extends PagingAndSortingRepository<Movie, Integer> {
    Page<Movie> findAllByNameContaining(Pageable pageable, String name);
}
