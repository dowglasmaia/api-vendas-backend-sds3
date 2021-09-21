package com.dowglasmaia.maiavendas.repository;

import com.dowglasmaia.maiavendas.entities.Sale;
import com.dowglasmaia.maiavendas.entities.dto.SaleSuccessRateDTO;
import com.dowglasmaia.maiavendas.entities.dto.SaleSumDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.dowglasmaia.maiavendas.entities.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            "FROM Sale AS obj GROUP BY obj.seller ")
    Set<SaleSumDTO>getAmountGroupBySeller();

    @Query("SELECT new com.dowglasmaia.maiavendas.entities.dto.SaleSuccessRateDTO(" +
            "obj.seller, " +
            "SUM(obj.visited)," +
            "SUM(obj.deals) )" +
            "FROM Sale AS obj GROUP BY obj.seller ")
    Set<SaleSuccessRateDTO>getSuccessRateGroupBySeller();

}
