package com.example.jpasample.repository;

import com.example.jpasample.domain.StoreItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<StoreItem, Long> {

}
