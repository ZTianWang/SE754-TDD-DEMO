package nz.ac.auckland.se754.demo.dao.daoImpl;

import nz.ac.auckland.se754.demo.dao.ProductDao;
import nz.ac.auckland.se754.demo.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Product> searchByKeywords(String keywords) {
        return new ArrayList<Product>();
    }
}
