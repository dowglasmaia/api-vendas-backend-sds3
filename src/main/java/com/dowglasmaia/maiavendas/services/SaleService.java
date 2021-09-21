package com.dowglasmaia.maiavendas.services;

import com.dowglasmaia.maiavendas.entities.Sale;
import com.dowglasmaia.maiavendas.entities.dto.SaleDTO;
import com.dowglasmaia.maiavendas.repository.SaleRepository;
import com.dowglasmaia.maiavendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;
    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll(); /* buscando todos os vendedores - para JPA criar um cache na memoria com os mesmo, e evitar ir varias vezes na base buscar os vendedores de cada venda.
                                        e ganhando mas performasse */
        Page<Sale> result = repository.findAll(pageable);
        return result.map(entity -> new SaleDTO(entity));
    }

}
