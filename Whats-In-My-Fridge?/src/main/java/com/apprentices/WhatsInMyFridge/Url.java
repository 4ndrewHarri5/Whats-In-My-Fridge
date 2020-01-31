package com.apprentices.WhatsInMyFridge;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.web.reactive.function.client.WebClient;
import java.net.URI;
import java.net.URISyntaxException;

public class Url {

    private Url() {

    }

    public static Url builder() {
        return new Url();
    }

    private URIBuilder uriBuilder = new URIBuilder();

    public Url setScheme(String scheme) {
        uriBuilder.setScheme(scheme);
        return this;
    }

    public Url setHost(String host) {
        uriBuilder.setHost(host);
        return this;
    }

    public Url setPath(String path) {
        uriBuilder.setPath(path);
        return this;
    }

    public Url addParameter(String param, String value) {
        uriBuilder.addParameter(param, value);
        return this;
    }

    public String getResponseFromSpoonacular() throws URISyntaxException {
        URI uri = uriBuilder.build();
        WebClient webClient = WebClient.create();

        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}
