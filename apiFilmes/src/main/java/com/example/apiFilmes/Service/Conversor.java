package com.example.apiFilmes.Service;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Conversor(
        @JsonAlias("Tittle") String titulo
) {
}
