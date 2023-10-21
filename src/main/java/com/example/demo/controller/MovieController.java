package com.example.demo.controller;

import com.example.demo.model.MovieDto;
import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping
    public void addMovie(@RequestBody MovieDto movieDTO) {
        // Lógica para agregar una nueva película
    }

    @PutMapping("/{id}")
    public void updateMovie(@PathVariable Long id, @RequestBody MovieDto movieDTO) {
        // Lógica para actualizar la película con el ID proporcionado
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        // Lógica para eliminar la película con el ID proporcionado
    }
}
