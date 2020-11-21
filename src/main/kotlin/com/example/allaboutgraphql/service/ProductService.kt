package com.example.allaboutgraphql.service

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.allaboutgraphql.model.Product
import com.example.allaboutgraphql.repository.ProductRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class ProductService(val productRepository: ProductRepository): GraphQLQueryResolver, GraphQLMutationResolver {

    fun getAllProducts(): List<Product> = productRepository.findAll()

    fun updateProductPrice(productId: String, newPrice: BigDecimal): Product {
        productRepository.updateProductPrice(productId, newPrice)
        return productRepository.findById(productId).get()
    }
}