package com.apprentices.WhatsInMyFridge;

import com.apprentices.WhatsInMyFridge.Enitiy.CookBook;
import com.apprentices.WhatsInMyFridge.Enitiy.Recipie;
import com.apprentices.WhatsInMyFridge.Service.CookbookService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Application{

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);

//		UrlCreator urlCreator = new UrlCreator();
//		System.out.println("response " + urlCreator.getAPIResponse());
//
//		CookbookService cookbookService = new CookbookService();
//		List<Recipie> recipesFromIngredients = cookbookService.getRecipesFromIngredients("eggs, ham");
//		System.out.println("recipesFromIngredients = " + recipesFromIngredients);

	}

}