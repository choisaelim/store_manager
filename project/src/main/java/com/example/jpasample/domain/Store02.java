package com.example.jpasample.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_STORE_02")
@Getter
@Setter
public class Store02 extends StoreItem {

  public static Store02 createProduct(String name, int price, String maker, String nutrition) {
    Store02 product = new Store02();
    product.setName(name);
    product.setPrice(price);
    product.setMaker(maker);
    product.setNutrition(nutrition);
    return product;
  }
}
