package com.example.allaboutgraphql.service

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.allaboutgraphql.model.Product
import com.example.allaboutgraphql.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(val productRepository: ProductRepository): GraphQLQueryResolver {

    fun getAllProducts(): List<Product> = productRepository.findAll()
}