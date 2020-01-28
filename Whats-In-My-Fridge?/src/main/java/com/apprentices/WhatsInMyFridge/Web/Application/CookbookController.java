package com.apprentices.WhatsInMyFridge.Web.Application;

import com.apprentices.WhatsInMyFridge.Enitiy.Recipie;
import com.apprentices.WhatsInMyFridge.Service.CookbookService;
import org.springframework.beans.factory.annotation.Autowired;
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
    List<Recipie> getRecipesByIngredients(@PathVariable String ingredients) throws IOException {
        return cookbookService.getRecipesFromIngredients(ingredients);
    }

}
