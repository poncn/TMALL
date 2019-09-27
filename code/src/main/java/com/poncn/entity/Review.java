package com.poncn.entity;

import lombok.Data;

@Data
public class Review {

  private long id;
  private String content;
    private User user;
  private long pid;
  private java.sql.Timestamp createDate;

}
