package br.com.starwarsapi.filmsapi.films.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/*Lista os filmes da Saga por titulo, episodio, diretor, produtos, descrição completa do episodio,
data do filme, data de quando foi criado*/
public class FilmResponse {
    private String title;

/*Tras qual é o episodio do filme*/
    @JsonProperty("episode_id")
    private Integer episodeId;

/*Tras qual é o diretor do filme*/
    private String director;

/*Tras qual é o produtor do filme*/
    private String producer;

/*Tras qual é a descrição completa do episodio do filme*/
    private String opening_crawl;

/*Tras qual é a data do episodio do filme*/
    @JsonProperty("release_date")
    private String releaseDate;

/*Tras qual foi criado episodio do filme*/
    private String created;




}
