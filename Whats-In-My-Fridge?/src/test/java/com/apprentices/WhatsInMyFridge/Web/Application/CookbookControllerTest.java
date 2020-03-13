package com.apprentices.WhatsInMyFridge.Web.Application;

import com.apprentices.WhatsInMyFridge.Entity.Recipe;
import com.apprentices.WhatsInMyFridge.Service.CookbookService;
import com.apprentices.WhatsInMyFridge.Service.UrlService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@AutoConfigureMockMvc
@ContextConfiguration(classes = {CookbookController.class})
@WebMvcTest()
class CookbookControllerTest {
    private static final String RECIPE_TITLE_WITH_EGGS = "Recipe Title with eggs";
    private List<Recipe> recipesList;

    @Autowired
    private CookbookController cookbookController;


    @MockBean
    private CookbookService service;


    @BeforeEach
    void setUp() {
        recipesList = new ArrayList<>();
    }

    @Test
    public void greetingShouldReturnMessageFromService() throws Exception {
        givenExpectedResponseFromSpoonacular();

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(cookbookController).build();

        MvcResult mvcResult = mockMvc.perform(get("/cookbook/eggs"))
                .andDo(print())
                .andExpect(status().isOk()).andExpect(content().contentType("application/json")).andReturn();

        String content = mvcResult.getResponse().getContentAsString();
        Assertions.assertNotNull(content);
        assertTrue(content.contains(RECIPE_TITLE_WITH_EGGS));

        System.out.println("Output is " + content);
    }

    private void givenExpectedResponseFromSpoonacular() throws IOException {
        Recipe recipe1 = new Recipe();
        recipe1.setId(1);
        recipe1.setTitle(RECIPE_TITLE_WITH_EGGS);
        recipe1.setId(50);
        recipesList.add(recipe1);
        when(service.getRecipesFromIngredients("eggs")).thenReturn(recipesList);
    }

}