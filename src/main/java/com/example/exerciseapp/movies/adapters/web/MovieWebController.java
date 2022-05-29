package com.example.exerciseapp.movies.adapters.web;

import com.example.exerciseapp.movies.domain.Movie;
import com.example.exerciseapp.movies.ports.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@RequestMapping("/movies")
@RequiredArgsConstructor
@Controller
public class MovieWebController {

    private final MovieService movieService;
    private final WebMovieMapper webMovieMapper;

    @GetMapping("add")
    public String showMovieForm(Model model) {
        var newMovieViewModel = new MovieViewModel();
        newMovieViewModel.setName("Die Hard");
        newMovieViewModel.setDirector("John Mark Tiernen");
        model.addAttribute("newMovie", newMovieViewModel);
        return "movies/movie-form";
    }

//    @PostMapping("save")
//    public String save(@Valid @ModelAttribute("newMovieModel") MovieViewModel newMovie){
//
//        var movieDomain = webMovieMapper.toDomain(newMovie);
//        Movie savedMovie = movieService.save(movieDomain);
//        webMovieMapper.toViewModel(savedMovie);
//
//
//    }

}
