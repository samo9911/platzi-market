package com.paltzi.market.persistence;

import com.paltzi.market.persistence.entity.Producto;
import com.paltzi.market.persistence.crud.ProductoCrudRepository;
import java.util.List;

public class ProductoRespository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
