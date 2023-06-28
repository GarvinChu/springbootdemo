package com.utah.controller;

import com.utah.dto.UserOrder4Create;
import com.utah.service.UserOrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private UserOrderServiceImpl userOrderService;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void submitOrder(@RequestBody UserOrder4Create request) {
        userOrderService.submitOrder(request);
    }

}
