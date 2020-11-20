package com.example.allaboutgraphql.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "products")
data class Product(
        @Id
        val id: String,
        val name: String,
        val price: BigDecimal
)