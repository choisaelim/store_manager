package com.example.jpasample;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import com.example.jpasample.domain.Store01;
import com.example.jpasample.domain.Store02;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitDb {
  private final InitService initService;

  @PostConstruct
  public void init() throws Exception {
    initService.dbInit1();
  }

  @Component
  @Transactional
  @RequiredArgsConstructor
  static class InitService {
    private final EntityManager em;

    public void dbInit1() throws Exception {
      Store01 product1 = Store01.createProduct("productA", 1000, "Samsung", "Protein");
      em.persist(product1);
      Store01 product2 = Store01.createProduct("productB", 3000, "LG", "fat");
      em.persist(product2);
      Store01 product3 = Store01.createProduct("productC", 2500, "SKT", "Vitamin");
      em.persist(product3);

      Store02 product4 = Store02.createProduct("productB", 2000, "LG", "fat");
      em.persist(product4);

    }

  }
}
