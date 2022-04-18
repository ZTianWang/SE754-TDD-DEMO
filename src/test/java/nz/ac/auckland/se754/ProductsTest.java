package nz.ac.auckland.se754;

/*
* Within the search bar, the user is able to type any key words they want relating to the type of prodcut/s they want to find.
* This keyword will return relevant searches by comparing it against the following
* Product name
* Product description
* Artist name
* Genre
*/

import nz.ac.auckland.se754.demo.controller.ProductController;
import nz.ac.auckland.se754.demo.dao.ProductDao;
import nz.ac.auckland.se754.demo.dao.daoImpl.ProductDaoImpl;
import nz.ac.auckland.se754.demo.entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;

import java.util.List;

public class ProductsTest {

//    @Mock
//    ProductDao productDao = new ProductDaoImpl();

    @Mock
    Product product;

    List<Product> productList;

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
        ProductDao productDao = new ProductDaoImpl();
        Mockito.when(productDao.searchByKeywords("Maori")).thenReturn(productList);
        ProductController productController = new ProductController();
        List<Product> products = productController.searchProductsByKeywords("Maori");
        Assertions.assertEquals(2,products.size());
        Assertions.assertTrue(productDao instanceof ProductDaoImpl);
        Mockito.verify(productDao,Mockito.times(1)).searchByKeywords(Mockito.anyString());
    }
}
