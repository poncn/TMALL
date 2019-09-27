package com.poncn.entity;

import lombok.Data;

@Data
public class PropertyValue {

  private long id;
  private long pid;
  private Property property;
  private String value;

}
