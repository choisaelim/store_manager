package com.example.jpasample.api;

import java.util.List;

import javax.persistence.EntityManager;

import com.example.jpasample.domain.QStore01;
import com.example.jpasample.domain.QStore02;
import com.example.jpasample.domain.Store01;
import com.example.jpasample.domain.Store02;
import com.example.jpasample.domain.StoreItem;
import com.example.jpasample.service.StoreService;
import com.querydsl.jpa.impl.JPAQueryFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {

  private final StoreService storeService;

  @Autowired
  EntityManager em;

  @GetMapping("api/v1/updatestoredata")
  public List<StoreItem> updateStoreData(@RequestParam("productName") String productName) {

    QStore01 qStore01 = QStore01.store01;
    QStore02 qStore02 = QStore02.store02;

    JPAQueryFactory query = new JPAQueryFactory(em);
    // productName으로 받은 상품 이름과 같은 상품이 각 매장에 있는지 검색
    List<Store01> store1list = query.selectFrom(qStore01).where(qStore01.name.eq(productName)).fetch();
    List<Store02> store2list = query.selectFrom(qStore02).where(qStore02.name.eq(productName)).fetch();
    if (store1list.size() > 0) {
      Store01 store1Item = store1list.get(0);

      // Insert - sus_01 점포에 있는 상품이 sus_02 점포에 없는 경우
      if (store2list.size() == 0) {
        Store02 store2Item = new Store02();
        store2Item.setName(store1Item.getName());
        store2Item.setPrice(store1Item.getPrice());
        store2Item.setMaker(store1Item.getMaker());
        store2Item.setNutrition(store1Item.getNutrition());
        storeService.saveStoreProduct(store2Item);
        // Update - sus_01 점포에 있는 상품이 sus_02 점포에 없는 경우
      } else {
        Store02 store2Item = query.selectFrom(qStore02).where(qStore02.name.eq(productName)).fetchFirst();
        store2Item.setPrice(store1Item.getPrice());
        store2Item.setMaker(store1Item.getMaker());
        store2Item.setNutrition(store1Item.getNutrition());
        storeService.saveStoreProduct(store2Item);
      }
    }

    return storeService.getStoreProduct();
  }

}
