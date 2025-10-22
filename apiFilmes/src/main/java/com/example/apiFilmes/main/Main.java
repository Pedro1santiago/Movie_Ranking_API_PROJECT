package com.example.apiFilmes.main;

import com.example.apiFilmes.model.DadosEpisodio;
import com.example.apiFilmes.model.DadosSerie;
import com.example.apiFilmes.model.DadosTemporada;
import com.example.apiFilmes.service.ConsumoApi;
import com.example.apiFilmes.service.ConversorDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConversorDados conversor = new ConversorDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "4179b99b";

    public void exibirMenu(){
        System.out.println("Digite o nome da serie");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace("","+") + API_KEY);
        var dados = conversor.obterDados(json, DadosSerie.class);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for(int i = 1; i <= dados.totalTemporadas(); i++){
            var jsonTemporada = consumo.obterDados(ENDERECO + nomeSerie.replace("","+") + "&season=" + i + API_KEY);
            var dadosTemporada = conversor.obterDados(jsonTemporada, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }


        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));




    }
}
