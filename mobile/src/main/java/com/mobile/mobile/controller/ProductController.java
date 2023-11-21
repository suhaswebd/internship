package com.mobile.mobile.controller;

import com.mobile.mobile.entity.AddProduct;
import com.mobile.mobile.repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")

public class ProductController {
    @Autowired
    public Productrepo prepo;
    @PostMapping("/Addproduct")
    public ResponseEntity<?> addProduct(@RequestBody AddProduct obj )
    {
        prepo.save(obj);
        return new ResponseEntity<>("Item added successfully", HttpStatus.OK);
    }

    @GetMapping("/GetProduct")
    public ResponseEntity<?> getProduct(){
        var data = prepo.findAll();
        return new ResponseEntity<>(data,HttpStatus.OK);

    }

}
