package com.home.entity.dao

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class OrderDAO(
        @Id
        val id: Long,
        val name: String,
        val age: Int
)