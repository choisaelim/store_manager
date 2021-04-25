package com.example.jpasample.service;

import java.util.List;

import com.example.jpasample.domain.StoreItem;
import com.example.jpasample.repository.StoreRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreService {
	private final StoreRepository storeRepository;

	public List<StoreItem> getStoreProduct() {
		return storeRepository.findAll();
	}

	@Transactional
	public StoreItem saveStoreProduct(StoreItem item) {
		storeRepository.save(item);
		return item;
	}
}
