package com.example.allaboutgraphql.repository

import com.example.allaboutgraphql.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.math.BigDecimal

@Repository
interface ProductRepository: JpaRepository<Product, String> {

    @Query("UPDATE products SET price = ?2 WHERE id = ?1", nativeQuery = true)
    fun updateProductPrice(productId: String, newPrice: BigDecimal)
}