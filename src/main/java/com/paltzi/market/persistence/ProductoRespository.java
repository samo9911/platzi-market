package com.paltzi.market.persistence;

import com.paltzi.market.persistence.entity.Producto;
import com.paltzi.market.persistence.crud.ProductoCrudRepository;
import java.util.List;
import java.util.Optional;

public class ProductoRespository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
    public List<Producto> getByCategoria(int idCategoria){
       return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);

    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, estado:true);
    }
}
