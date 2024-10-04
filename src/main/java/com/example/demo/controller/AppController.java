package com.example.demo.controller;


import com.example.demo.doa.TransferDto;
import com.example.demo.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mock/banking/app")
public class AppController {
    private final CustomerService customerService;

    public AppController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/balance")
    public int getBalance (@RequestParam String userid) {
     return customerService.getBal(userid);
    }

    @PostMapping("/transfer")
    public String transfer (@RequestBody TransferDto transferDto) {
        // todo : remove this and add the function to the service that will send the transaction
        return customerService.transfer(transferDto);
    }


}
