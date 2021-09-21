package com.dowglasmaia.maiavendas.controllers;

import com.dowglasmaia.maiavendas.entities.dto.SaleDTO;
import com.dowglasmaia.maiavendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    // exc = consulta com paginação: http://localhost:8080/api/v1/sales?page=0&size=5&sort=date,desc
    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        var response = service.findAll(pageable);
        return ResponseEntity.status( HttpStatus.OK ).body(response);
    }

}
