package com.sk.week7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.week7.model.Savings;
import com.sk.week7.repo.SavingsRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class SavingsService {


@Autowired
private SavingsRepository savingsRepository;


public Mono<Savings> createSavings(Savings savings) {
return savingsRepository.save(savings);
}


public Flux<Savings> getAllSavings() {
return savingsRepository.findAll();
}
}