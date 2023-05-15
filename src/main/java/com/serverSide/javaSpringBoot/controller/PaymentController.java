package com.serverSide.javaSpringBoot.controller;

import com.serverSide.javaSpringBoot.dto.PaymentDto;
import com.serverSide.javaSpringBoot.dto.inheritance.PaypalPaymentDto;
import com.serverSide.javaSpringBoot.manager.PaymentManager;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/payments")
@AllArgsConstructor
public class PaymentController {

    private final PaymentManager paymentManager;

    @PostMapping(value = "/paypal")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public PaypalPaymentDto createPaypalPayment(@RequestBody PaypalPaymentDto paymentDto){
        return paymentManager.createPayPalPayment(paymentDto);
    }

    @GetMapping(value = "/paypal")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String test(){
        return "test ok...";
    }

    /*private final PaymentManager paymentManager;
    @PostMapping*/
   /* public PaymentDto createPayment(@RequestBody PaymentDto paymentDto){
        return paymentManager.createPayment(paymentDto);
    }*/

   /* @GetMapping
    public List<PaymentDto> getAllPayment(){
        return paymentManager.getAllPayment();
    }

    @GetMapping(path = "/{payment_id}")
    public PaymentDto getPaymentById(@PathVariable long payment_id){
        return paymentManager.getPaymentById(payment_id);
    }

    @PutMapping
    public PaymentDto updatePaymentById(@RequestBody PaymentDto paymentDto){
        return paymentManager.updatePayment(paymentDto);
}

    @DeleteMapping(path = "/{payment_id}")
    public ResponseEntity<String> deleteProductById(@PathVariable long payment_id){
        try{
            paymentManager.deletePaymentById(payment_id);
            return new ResponseEntity<>("Payment with id + " + payment_id + " has been deleted successfully.", HttpStatus.OK);
        }catch (Exception excp){
            System.out.println(excp.getMessage());
            return new ResponseEntity<>("Payment with " + payment_id + " not found", HttpStatus.NOT_FOUND);
        }

    }*/
}
