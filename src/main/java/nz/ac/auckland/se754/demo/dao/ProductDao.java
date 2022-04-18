package nz.ac.auckland.se754.demo.dao;

import nz.ac.auckland.se754.demo.entity.Product;

import java.util.List;

public interface ProductDao {

    public abstract List<Product> searchByKeywords(String keywords);
}
