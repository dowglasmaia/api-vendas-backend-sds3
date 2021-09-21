package com.dowglasmaia.maiavendas.services;

import com.dowglasmaia.maiavendas.entities.Seller;
import com.dowglasmaia.maiavendas.entities.dto.SellerDTO;
import com.dowglasmaia.maiavendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO>findAll(){
         var result = repository.findAll();
         return  result.stream().map( entity -> new SellerDTO( entity )).collect(Collectors.toList());
    }

}
