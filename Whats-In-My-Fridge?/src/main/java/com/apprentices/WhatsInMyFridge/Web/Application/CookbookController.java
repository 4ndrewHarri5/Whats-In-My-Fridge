package com.apprentices.WhatsInMyFridge.Web.Application;

import com.apprentices.WhatsInMyFridge.Entity.Recipe;
import com.apprentices.WhatsInMyFridge.Service.CookbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/cookbook")
public class CookbookController {

    @Autowired
    private CookbookService cookbookService;

    @GetMapping("/{ingredients}")
    public @ResponseBody
    ResponseEntity<List<Recipe>> getRecipesByIngredients(@PathVariable String ingredients) throws IOException {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Access-Control-Allow-Origin", "*");
        return new ResponseEntity<>(cookbookService.getRecipesFromIngredients(ingredients), responseHeaders, HttpStatus.OK);
    }

}
