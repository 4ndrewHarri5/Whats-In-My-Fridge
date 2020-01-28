package com.apprentices.WhatsInMyFridge;

import com.apprentices.WhatsInMyFridge.Enitiy.CookBook;
import com.apprentices.WhatsInMyFridge.Enitiy.Recipie;
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

	public static void main(String[] args) throws URISyntaxException, IOException {
		SpringApplication.run(Application.class, args);

		//UrlCreator urlCreator = new UrlCreator();
		//System.out.println("response " + urlCreator.getAPIResponse());

		String json = "[\n" +
				"    {\n" +
				"        \"id\": 661447,\n" +
				"        \"title\": \"Square Deviled Eggs\",\n" +
				"        \"image\": \"https://spoonacular.com/recipeImages/661447-312x231.jpg\",\n" +
				"        \"imageType\": \"jpg\",\n" +
				"        \"usedIngredientCount\": 2,\n" +
				"        \"missedIngredientCount\": 1,\n" +
				"        \"missedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 1017,\n" +
				"                \"amount\": 1.0,\n" +
				"                \"unit\": \"serving\",\n" +
				"                \"unitLong\": \"serving\",\n" +
				"                \"unitShort\": \"serving\",\n" +
				"                \"aisle\": \"Cheese\",\n" +
				"                \"name\": \"cream cheese\",\n" +
				"                \"original\": \"Cream cheese\",\n" +
				"                \"originalString\": \"Cream cheese\",\n" +
				"                \"originalName\": \"Cream cheese\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/cream-cheese.jpg\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"usedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 1123,\n" +
				"                \"amount\": 1.0,\n" +
				"                \"unit\": \"serving\",\n" +
				"                \"unitLong\": \"serving\",\n" +
				"                \"unitShort\": \"serving\",\n" +
				"                \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
				"                \"name\": \"eggs\",\n" +
				"                \"original\": \"Hard boiled eggs\",\n" +
				"                \"originalString\": \"Hard boiled eggs\",\n" +
				"                \"originalName\": \"Hard boiled eggs\",\n" +
				"                \"metaInformation\": [\n" +
				"                    \"hard\",\n" +
				"                    \"boiled\"\n" +
				"                ],\n" +
				"                \"meta\": [\n" +
				"                    \"hard\",\n" +
				"                    \"boiled\"\n" +
				"                ],\n" +
				"                \"extendedName\": \"cooked eggs\",\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/egg.png\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 10151,\n" +
				"                \"amount\": 1.0,\n" +
				"                \"unit\": \"serving\",\n" +
				"                \"unitLong\": \"serving\",\n" +
				"                \"unitShort\": \"serving\",\n" +
				"                \"aisle\": \"Meat\",\n" +
				"                \"name\": \"ham\",\n" +
				"                \"original\": \"Ham\",\n" +
				"                \"originalString\": \"Ham\",\n" +
				"                \"originalName\": \"Ham\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/ham-whole.jpg\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"unusedIngredients\": [],\n" +
				"        \"likes\": 25\n" +
				"    },\n" +
				"    {\n" +
				"        \"id\": 132462,\n" +
				"        \"title\": \"English Muffins With Eggs, Cheese and Ham\",\n" +
				"        \"image\": \"https://spoonacular.com/recipeImages/132462-312x231.jpg\",\n" +
				"        \"imageType\": \"jpg\",\n" +
				"        \"usedIngredientCount\": 2,\n" +
				"        \"missedIngredientCount\": 1,\n" +
				"        \"missedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 18439,\n" +
				"                \"amount\": 2.0,\n" +
				"                \"unit\": \"\",\n" +
				"                \"unitLong\": \"\",\n" +
				"                \"unitShort\": \"\",\n" +
				"                \"aisle\": \"Bakery/Bread\",\n" +
				"                \"name\": \"english muffins\",\n" +
				"                \"original\": \"2 english muffins\",\n" +
				"                \"originalString\": \"2 english muffins\",\n" +
				"                \"originalName\": \"english muffins\",\n" +
				"                \"metaInformation\": [\n" +
				"                    \"english\"\n" +
				"                ],\n" +
				"                \"meta\": [\n" +
				"                    \"english\"\n" +
				"                ],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/English-muffins.jpg\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"usedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 1123,\n" +
				"                \"amount\": 2.0,\n" +
				"                \"unit\": \"\",\n" +
				"                \"unitLong\": \"\",\n" +
				"                \"unitShort\": \"\",\n" +
				"                \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
				"                \"name\": \"eggs\",\n" +
				"                \"original\": \"2 eggs\",\n" +
				"                \"originalString\": \"2 eggs\",\n" +
				"                \"originalName\": \"eggs\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/egg.png\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 10151,\n" +
				"                \"amount\": 2.0,\n" +
				"                \"unit\": \"slices\",\n" +
				"                \"unitLong\": \"slices\",\n" +
				"                \"unitShort\": \"slice\",\n" +
				"                \"aisle\": \"Meat\",\n" +
				"                \"name\": \"ham\",\n" +
				"                \"original\": \"2 slices ham\",\n" +
				"                \"originalString\": \"2 slices ham\",\n" +
				"                \"originalName\": \"ham\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/ham-whole.jpg\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"unusedIngredients\": [],\n" +
				"        \"likes\": 2\n" +
				"    },\n" +
				"    {\n" +
				"        \"id\": 590704,\n" +
				"        \"title\": \"Crisp Ham and Egg Cups\",\n" +
				"        \"image\": \"https://spoonacular.com/recipeImages/590704-312x231.jpg\",\n" +
				"        \"imageType\": \"jpg\",\n" +
				"        \"usedIngredientCount\": 2,\n" +
				"        \"missedIngredientCount\": 2,\n" +
				"        \"missedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 11297,\n" +
				"                \"amount\": 4.0,\n" +
				"                \"unit\": \"servings\",\n" +
				"                \"unitLong\": \"servings\",\n" +
				"                \"unitShort\": \"servings\",\n" +
				"                \"aisle\": \"Produce\",\n" +
				"                \"name\": \"fresh parsley\",\n" +
				"                \"original\": \"Fresh basil, scallions or parsley, optional\",\n" +
				"                \"originalString\": \"Fresh basil, scallions or parsley, optional\",\n" +
				"                \"originalName\": \"Fresh basil, scallions or parsley, optional\",\n" +
				"                \"metaInformation\": [\n" +
				"                    \"fresh\"\n" +
				"                ],\n" +
				"                \"meta\": [\n" +
				"                    \"fresh\"\n" +
				"                ],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/parsley.jpg\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 1102047,\n" +
				"                \"amount\": 4.0,\n" +
				"                \"unit\": \"servings\",\n" +
				"                \"unitLong\": \"servings\",\n" +
				"                \"unitShort\": \"servings\",\n" +
				"                \"aisle\": \"Spices and Seasonings\",\n" +
				"                \"name\": \"salt and pepper\",\n" +
				"                \"original\": \"Salt and pepper, to taste\",\n" +
				"                \"originalString\": \"Salt and pepper, to taste\",\n" +
				"                \"originalName\": \"Salt and pepper, to taste\",\n" +
				"                \"metaInformation\": [\n" +
				"                    \"to taste\"\n" +
				"                ],\n" +
				"                \"meta\": [\n" +
				"                    \"to taste\"\n" +
				"                ],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/salt-and-pepper.jpg\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"usedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 1123,\n" +
				"                \"amount\": 4.0,\n" +
				"                \"unit\": \"large\",\n" +
				"                \"unitLong\": \"larges\",\n" +
				"                \"unitShort\": \"large\",\n" +
				"                \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
				"                \"name\": \"eggs\",\n" +
				"                \"original\": \"4 large eggs\",\n" +
				"                \"originalString\": \"4 large eggs\",\n" +
				"                \"originalName\": \"eggs\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/egg.png\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 10151,\n" +
				"                \"amount\": 4.0,\n" +
				"                \"unit\": \"slices\",\n" +
				"                \"unitLong\": \"slices\",\n" +
				"                \"unitShort\": \"slice\",\n" +
				"                \"aisle\": \"Meat\",\n" +
				"                \"name\": \"ham\",\n" +
				"                \"original\": \"4 slices Black Forest or Virginia ham\",\n" +
				"                \"originalString\": \"4 slices Black Forest or Virginia ham\",\n" +
				"                \"originalName\": \"Black Forest or Virginia ham\",\n" +
				"                \"metaInformation\": [\n" +
				"                    \"black\"\n" +
				"                ],\n" +
				"                \"meta\": [\n" +
				"                    \"black\"\n" +
				"                ],\n" +
				"                \"extendedName\": \"black ham\",\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/ham-whole.jpg\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"unusedIngredients\": [],\n" +
				"        \"likes\": 17705\n" +
				"    },\n" +
				"    {\n" +
				"        \"id\": 603131,\n" +
				"        \"title\": \"Ham Fried Rice\",\n" +
				"        \"image\": \"https://spoonacular.com/recipeImages/603131-312x231.jpg\",\n" +
				"        \"imageType\": \"jpg\",\n" +
				"        \"usedIngredientCount\": 2,\n" +
				"        \"missedIngredientCount\": 3,\n" +
				"        \"missedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 20444,\n" +
				"                \"amount\": 2.0,\n" +
				"                \"unit\": \"Bags\",\n" +
				"                \"unitLong\": \"Bags\",\n" +
				"                \"unitShort\": \"Bags\",\n" +
				"                \"aisle\": \"Pasta and Rice\",\n" +
				"                \"name\": \"rice\",\n" +
				"                \"original\": \"2 Bags Steamfresh White Rice with Veggies- Cooked\",\n" +
				"                \"originalString\": \"2 Bags Steamfresh White Rice with Veggies- Cooked\",\n" +
				"                \"originalName\": \"Steamfresh White Rice with Veggies- Cooked\",\n" +
				"                \"metaInformation\": [\n" +
				"                    \"white\",\n" +
				"                    \"with veggies- cooked\"\n" +
				"                ],\n" +
				"                \"meta\": [\n" +
				"                    \"white\",\n" +
				"                    \"with veggies- cooked\"\n" +
				"                ],\n" +
				"                \"extendedName\": \"white rice\",\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/uncooked-white-rice.png\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 1102047,\n" +
				"                \"amount\": 4.0,\n" +
				"                \"unit\": \"servings\",\n" +
				"                \"unitLong\": \"servings\",\n" +
				"                \"unitShort\": \"servings\",\n" +
				"                \"aisle\": \"Spices and Seasonings\",\n" +
				"                \"name\": \"salt and pepper\",\n" +
				"                \"original\": \"Salt and Pepper to Taste\",\n" +
				"                \"originalString\": \"Salt and Pepper to Taste\",\n" +
				"                \"originalName\": \"Salt and Pepper to Taste\",\n" +
				"                \"metaInformation\": [\n" +
				"                    \"to taste\"\n" +
				"                ],\n" +
				"                \"meta\": [\n" +
				"                    \"to taste\"\n" +
				"                ],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/salt-and-pepper.jpg\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 16124,\n" +
				"                \"amount\": 4.0,\n" +
				"                \"unit\": \"servings\",\n" +
				"                \"unitLong\": \"servings\",\n" +
				"                \"unitShort\": \"servings\",\n" +
				"                \"aisle\": \"Ethnic Foods;Condiments\",\n" +
				"                \"name\": \"soy sauce\",\n" +
				"                \"original\": \"Soy Sauce- Optional\",\n" +
				"                \"originalString\": \"Soy Sauce- Optional\",\n" +
				"                \"originalName\": \"Soy Sauce- Optional\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/soy-sauce.jpg\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"usedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 1123,\n" +
				"                \"amount\": 2.0,\n" +
				"                \"unit\": \"\",\n" +
				"                \"unitLong\": \"\",\n" +
				"                \"unitShort\": \"\",\n" +
				"                \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
				"                \"name\": \"eggs\",\n" +
				"                \"original\": \"2 Eggs\",\n" +
				"                \"originalString\": \"2 Eggs\",\n" +
				"                \"originalName\": \"Eggs\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/egg.png\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 10151,\n" +
				"                \"amount\": 1.0,\n" +
				"                \"unit\": \"cup\",\n" +
				"                \"unitLong\": \"cup\",\n" +
				"                \"unitShort\": \"cup\",\n" +
				"                \"aisle\": \"Meat\",\n" +
				"                \"name\": \"ham\",\n" +
				"                \"original\": \"1 cup Chopped Ham\",\n" +
				"                \"originalString\": \"1 cup Chopped Ham\",\n" +
				"                \"originalName\": \"Chopped Ham\",\n" +
				"                \"metaInformation\": [\n" +
				"                    \"chopped\"\n" +
				"                ],\n" +
				"                \"meta\": [\n" +
				"                    \"chopped\"\n" +
				"                ],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/ham-whole.jpg\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"unusedIngredients\": [],\n" +
				"        \"likes\": 15\n" +
				"    },\n" +
				"    {\n" +
				"        \"id\": 121442,\n" +
				"        \"title\": \"Dinner Tonight: Omelet Gramajo\",\n" +
				"        \"image\": \"https://spoonacular.com/recipeImages/121442-312x231.jpg\",\n" +
				"        \"imageType\": \"jpg\",\n" +
				"        \"usedIngredientCount\": 1,\n" +
				"        \"missedIngredientCount\": 5,\n" +
				"        \"missedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 1034053,\n" +
				"                \"amount\": 2.0,\n" +
				"                \"unit\": \"tablespoons\",\n" +
				"                \"unitLong\": \"tablespoons\",\n" +
				"                \"unitShort\": \"Tbsp\",\n" +
				"                \"aisle\": \"Oil, Vinegar, Salad Dressing\",\n" +
				"                \"name\": \"extra virgin olive oil\",\n" +
				"                \"original\": \"2 tablespoons extra virgin olive oil\",\n" +
				"                \"originalString\": \"2 tablespoons extra virgin olive oil\",\n" +
				"                \"originalName\": \"extra virgin olive oil\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/olive-oil.jpg\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 93681,\n" +
				"                \"amount\": 4.0,\n" +
				"                \"unit\": \"slices\",\n" +
				"                \"unitLong\": \"slices\",\n" +
				"                \"unitShort\": \"slice\",\n" +
				"                \"aisle\": \"Meat\",\n" +
				"                \"name\": \"jamon iberico\",\n" +
				"                \"original\": \"4 thin slices jamón ibérico (another serrano or proscuitto would also work)\",\n" +
				"                \"originalString\": \"4 thin slices jamón ibérico (another serrano or proscuitto would also work)\",\n" +
				"                \"originalName\": \"thin slices jamón ibérico (another serrano or proscuitto would also work)\",\n" +
				"                \"metaInformation\": [\n" +
				"                    \"thin\",\n" +
				"                    \"(another serrano or proscuitto would also work)\"\n" +
				"                ],\n" +
				"                \"meta\": [\n" +
				"                    \"thin\",\n" +
				"                    \"(another serrano or proscuitto would also work)\"\n" +
				"                ],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/proscuitto.jpg\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 10011355,\n" +
				"                \"amount\": 2.0,\n" +
				"                \"unit\": \"\",\n" +
				"                \"unitLong\": \"\",\n" +
				"                \"unitShort\": \"\",\n" +
				"                \"aisle\": \"Produce\",\n" +
				"                \"name\": \"red potatoes\",\n" +
				"                \"original\": \"2 red potatoes, about 6 ounces each, scrubbed\",\n" +
				"                \"originalString\": \"2 red potatoes, about 6 ounces each, scrubbed\",\n" +
				"                \"originalName\": \"red potatoes, about 6 ounces each, scrubbed\",\n" +
				"                \"metaInformation\": [\n" +
				"                    \"red\",\n" +
				"                    \"scrubbed\"\n" +
				"                ],\n" +
				"                \"meta\": [\n" +
				"                    \"red\",\n" +
				"                    \"scrubbed\"\n" +
				"                ],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/red-potatoes.jpg\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 1102047,\n" +
				"                \"amount\": 4.0,\n" +
				"                \"unit\": \"servings\",\n" +
				"                \"unitLong\": \"servings\",\n" +
				"                \"unitShort\": \"servings\",\n" +
				"                \"aisle\": \"Spices and Seasonings\",\n" +
				"                \"name\": \"salt and pepper\",\n" +
				"                \"original\": \"salt and pepper\",\n" +
				"                \"originalString\": \"salt and pepper\",\n" +
				"                \"originalName\": \"salt and pepper\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/salt-and-pepper.jpg\"\n" +
				"            },\n" +
				"            {\n" +
				"                \"id\": 4513,\n" +
				"                \"amount\": 2.0,\n" +
				"                \"unit\": \"cups\",\n" +
				"                \"unitLong\": \"cups\",\n" +
				"                \"unitShort\": \"cup\",\n" +
				"                \"aisle\": \"Oil, Vinegar, Salad Dressing\",\n" +
				"                \"name\": \"vegetable oil\",\n" +
				"                \"original\": \"2 cups vegetable oil\",\n" +
				"                \"originalString\": \"2 cups vegetable oil\",\n" +
				"                \"originalName\": \"vegetable oil\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/vegetable-oil.jpg\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"usedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 1123,\n" +
				"                \"amount\": 4.0,\n" +
				"                \"unit\": \"large\",\n" +
				"                \"unitLong\": \"larges\",\n" +
				"                \"unitShort\": \"large\",\n" +
				"                \"aisle\": \"Milk, Eggs, Other Dairy\",\n" +
				"                \"name\": \"eggs\",\n" +
				"                \"original\": \"4 large eggs\",\n" +
				"                \"originalString\": \"4 large eggs\",\n" +
				"                \"originalName\": \"eggs\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/egg.png\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"unusedIngredients\": [\n" +
				"            {\n" +
				"                \"id\": 10151,\n" +
				"                \"amount\": 1.0,\n" +
				"                \"unit\": \"serving\",\n" +
				"                \"unitLong\": \"serving\",\n" +
				"                \"unitShort\": \"serving\",\n" +
				"                \"aisle\": \"Meat\",\n" +
				"                \"name\": \"ham\",\n" +
				"                \"original\": \"ham\",\n" +
				"                \"originalString\": \"ham\",\n" +
				"                \"originalName\": \"ham\",\n" +
				"                \"metaInformation\": [],\n" +
				"                \"meta\": [],\n" +
				"                \"image\": \"https://spoonacular.com/cdn/ingredients_100x100/ham-whole.jpg\"\n" +
				"            }\n" +
				"        ],\n" +
				"        \"likes\": 0\n" +
				"    }\n" +
				"]";

		ObjectMapper objectMapper = new ObjectMapper();
		List<Recipie> cookBook = Arrays.asList(objectMapper.readValue(json, Recipie[].class));


	}

}