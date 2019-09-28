package com.poncn.entity;

import lombok.Data;

import java.util.List;

@Data
public class Product {

  private long id;
  private String name;
  private String subTitle;
  private float originalPrice;
  private float promotePrice;
  private long stock;
  private long cid;
  private Category category;
  private List<ProductImage> productImage;
  private java.sql.Timestamp createDate;
  private long productImg;
  private long reviewCount;
}
