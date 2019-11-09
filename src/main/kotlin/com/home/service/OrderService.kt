package com.home.service

import com.home.entity.dao.OrderDAO
import com.home.entity.dto.OrderDTO
import com.home.repository.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderService(
        val repository: OrderRepository
) {

    fun getById(id: Long): OrderDTO {
        return repository.getById(id)
    }

    fun save(orderDAO: OrderDAO): OrderDAO{
        return repository.save(orderDAO)
    }

}