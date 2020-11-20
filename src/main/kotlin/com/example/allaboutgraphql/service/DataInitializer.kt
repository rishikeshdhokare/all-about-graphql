package com.example.allaboutgraphql.service

import com.example.allaboutgraphql.model.Product
import com.example.allaboutgraphql.repository.ProductRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal
import javax.annotation.PostConstruct

@Service
class DataInitializer(val productRepository: ProductRepository) {

    @PostConstruct
    fun loadInitialData() {
        val product1 = Product("111", "Test Product 111", BigDecimal.valueOf(19.99))
        val product2 = Product("222", "Test Product 222", BigDecimal.valueOf(29.99))
        val product3 = Product("333", "Test Product 333", BigDecimal.valueOf(39.99))
        val product4 = Product("444", "Test Product 444", BigDecimal.valueOf(49.99))
        productRepository.saveAll(listOf(product1, product2, product3, product4))
        print("initial product data loaded successfully!")
    }
}