package com.example.allaboutgraphql.repository

import com.example.allaboutgraphql.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, String>