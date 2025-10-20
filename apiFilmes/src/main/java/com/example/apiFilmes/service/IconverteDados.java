package com.example.apiFilmes.service;

public interface IconverteDados {
    <T>  T obterDados(String json, Class<T> classe);
}
