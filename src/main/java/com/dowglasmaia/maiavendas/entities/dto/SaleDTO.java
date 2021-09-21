package com.dowglasmaia.maiavendas.entities.dto;

import com.dowglasmaia.maiavendas.entities.Sale;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleDTO implements Serializable {

    private Long id;
    private Integer deals;
    private Double amount;
    private Integer visited;
    private LocalDate date;
    private SellerDTO seller;

    public SaleDTO(Sale entity) {
       id = entity.getId();
       deals = entity.getDeals();
       amount = entity.getAmount();
       visited = entity.getVisited();
       date = entity.getDate();
       seller = new SellerDTO( entity.getSeller() );
    }
}
