package com.example.casemd4.service;

import com.example.casemd4.model.Movie;
import com.example.casemd4.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService implements IMovieService{

    @Autowired
    MovieRepo movieRepo;

    @Override
    public Page<Movie> findAll(Pageable pageable) {
        return movieRepo.findAll(pageable);
    }

    @Override
    public void save(Movie movie) {
        movieRepo.save(movie);
    }

    @Override
    public void delete(int id) {
        movieRepo.deleteById(id);
    }

    @Override
    public Optional<Movie> findById(int id) {
        return movieRepo.findById(id);
    }

    @Override
    public Page<Movie> findByName(Pageable pageable, String name) {
        return (Page<Movie>) movieRepo.findAllByNameContaining(pageable, name);
    }
}
