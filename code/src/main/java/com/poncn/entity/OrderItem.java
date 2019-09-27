package com.poncn.entity;

import lombok.Data;

import java.util.List;

@Data
public class OrderItem {

  private long id;
    private List<Product> OIProduct;
    private Order OIOrder;
  private long uid;
  private long number;
    private double totalPrice;
}
