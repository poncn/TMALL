package com.poncn.entity;

import lombok.Data;

import java.util.List;

@Data
public class Category {

    private List<Product> products;
  private long id;
  private String name;
}
