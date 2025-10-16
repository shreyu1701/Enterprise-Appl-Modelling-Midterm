package com.sk.week7.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.week7.model.Checking;
import com.sk.week7.repo.CheckingRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CheckingService {


@Autowired
private CheckingRepository checkingRepository;


public Mono<Checking> createChecking(Checking checking) {
return checkingRepository.save(checking);
}


public Flux<Checking> getAllChecking() {
return checkingRepository.findAll();
}
}
