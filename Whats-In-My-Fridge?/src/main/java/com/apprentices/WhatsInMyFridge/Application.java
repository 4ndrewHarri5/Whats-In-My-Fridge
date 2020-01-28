package com.apprentices.WhatsInMyFridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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