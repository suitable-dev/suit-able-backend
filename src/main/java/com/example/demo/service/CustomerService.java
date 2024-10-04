package com.example.demo.service;

import com.example.demo.doa.Transaction;
import com.example.demo.doa.TransferDto;
import com.example.demo.repo.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class CustomerService {
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    private final CustomerRepo customerRepo;

    public String transfer(TransferDto transferDto) {
        Transaction transaction = new Transaction();
        transaction.setAmount(transferDto.getAmount());
        transaction.setDate(String.valueOf(new Date()));
        transaction.setTransaction_id(UUID.randomUUID().toString());
        transaction.setType("bank transfer");
        transaction.setReceiver(transferDto.getReceiver());
        transaction.setSender(transferDto.getSender());
        transaction.setStatus("sent");
        customerRepo.save(transaction);

        return "return transfer successful";
    }

    public int getBal(String userid) {

        return 0;
    }

    // todo : implement the send and receive function
}
