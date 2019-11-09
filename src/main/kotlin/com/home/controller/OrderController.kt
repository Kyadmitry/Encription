package com.home.controller

import com.home.entity.dto.OrderDTO
import com.home.entity.dto.toOrderDAO
import com.home.service.OrderService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/order")
class OrderController(
        val orderService: OrderService
) {

    @PostMapping
    fun saveOrder(@RequestBody orderDTO: OrderDTO): ResponseEntity<OrderDTO> {
        orderService.save(toOrderDAO(orderDTO))
        return ResponseEntity.ok(orderDTO)
    }


    @GetMapping("/{id}")
    fun getOrderData(@PathVariable id: Long): OrderDTO {
        return orderService.getById(id)
    }
}