package com.example.apiFilmes.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") Integer avaliacao,
        @JsonAlias("imdbVotes") String votos,
        @JsonAlias("Genre") String genero,
        @JsonAlias("Actors") String atores,
        @JsonAlias("Poster") String poster,
        @JsonAlias("Plot") String sinopse){


}