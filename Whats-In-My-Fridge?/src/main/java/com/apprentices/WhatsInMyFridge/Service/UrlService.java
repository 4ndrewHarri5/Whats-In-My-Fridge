package com.apprentices.WhatsInMyFridge.Service;

import com.apprentices.WhatsInMyFridge.Properties;
import com.apprentices.WhatsInMyFridge.Url;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class UrlService {

    public String getJSONFromSpoonacular(String ingredients) {
        String JsonResponse = "";
        try {
            JsonResponse = Url.builder()
                    .setScheme("https")
                    .setHost("api.spoonacular.com")
                    .setPath("/recipes/findByIngredients")
                    .addParameter("apiKey", Properties.API_KEY)
                    .addParameter("ingredients", ingredients)
                    .addParameter("number", "1")
                    .addParameter("ranking", "1")
                    .addParameter("ignorePantry", "false")
                    .getResponseFromSpoonacular();
        }catch(URISyntaxException e){
            e.printStackTrace();
        }
        return JsonResponse;
    }
}
