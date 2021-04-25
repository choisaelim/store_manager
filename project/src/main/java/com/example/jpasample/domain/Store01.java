package com.example.jpasample.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_STORE_01")
@Getter
@Setter
public class Store01 extends StoreItem {

  public static Store01 createProduct(String name, int price, String maker, String nutrition) {
    Store01 product = new Store01();
    product.setName(name);
    product.setPrice(price);
    product.setMaker(maker);
    product.setNutrition(nutrition);
    return product;
  }
}
