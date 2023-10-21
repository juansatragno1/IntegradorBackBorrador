package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final IMovieRepository movieRepository;

    @Autowired
    public MovieService(IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public void updateMovie(Long id, Movie updatedMovie) {
        if (movieRepository.existsById(id)) {
            updatedMovie.setId(Math.toIntExact(id));
            movieRepository.save(updatedMovie);
        }
        // Lanza una excepción o maneja el caso si la película no existe
    }

    public void deleteMovie(Long id) {
        if (movieRepository.existsById(id)) {
            movieRepository.deleteById(id);
        }
        // Lanza una excepción o maneja el caso si la película no existe
    }
}

