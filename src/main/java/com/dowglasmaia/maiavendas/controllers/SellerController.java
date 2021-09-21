package com.dowglasmaia.maiavendas.controllers;

import com.dowglasmaia.maiavendas.entities.dto.SellerDTO;
import com.dowglasmaia.maiavendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sellers")
public class SellerController {

    @Autowired
    private SellerService service;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        var response = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
