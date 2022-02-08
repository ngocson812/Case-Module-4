package com.example.casemd4.service;

import com.example.casemd4.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IMovieService {
    public Page<Movie> findAll(Pageable pageable);
    public void save(Movie movie);
    public void delete(int id);
    public Optional<Movie> findById(int id);
//    public Page<Movie> findByName(Pageable pageable, String name);
}
