package br.com.leonardozw.filmsapi.films.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.leonardozw.filmsapi.films.dto.StarWarsApiResponse;
import br.com.leonardozw.filmsapi.films.service.FilmService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class FilmController {
    
    private final FilmService filmService;

    @GetMapping
    public StarWarsApiResponse findAll() {
        return filmService.findAll();
    }

    @GetMapping("title/{title}")
    public StarWarsApiResponse findByMovieTitle(@PathVariable("title") String title) {
        return filmService.findByMovieTitle(title);
    }
}
