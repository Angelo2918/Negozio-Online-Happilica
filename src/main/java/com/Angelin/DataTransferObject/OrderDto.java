package com.Angelin.DataTransferObject;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@ToString
public class OrderDto implements Serializable {

    private String product;
    private Double price;
    private LocalDate orderDate;

}
