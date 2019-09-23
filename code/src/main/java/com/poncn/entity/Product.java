package com.poncn.entity;

import lombok.Data;

@Data
public class Product {

  private long id;
  private String name;
  private String subTitle;
  private double originalPrice;
  private double promotePrice;
  private long stock;
  private long cid;
  private java.sql.Timestamp createDate;

}
