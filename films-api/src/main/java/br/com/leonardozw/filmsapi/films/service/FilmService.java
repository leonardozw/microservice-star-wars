package br.com.leonardozw.filmsapi.films.service;

import org.springframework.stereotype.Service;

import br.com.leonardozw.filmsapi.films.client.FilmClient;
import br.com.leonardozw.filmsapi.films.dto.StarWarsApiResponse;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FilmService {
    
    private final FilmClient filmClient;

    public StarWarsApiResponse findAll() {
        return filmClient.findAll().orElseThrow();
    }

    public StarWarsApiResponse findByMovieTitle(String title) {
        return filmClient.findByMovieTitle(title).orElseThrow();
    }
}
