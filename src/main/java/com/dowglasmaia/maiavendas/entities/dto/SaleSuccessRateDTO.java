package com.dowglasmaia.maiavendas.entities.dto;

import com.dowglasmaia.maiavendas.entities.Seller;
import lombok.*;

import java.io.Serializable;

/**@author  Dowglas maia */

/**@since  Representa  os Dados do vendedor e o total de vendas */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleSuccessRateDTO implements Serializable {

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessRateDTO(Seller seller, Long visited,Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}
