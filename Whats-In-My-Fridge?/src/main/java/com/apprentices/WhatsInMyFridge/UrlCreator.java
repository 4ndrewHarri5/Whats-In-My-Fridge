package com.apprentices.WhatsInMyFridge;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.net.URISyntaxException;

public class UrlCreator {

    public String createURL() throws URISyntaxException {

        String API_KEY = Properties.API_KEY;

        URIBuilder uriBuilder = new URIBuilder();

        URI uri = uriBuilder
                .setScheme("https")
                .setHost("api.spoonacular.com")
                .setPath("/recipes/findByIngredients")
                .addParameter("apiKey", API_KEY)
                .addParameter("ingredients", "apples, flour, sugar")
                .addParameter("number", "1")
                .addParameter("ranking", "1")
                .addParameter("ignorePantry", "false")
                .build();

        WebClient webClient = WebClient.create();
        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}
