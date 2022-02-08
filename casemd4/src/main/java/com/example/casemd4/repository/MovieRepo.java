package com.example.casemd4.repository;

import com.example.casemd4.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


public interface MovieRepo extends PagingAndSortingRepository<Movie, Integer> {
//    Page<Movie> findAllByNameContaining(Pageable pageable, String name);
    Page<Movie> findAll(Pageable pageable);
}
