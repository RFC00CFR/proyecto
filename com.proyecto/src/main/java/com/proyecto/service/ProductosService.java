package com.proyecto.service;

import com.proyecto.entity.Productos;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.repository.ProductosRepository;

@Service
public class ProductosService implements IProductosService {

    @Autowired
    private ProductosRepository productosRepository;


    @Override
    public List<Productos> getAllProductos() {
        return (List<Productos>) productosRepository.findAll();
    }

    @Override
    public void createProductos(Productos productos) {
        productosRepository.save(productos);
    }

    @Override
    public Productos getProductosById(long id) {
        return productosRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProductos(long id) {
        productosRepository.deleteById(id);
    }

    @Override
    public boolean existeProductosById(long id) {
        return productosRepository.existsById(id);
    }
    
}
