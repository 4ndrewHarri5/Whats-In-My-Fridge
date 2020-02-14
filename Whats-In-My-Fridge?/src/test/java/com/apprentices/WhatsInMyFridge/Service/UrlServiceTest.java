package com.apprentices.WhatsInMyFridge.Service;

import com.apprentices.WhatsInMyFridge.Url;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UrlServiceTest {
    private Url urlMock = mock(Url.class);
    private UrlService urlService = new UrlService(urlMock);


    @Disabled
    @Test
    void urlBuildsCorrectly() throws URISyntaxException {
        when(urlMock.getResponseFromSpoonacular()).thenReturn(" ");
//        String ham = urlService.getJSONFromSpoonacular("ham");
//     URL built as: https://api.spoonacular.com/recipes/findByIngredients?apiKey=5e71297c6dce43889571b02ebb35d6b5&ingredients=ham&number=1&ranking=1&ignorePantry=false

    }
}