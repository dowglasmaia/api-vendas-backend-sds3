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
public class SaleSumDTO implements Serializable {

    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum) {
        sellerName = seller.getName();
        this.sum = sum;
    }
}
