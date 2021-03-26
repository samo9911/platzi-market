package com.paltzi.market.domain.repository;

import com.paltzi.market.domain.Product;

import java.util.List;
import java.util.Optional;

public abstract class ProductRespository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);

    public abstract List<Product> getAll();

    public abstract Optional<List<Product>> getByCategory(int categoryId);

    public abstract Optional<List<Product>> getScarseProducts(int quanty);

    public abstract Optional<Product> getProduct(int productId);

    public abstract Product save(Product product);

    void delete(int productId);

    public abstract void delete(int productId);
}
