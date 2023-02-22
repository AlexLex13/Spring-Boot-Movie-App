package dev.alex.fstack.servise;

import dev.alex.fstack.model.Movie;
import dev.alex.fstack.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    private List<Movie> allMovies(){
        return movieRepository.findAll();
    }
}
