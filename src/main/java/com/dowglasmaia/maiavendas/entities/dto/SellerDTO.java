package com.dowglasmaia.maiavendas.entities.dto;

import com.dowglasmaia.maiavendas.entities.Seller;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    public  SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }

}
