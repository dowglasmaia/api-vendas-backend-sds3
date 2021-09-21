package com.dowglasmaia.maiavendas.repository;

import com.dowglasmaia.maiavendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
