package nz.ac.auckland.se754.demo.controller;

import nz.ac.auckland.se754.demo.dao.ProductDao;
import nz.ac.auckland.se754.demo.dao.daoImpl.ProductDaoImpl;
import nz.ac.auckland.se754.demo.entity.Product;

import java.util.List;

public class ProductController {

    private ProductDao productDao = new ProductDaoImpl();
    public List<Product> searchProductsByKeywords(String keywords){
        return productDao.searchByKeywords(keywords);
    }
}
