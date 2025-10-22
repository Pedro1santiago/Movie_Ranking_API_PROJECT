package com.example.apiFilmes.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("Year") String ano,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") String avaliacao) { }