package com.sk.week7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sk.week7.model.Checking;
import com.sk.week7.model.Savings;
import com.sk.week7.service.CheckingService;
import com.sk.week7.service.SavingsService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/account")
public class AccountController {


@Autowired
private CheckingService checkingService;


@Autowired
private SavingsService savingsService;


@PostMapping("/checking")
public Mono<Checking> addChecking(@RequestBody Checking checking) {
return checkingService.createChecking(checking);
}


@GetMapping("/checking")
public Flux<Checking> getChecking() {
return checkingService.getAllChecking();
}


@PostMapping("/savings")
public Mono<Savings> addSavings(@RequestBody Savings savings) {
return savingsService.createSavings(savings);
}


@GetMapping("/savings")
public Flux<Savings> getSavings() {
return savingsService.getAllSavings();
}
}