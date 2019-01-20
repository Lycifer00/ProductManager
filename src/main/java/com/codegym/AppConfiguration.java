package com.codegym;

import com.codegym.repository.ProductRepository;
import com.codegym.repository.ProductRepositoryImpl;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.codegym")
public class AppConfiguration {
    @Bean(name = "productService")
    public ProductService getProductService() {
        return new ProductServiceImpl();
    }

    @Bean(name = "productRepository")
    public ProductRepository getProductRepository() {
        return new ProductRepositoryImpl();
    }

}
