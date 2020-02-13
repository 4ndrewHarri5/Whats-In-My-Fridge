package com.apprentices.WhatsInMyFridge.Service;

import com.apprentices.WhatsInMyFridge.Entity.Recipe;
import com.apprentices.WhatsInMyFridge.Properties;
import com.apprentices.WhatsInMyFridge.Url;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

@Service
public class CookbookService {

    private UrlService urlService;

    public CookbookService(UrlService urlService) {
        this.urlService = urlService;
    }

    public List<Recipe> getRecipesFromIngredients(String ingredients) throws IOException {
        String JsonResponse = urlService.getJSONFromSpoonacular(ingredients);
        ObjectMapper objectMapper = new ObjectMapper();

        return Arrays.asList(objectMapper.readValue(JsonResponse, Recipe[].class));

    }

}
