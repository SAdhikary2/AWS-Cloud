package com.sukalyan.rds.controller;
import com.sukalyan.rds.entity.Product;
import com.sukalyan.rds.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @PostMapping("/product")
    public Product save(@RequestBody Product product) {
        return repo.save(product);
    }

    @GetMapping("/products")
    public List<Product> getAll() {
        return repo.findAll();
    }
}