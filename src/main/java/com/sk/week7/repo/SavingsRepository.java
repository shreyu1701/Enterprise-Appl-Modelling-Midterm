package com.sk.week7.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.sk.week7.model.Savings;


@Repository
public interface SavingsRepository extends ReactiveMongoRepository<Savings, String> {
}