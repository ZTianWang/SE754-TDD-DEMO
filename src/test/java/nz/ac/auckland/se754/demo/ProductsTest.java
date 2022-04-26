package nz.ac.auckland.se754.demo;

/*
* Within the search bar, the user is able to type any key words they want relating to the type of prodcut/s they want to find.
* This keyword will return relevant searches by comparing it against the following
* Product name
* Product description
* Artist name
* Genre
*/

import nz.ac.auckland.se754.demo.server.ProductServer;
import nz.ac.auckland.se754.demo.entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class ProductsTest {

    @Mock
ProductServer productServer;

    List<Product> productList = new ArrayList<Product>();

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @BeforeEach
    public void getAProductsList(){
        Product p1 = new Product();
        Product p2 = new Product();
        p1.setName("name1");
        p1.setDescription("description1");
        p1.setArtistName("artist name1");
        p1.setGenre("genre1");
        p2.setName("name2");
        p2.setDescription("description2");
        p2.setArtistName("artist name2");
        p2.setGenre("genre2");
        productList.add(p1);
        productList.add(p2);
    }

    @Test
    public void when_searchAKeyword_thenReturnProductsList(){

        Mockito.when(productServer.searchProductsByKeywords("Maori")).thenReturn(productList);
        List<Product> products = productServer.searchProductsByKeywords("Maori");
        Assertions.assertEquals(2,products.size());
        Mockito.verify(productServer,Mockito.times(1)).searchProductsByKeywords(Mockito.anyString());
    }
}
