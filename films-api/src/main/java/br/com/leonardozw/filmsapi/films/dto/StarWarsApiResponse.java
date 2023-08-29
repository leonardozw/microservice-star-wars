package br.com.leonardozw.filmsapi.films.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StarWarsApiResponse {
    
    private List<FilmResponse> results;

}
