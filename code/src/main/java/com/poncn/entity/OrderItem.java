package com.poncn.entity;

import lombok.Data;

import java.util.List;

@Data
public class OrderItem {

    private long id;
    private long pid;
    private List<Product> OIProduct;
    private long oid;
    private Order OIOrder;
    private long uid;
    private long number;
    private double totalPrice;
}
