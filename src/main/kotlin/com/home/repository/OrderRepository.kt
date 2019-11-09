package com.home.repository

import com.home.entity.dao.OrderDAO
import com.home.entity.dto.OrderDTO
import org.springframework.data.mongodb.repository.MongoRepository

interface OrderRepository: MongoRepository<OrderDAO, Long> {

    fun getById(id: Long): OrderDTO
}
