package br.com.leonardozw.filmsapi.films.client;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.leonardozw.filmsapi.films.dto.StarWarsApiResponse;

@FeignClient(
    url = "${services.star-wars-api.url}",
    name = "filmClient",
    contextId = "filmClient" // This is necessary to avoid conflicts with other Feign clients
)
public interface FilmClient {
    
    @GetMapping
    Optional<StarWarsApiResponse> findAll();

    @GetMapping
    Optional<StarWarsApiResponse> findByMovieTitle(@RequestParam("search") String movieTitle);
}
