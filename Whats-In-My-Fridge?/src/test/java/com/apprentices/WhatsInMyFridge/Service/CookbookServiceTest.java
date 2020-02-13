package com.apprentices.WhatsInMyFridge.Service;

import com.apprentices.WhatsInMyFridge.Entity.Recipe;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CookbookServiceTest {
    private UrlService urlServiceMock = mock(UrlService.class);
    private CookbookService victim = new CookbookService(urlServiceMock);
    private String inputIngredient;
    private List<Recipe> recipesFromIngredients;


    @Test
    void getRecipesFromIngredients() throws IOException {
        givenListOfIngredients();
        givenJsonResponseFromSpoonacular();
        whenGetRecipesFromInitialIngredients();
        assertEquals(1, recipesFromIngredients.size());
    }

    private void whenGetRecipesFromInitialIngredients() throws IOException {
        recipesFromIngredients = victim.getRecipesFromIngredients(inputIngredient);
    }

    private void givenListOfIngredients() {
        inputIngredient = "eggs";
    }

    private void givenJsonResponseFromSpoonacular(){
        String responseJSON = "[{\"id\":1064833," +
                "\"title\":\"Perfect Instant Pot Hard Boiled Eggs\"," +
                "\"image\":\"https://spoonacular.com/recipeImages/1064833-312x231.jpg\"," +
                "\"imageType\":\"jpg\"," +
                "\"usedIngredientCount\":1," +
                "\"missedIngredientCount\":0," +
                "\"missedIngredients\":[]," +
                "\"usedIngredients\":[{\"id\":1123,\"amount\":12.0,\"unit\":\"\",\"unitLong\":\"\",\"unitShort\":\"\",\"aisle\":" +
                "\"Milk, Eggs, Other Dairy\",\"name\":\"eggs\",\"original\":\"12 Eggs\",\"originalString\":\"12 Eggs\",\"originalName\":\"Eggs\"," +
                "\"metaInformation\":[],\"meta\":[],\"image\":\"https://spoonacular.com/cdn/ingredients_100x100/egg.png\"}]," +
                "\"unusedIngredients\":[],\"likes\":1}]";
        when(urlServiceMock.getJSONFromSpoonacular(inputIngredient)).thenReturn(responseJSON);
    }
}