package com.apprentices.WhatsInMyFridge.Service;

import com.apprentices.WhatsInMyFridge.Enitiy.Recipie;
import com.apprentices.WhatsInMyFridge.Properties;
import com.apprentices.WhatsInMyFridge.Url;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

@Service
public class CookbookService {

    public List<Recipie> getRecipesFromIngredients(String ingredients) throws IOException {

        String API_KEY = Properties.API_KEY;

        String JsonResponse = "";

        try {
            JsonResponse = Url.builder()
                    .setScheme("https")
                    .setHost("api.spoonacular.com")
                    .setPath("/recipes/findByIngredients")
                    .addParameter("apiKey", API_KEY)
                    .addParameter("ingredients", ingredients)
                    .addParameter("number", "1")
                    .addParameter("ranking", "1")
                    .addParameter("ignorePantry", "false")
                    .getResponseFromSpoonacular();
        }catch(URISyntaxException e){
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();

        return Arrays.asList(objectMapper.readValue(JsonResponse, Recipie[].class));

    }

}
