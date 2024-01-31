package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PurchaseController {

    @GetMapping("/purchase/success")
    public String displayPurchaseSuccess() {
        return "success"; // Return the success.html template
    }

    @GetMapping("/purchase/error")
    public String displayPurchaseError() {
        return "error"; // Return the error.html template
    }
}
