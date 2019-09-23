package com.poncn.entity;

import lombok.Data;

@Data
public class Order {

  private long id;
  private String orderCode;
  private String address;
  private String post;
  private String receiver;
  private String mobile;
  private String userMessage;
  private java.sql.Timestamp createDate;
  private java.sql.Timestamp payDate;
  private java.sql.Timestamp deliveryDate;
  private java.sql.Timestamp confirmDate;
  private long uid;
  private String status;
}
