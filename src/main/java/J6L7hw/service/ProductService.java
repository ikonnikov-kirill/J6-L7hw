package J6L7hw.service;

import J6L7hw.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(int id);


}
