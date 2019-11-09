package com.home.entity.dto

import com.home.entity.dao.OrderDAO


data class OrderDTO(
        val id: Long,
        val name: String,
        val age: Int
)

fun toOrderDAO(orderDTO: OrderDTO) = OrderDAO(
        id = orderDTO.id,
        name = orderDTO.name,
        age = orderDTO.age
)